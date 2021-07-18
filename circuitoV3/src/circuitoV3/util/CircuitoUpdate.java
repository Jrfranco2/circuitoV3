package circuitoV3.util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import circuitoV3.Sistema;
import circuitoV3.DataFlow;
import circuitoV3.And;
import circuitoV3.Compuerta;
import circuitoV3.Pulsador;

import circuitoV3.FlowElement;
import circuitoV3.Led;
import circuitoV3.Not;
import circuitoV3.Or;


public class CircuitoUpdate {
	
	public void updateModelState(Sistema s) {
		for (FlowElement todo : sortInTopologicalOrder(s)) {
			updateFlowBasedOnSource((FlowElement) todo, getAllElements(s));	
		}
	}
	private Set<FlowElement> getAllElements(Sistema s) {
		Set<FlowElement> r = Sets.newLinkedHashSet();
		Iterator<FlowElement> it = Iterators.filter(s.eAllContents(), FlowElement.class);
		while (it.hasNext()) {
			r.add(it.next());
		}
		return r;
	}
	private List<FlowElement> sortInTopologicalOrder(Sistema s) {
		List<FlowElement> result = Lists.newArrayList();
		Set<FlowElement> all = Sets.newLinkedHashSet();
		Deque<FlowElement> stack = new ArrayDeque<>();
		Set<FlowElement> visited = Sets.newLinkedHashSet();
		Iterators.addAll(all, Iterators.filter(s.eAllContents(), FlowElement.class));
		Iterator<FlowElement> it = Iterators.filter(s.eAllContents(), FlowElement.class);
		while (it.hasNext()) {
			FlowElement cur = it.next();
			if (!visited.contains(cur)) {
				doTopo(cur, visited, stack, all);
			}
		}
		while (!stack.isEmpty()) {
			FlowElement todo = stack.pop();
			result.add(todo);
		}
		return result;
	}

	private void doTopo(FlowElement cur, Set<FlowElement> visited, Deque<FlowElement> stack, Set<FlowElement> all) {
		visited.add(cur);

		Set<FlowElement> adjacents = Sets.newLinkedHashSet();
		for (FlowElement flowElement : all) {
			if (flowElement instanceof DataFlow && ((DataFlow) flowElement).getSource() == cur) {
				adjacents.add(flowElement);
			}
			if (cur instanceof DataFlow && ((DataFlow) cur).getTarget() == flowElement) {
				adjacents.add(flowElement);
			}
		}
		for (FlowElement flowElement : adjacents) {
			if (!visited.contains(flowElement)) {
				doTopo(flowElement, visited, stack, all);
			}
		}
		stack.push(cur);

	}
	private void updateFlowBasedOnSource(FlowElement element, Set<FlowElement> all) {
		if (element instanceof DataFlow) {
			if (((DataFlow) element).getSource() instanceof Pulsador) {
				((DataFlow) element).setEstado(((Pulsador) ((DataFlow) element).getSource()).isEstado());
			}
			if (((DataFlow) element).getSource() instanceof Compuerta) {
				((DataFlow) element).setEstado(((Compuerta) ((DataFlow) element).getSource()).isEstado());
			}
		}
		if (element instanceof Led) {
			for (DataFlow flow : Iterables.filter(all, DataFlow.class)) {
				if (flow.getTarget() == element) {
					((Led) element).setEstado(flow.isEstado());
				}
			}
		}
		if (element instanceof Compuerta) {
			int positivo = 0;
			int negativo = 0;
			boolean as = false;
			int contador = 0;
			for (DataFlow flow : Iterables.filter(all, DataFlow.class)) {
				if (flow.getTarget() == element) {
					if(flow.isEstado()==true) {
						as=flow.isEstado();
						positivo++;
					}
					else {
						as=flow.isEstado();
						negativo++;
					}
				}
			}
			contador= positivo+negativo;
			((Compuerta) element).setPin_total(contador);
			/////////
			if(element instanceof Not){
				((Compuerta) element).setEstado(!as);
			}
			if(element instanceof And) {
				if(contador==positivo) {
					((Compuerta) element).setEstado(true);
				}
				else {
					((Compuerta) element).setEstado(false);
				}
			}
			if(element instanceof Or) {
				if(contador==negativo) {
					((Compuerta) element).setEstado(false);
				}
				else {
					((Compuerta) element).setEstado(true);
				}
			}
		}
		
	}	
}
