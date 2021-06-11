/*0
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclassabstract;

/**
 *
 * @author quiro
 */
public class MainClassAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        jugadorFutbol J1 = new jugadorFutbol();
        J1.pensar();
        J1.comer("Tallarines");
        EntrenadorFutbol E1 = new EntrenadorFutbol();
        E1.pensar();
        
    }
    
}
