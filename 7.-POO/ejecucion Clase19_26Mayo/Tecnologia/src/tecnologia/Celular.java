/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnologia;

/**
 *
 * @author quiro
 */
public class Celular {
    
    public void LLamar()
    {
        System.out.println("Telefono llamando");
    }
     public int CostoLLamar(int minutos)
    {
        //System.out.println("Telefono llamando");
        int costo = minutos*10;
        
        return costo;
    }
    
}
