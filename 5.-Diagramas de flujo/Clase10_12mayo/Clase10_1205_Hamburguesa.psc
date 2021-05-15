Proceso CalcularvalorHamburguesa
	Definir TotalBoleta,cantidad Como Entero
	Definir tipo Como Caracter
	Escribir 'ingrese tipo de hamburguesa S:simple,D:doble,T:Triple'
	Leer tipo
	Escribir 'ingrese cantidad de hamburguesas'
	// 
	// 
	Leer cantidad
	Si tipo='S' Entonces
		TotalBoleta <- cantidad*2000
	SiNo
		Si tipo='D' Entonces
			TotalBoleta <- cantidad*2500
		SiNo
			Si tipo='T' Entonces
				TotalBoleta <- cantidad*2800
			FinSi
		FinSi
	FinSi
	Escribir 'Total:',TotalBoleta,' Tipo Hamburguesa :',tipo
FinProceso
