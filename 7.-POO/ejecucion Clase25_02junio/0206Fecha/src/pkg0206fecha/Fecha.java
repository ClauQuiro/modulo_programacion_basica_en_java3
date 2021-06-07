/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0206fecha;

/**
 *
 * @author quiro
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Fecha {
    private int dia ;
    private int mes;
    private int anio;
    private String mensaje;
    
    
    public void setDia(int dia){
        this.dia = dia;
        }
    public int getDia() {
        return (dia);
    }
     public void setMes(int mes){
        this.mes = mes;
        }
    public int getMes() {
        return (mes);
    }
     public void setAnio(int anio){
        this.anio = anio;
        }
    public int getAnio() {
        return (anio);
    }
     public String getmensaje() {
        return (mensaje);
    }
   //constructor 1
    public Fecha()
    {
        this.dia = -1;
        this.mes = -1;
        this.anio = -1;
                
    }
    //constructor2
    public Fecha(int dia,int mes,int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    
    public boolean fechaCorrecta(){
        boolean fecOK = false;
        
        
         switch (mes)
        {
            case 1: if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto";
                    break;
            case 3: if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                     break;   
            case 5: if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                      break;
            case 7: if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                      break;
            case 8: if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                      break;
            case 10: if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                      break; 
            case 12:if (dia<1 || dia >31)fecOK = false;
                    mensaje = "Dia Incorrecto";  
                      break; 
            case 4:if (dia>0 && dia <31)fecOK = true;
                    mensaje = "Dia Incorrecto"; 
                       break;
                       
            case 6:if (dia<1 || dia >30)fecOK = false;
                    mensaje = "Dia Incorrecto";  
                       break;
            case 9:if (dia<1 ||dia >30)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                        break; 
            case 11:if (dia<1 ||dia >30)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                         break;
            case 2 :if (dia<1 ||dia >29)fecOK = false;
                    mensaje = "Dia Incorrecto"; 
                         break;
            default:
                       fecOK = false;
                    mensaje = "Mes Incorrecto"; 
                break;
        }
         if (fecOK == true){
              
             if (anio < 1000|| anio >9999){
                 fecOK = false;
                 mensaje = "Año incorrecto";
                 
             }
             
         }
         return fecOK;
        
    }
    
    
    
    public  Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
    public  void sumardia(Date dt) {
        // TODO code application logic here
        //Date dt = new Date();
        System.out.println("hoy es : "+dt);
        
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();
        System.out.println("Tomorrow: "+dt);
    }
    
}
        
        
         