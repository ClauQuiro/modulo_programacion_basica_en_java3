/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclassabstract;

/**
 *
 * @author quiro
 */
public class Hincha extends Persona{

    @Override
    public void pensar() {
        System.out.println("Todos los hinchas piensan");
    }

    @Override
    public void comer(String TipoComida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
