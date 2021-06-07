/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author quiro
 */
public class Jugador {
    int jugador1,valordado,Avance;
    boolean retrocede;
    public Jugador() {
    
    }

   public int  Tirardado(){
        Random r1 = new Random();
        int valordado = r1.nextInt(6)+1;
        return valordado;
        //System.out.println("el valor del dado es "+valordado);
       }
   public int Avanzar(int Avance,int valordado){
       
       this.Avance = Avance + valordado;
       return this.Avance;
       
       
      
   }
   
   
   
   public boolean  validaReglaJuego(int Avanza){
       if (Avanza == 3){
           //System.out.println("Retrocede 3 espacios");
           // JOptionPane.showMessageDialog(null, "Retrocede 3 espacios");
           //Avanza = Avanza - 3;
           retrocede = true;
          
       }
        return retrocede;
           
   }                                             
        
}
       
