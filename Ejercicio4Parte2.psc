//202030799 Manuel Rojas
//Hallar la persona de mayor y menor edad, sabiendo que se
//leen datos correspondientes a 20 muestras.
Proceso Ejercicio4Parte2
	menorP <- ""
	mayorP <- ""
	menorE <- 0
	mayorE <- 0
	Para i<-1 Hasta 20 Con Paso 1 Hacer
		Leer nombre, edad
		Si edad > mayorE Entonces
			mayorP <- nombre
			mayorE <- edad
		SiNo
				menorP <- nombre
				menorE <- edad	
		FinSi
	Fin Para
	Escribir mayorP, " es la persona con mayor edad, con ", mayorE, " años. Y ", menorP, " es la persona con menor edad, con ", menorE, " años."
FinProceso
