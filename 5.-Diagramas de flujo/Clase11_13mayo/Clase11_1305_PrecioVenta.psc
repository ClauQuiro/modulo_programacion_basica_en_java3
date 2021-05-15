Proceso CalcularPrecioVenta
	Definir MPri,Cpro,GFab,CMano,clave Como Entero
	Definir PreVen Como Real
	Escribir 'Ingrese materia Prima:'
	Leer MPri
	Escribir 'Ingrese clave:'
	Leer clave
	Si clave=3 O clave=4 Entonces
		CMano <- MPri*0.75
	SiNo
		Si clave=1 O clave=5 Entonces
			CMano <- MPri*0.80
		SiNo
			Si clave=2 O clave=6 Entonces
				CMano <- MPri*0.85
			FinSi
		FinSi
	FinSi
	Si clave=2 O clave=5 Entonces
		GFab <- MPri+(MPri*0.30)
	SiNo
		Si clave=3 O clave=6 Entonces
			GFab <- MPri+(MPri*0.35)
		SiNo
			Si clave=1 O clave=4 Entonces
				GFab <- MPri+(MPri*0.28)
			FinSi
		FinSi
	FinSi
	Cpro <- MPri+CMano+GFab
	PreVen <- Cpro+Cpro*0.45
	Escribir 'El precio de Venta para la clave ',clave,'es: ',PreVen
FinProceso
