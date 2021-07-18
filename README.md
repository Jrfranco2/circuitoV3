# DSL Compuertas Lógicas
# Proceso de Instalación
1. Clonar el repositorio con el siguiente comando:
```bash
git clone https://github.com/Jrfranco2/circuitoV3.git
```
3. Descargar e instalar Eclipse Modelling Tools-2021-12 
4. Abrir Eclipse Modelling Tools
5. Importar los siguientes proyectos al area de trabajo (File->Open Projects from File System->Directory), abrir la carpeta circuitoV3 y seleccionar:
#### Circuito V3
#### Circuito V3 Edit
#### Circuito Editor
#### Circuito Events
![image](https://user-images.githubusercontent.com/23088391/126080315-6e8f6d29-8e2d-4d1e-b562-e57a7572f700.png)

4. Crear una nueva instancia de Eclipse (Run->Run Configurations->Eclipse Application)
![image](https://user-images.githubusercontent.com/23088391/126080368-ec6713c1-7c0e-4c28-9560-a47b439429f3.png)

6. Importar los siguientes proyectos de la carpeta 'runtime-sirius' como el paso 4, en la nueva instancia:
#### Circuito V3
#### Circuito Design
#### Circuito Acceleo
![image](https://user-images.githubusercontent.com/23088391/126080519-be203925-d0b0-45a0-ad9e-4290d7814b1c.png)

# Puesta en marcha
Para utilizar el aplicativo es necesario:
1. Abrir la carpeta circuitoV3->test.circuitov3->Sistema
   en el archivo Sistema dar click derecho New Representation->new sistema
![image](https://user-images.githubusercontent.com/23088391/126080565-14c0b2a9-ea8a-4ed7-bf74-0605b69b659f.png)

# Exportar codigo
1. Guardar el archivo new Sistema
2. Abrir la carpeta circuitoV3Acceleo->src->circuitoV3Acceleo.main
3. Dar click derecho en el archivo 'generate.mtl'->Run As-> Lunch Acceleo Application
![image](https://user-images.githubusercontent.com/23088391/126080850-ffdfc427-ed1c-4e10-8f2b-649d379e2aa9.png)

