Proceso sin_titulo
	Definir cantidad,num,can,sum Como Entero
	can <- 0
	sum <- 0
	Escribir 'ingrese cantidad'
	Leer cantidad
	Mientras can<cantidad Hacer
		Escribir 'ingrese numero'
		Leer num
		sum <- sum+num
		can <- can+1
	FinMientras
	Escribir 'el valor total es:',sum
FinProceso
