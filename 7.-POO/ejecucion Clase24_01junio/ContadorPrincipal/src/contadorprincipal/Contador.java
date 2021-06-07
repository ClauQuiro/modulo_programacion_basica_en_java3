/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorprincipal;

/**
 *
 * @author quiro
 */
public class Contador {
    private int cont;

    public  Contador(int cont){
       this.cont = cont;
       if (this.cont < 0){
           this.cont = 0;
       }
 }
    public int getCont()
    {
        return this.cont;
    }
    
    public void setCont(int cont )
    {
        this.cont= cont ;
    }
    
   
    public void incrementa(){
        cont = cont + 1;
         }
    public void decrementa(){
       cont = cont -1;
    }
}