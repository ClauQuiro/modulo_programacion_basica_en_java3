Proceso chismefon
	Definir dia,Hora Como Caracter
	Definir duracion,valorbruto Como Entero
	Definir valorllamada Como Real
	valorbruto <- 0
	Escribir 'Ingrese dìa, hora (A:AM,P:PM)y duracion del llamado'
	Leer dia
	Leer Hora
	Leer duracion
	Si (duracion>10) Entonces
		valorbruto <- 5*100+3*80+2*70+(duracion-10)*50
	SiNo
		Si (duracion>8 Y duracion<10) Entonces
			valorbruto <- 5*100+3*8+(duracion-8)*70
		SiNo
			Si (duracion>5 Y duracion<=8) Entonces
				valorbruto <- 5*100+(duracion-5)*80
			SiNo
				valorbruto <- duracion*100
			FinSi
		FinSi
	FinSi
	Si (dia='D') Entonces
		valorllamada <- valorbruto*1.03
	SiNo
		Si (Hora='A') Entonces
			valorllamada <- valorbruto*1.15
		SiNo
			valorllamada <- valorbruto*1.1
		FinSi
	FinSi
	Escribir 'EL valor de la llamada es' valorllamada
FinProceso
