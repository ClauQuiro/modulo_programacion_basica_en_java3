Proceso PROM_N_NOTAS
	Definir SUM,CANT,I,NUM Como Entero
	SUM <- 0
	CANT <- 0
	Escribir 'Cuantas notas quiere?'
	Leer CANT
	Para I<-1 Hasta CANT Hacer
		Escribir 'Ingrese NOTA'
		Leer NUM
		SUM <- SUM+NUM
	FinPara
	Escribir 'El primedio de sus notas es: ',SUM/CANT
FinProceso
