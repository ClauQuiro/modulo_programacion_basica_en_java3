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
public class Smartv {
    String color;
    //String marca;
    
    
     public void Encender(String marca)
    {
        
        System.out.println("Televisor encendido marca : "+ marca);
        
    }
    public void apagado(int minutos) 
    {
     for(int i=1 ;i<=minutos;i++)
     {
         System.out.println("Minutos transcurridos : "+ i);
    
    }
     System.out.println("\n TELEVISOR APAGADO");
  }
}

    

