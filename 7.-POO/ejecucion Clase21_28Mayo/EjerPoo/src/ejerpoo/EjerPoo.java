/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo;
import javax.swing.JOptionPane;

/**
 *
 * @author quiro
 */
public class EjerPoo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v1 = new Ventana(100,200);
        v1.setVisible(true);
         Ventana v2 = new Ventana(500,200);
        v2.setVisible(true);
        int Avanza1,Avanza2;
        Avanza1 = 0;
        Avanza2 = 0;
        for (int i=1;i <=8;i++){
            //JUgador1
            Jugador j1 = new Jugador();
            int valor= j1.Tirardado();
            Avanza1= j1.Avanzar(Avanza1, valor);
            System.out.println("\u001B[30m" +"Dado jugador 1: "+ valor+" \n  Logra Avanzar a la Posicion N :"+ Avanza1);
            v1.IniciarComponentes(Avanza1,1);       
            boolean retro =j1.validaReglaJuego(Avanza1);
            if (retro == true){
                  
                 JOptionPane.showMessageDialog(null, "Jugador 1 Retrocede 3 espacios");
                 Avanza1 = Avanza1 -3;
                   }
           
//            Jugador2
            Jugador j2 = new Jugador();
            valor = j2.Tirardado();
           Avanza2= j2.Avanzar(Avanza2, valor);
           System.out.println("\u001B[30m" +"Dado jugador 2: "+ valor+" \n  Logra Avanzar a la Posicion N :"+ Avanza2);
           v2.IniciarComponentes(Avanza2,2);
           retro =j2.validaReglaJuego(Avanza2);
           if (retro == true)
                   {
                   
             JOptionPane.showMessageDialog(null, "Jugador 2 Retrocede 3 espacios");
             Avanza2 = Avanza2 -3;
                   }
            
            //j1.validaReglaJuego(Avanza2);
        }
        if  (Avanza1 > Avanza2){
            JOptionPane.showMessageDialog(null, "Gana Jugador 1");
           // System.out.println("Ganador Jugador 1");
        }
         if  (Avanza1 < Avanza2){
             JOptionPane.showMessageDialog(null, "Gana Jugador 2");
           // System.out.println("Ganador Jugador 2");    
            
        }
         if (Avanza1 == Avanza2 ){
             //System.out.println("Empataron");   
             JOptionPane.showMessageDialog(null, "Empate de ambos jugadores");
         }
        
    }
    
}
