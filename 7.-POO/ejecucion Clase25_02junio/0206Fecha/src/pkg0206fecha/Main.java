/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0206fecha;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;
//import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author quiro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String fecha;
        
        Scanner Leer = new Scanner (System.in);
        System.out.println("Ingrese Dia: ");
        int dia = Leer.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = Leer.nextInt();
        System.out.println("Ingrese Año: ");
        int anio = Leer.nextInt();
        Fecha fec = new Fecha();
        fec.setMes(mes);
        fec.setDia(dia);
        fec.setAnio(anio);
        Fecha fec2 = new Fecha(dia,mes,anio);
        
       // System.out.println("La fecha ingresada es: "+ fec.fechaCorrecta());
       // System.out.println("El error es: "+ fec.getmensaje());
        
      String fecha = dia + ""+"/"+mes +""+"/"+anio+"";
       //String fecha = String.valueOf(dia)+String.valueOf(mes)+String.valueOf(anio);
       //String fecha= Integer.toString(dia);

       System.out.println("Fecha en Strng : "+ fecha);
       Date fecdat =fec.ParseFecha(fecha);
      // System.out.println("Fecha en date : "+ fec.ParseFecha(fecha));
      fec.sumardia(fecdat);
       
                
    }
    
        
}
