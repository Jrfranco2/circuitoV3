void setup(){	
//pulsador
		pinMode(4,INPUT);
		pinMode(3,INPUT);
//led
		pinMode(5,OUTPUT);
		pinMode(0,OUTPUT);
}
void loop(){
//Estado Pulsador
		boolean Pulsador_1=digitalRead(4);
		boolean Pulsador_2=digitalRead(3);

//Estado Compuerta
		boolean Compuerta_And_1= false;
		boolean Compuerta_OR_1= false;
		boolean Compuerta_OR_2= false;
//AND Compuerta_And_1
		if(Pulsador_2==true)
		{
			Compuerta_And_1 = true;	
		}
		else{
			Compuerta_And_1 = false;
		}
//Or Compuerta_OR_1
		if(Pulsador_1==false && Compuerta_OR_2==false && )
		{
			Compuerta_OR_1 = false;	
		}
		else{
			Compuerta_OR_1 = true;
		}
//Or Compuerta_OR_2
		if(Pulsador_2==false)
		{
			Compuerta_OR_2 = false;	
		}
		else{
			Compuerta_OR_2 = true;
		}
//LED  Led_1
		if(Compuerta_OR_1==true )
		{
			digitalWrite(5, HIGH);	
		}
		else{
			digitalWrite(5, LOW);
		}
//LED  Led_2
		if(Compuerta_And_1==true )
		{
			digitalWrite(0, HIGH);	
		}
		else{
			digitalWrite(0, LOW);
		}
}
