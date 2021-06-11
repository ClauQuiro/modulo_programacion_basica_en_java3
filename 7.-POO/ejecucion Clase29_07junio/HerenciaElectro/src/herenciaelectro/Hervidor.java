/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectro;
import java.util.TimerTask;
import java.util.Timer;
/**
 *
 * @author quiro
 */
public class Hervidor extends Electrodomesticos {
   private  int litros;

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
 
  
   
   
   public Hervidor(){
        super();
        
    
    }
    
    public Hervidor(int peso,String color,double precio,int tamaño,String tipoLetra,int Litros){
        super(peso,color,precio,tamaño,tipoLetra);
        this.litros = litros;
    }
    
    public void hervir(){
        
    // Clase en la que está el código a ejecutar
     
             // Aquí el código que queremos ejecutar.
       for(int i = 0; i<=5 ;i++){
                System.out.println("Esperando que hierva");
            }
        System.out.println("Tetera Hervida de :"+litros + "Litros");
         }
     }
     

    
