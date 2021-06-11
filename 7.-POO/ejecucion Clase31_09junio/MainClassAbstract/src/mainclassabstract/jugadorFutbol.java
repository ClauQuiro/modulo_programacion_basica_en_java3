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
public class jugadorFutbol extends Persona{
    
    private String  TipoComida;

//    public jugadorFutbol()
//    {
//    }
//     public jugadorFutbol(String TipoComida)
//    {
//        this.TipoComida = TipoComida;
//    }
    
    @Override
    public void pensar() {
        System.out.println("Todas las personas piensan");
    }

    @Override
    public void comer(String TipoComida) {
        
        
            System.out.println("Comiendo:"+ TipoComida);
        
        
    }
    
}
