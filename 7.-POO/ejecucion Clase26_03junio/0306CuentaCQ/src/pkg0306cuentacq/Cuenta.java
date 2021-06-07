/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0306cuentacq;

/**
 *
 * @author quiro
 */
public class Cuenta {
    private String nombreclte;
    private String nrocta;
    private double saldo;
    private String nombreclte2;
    private String nrocta2;
    private double saldo2;
   
   
    
     public void setNombreClte(String nombreclte)
     {
         this.nombreclte= nombreclte;
     }
     public void setNroCta(String nrocta)
     {
         this.nrocta = nrocta;
     }
     public void setSaldo(double saldo)
     {
         this.saldo = saldo;
     }
    
     public String getNombreClte()
     {
         return(nombreclte);
     }
     public String getNroCta()
     {
         return(this.nrocta);
     }
     public double getSaldo()
     {
         return(this.saldo);
     }
    
    // cuenta 2
     public void setNombreClte2(String nombreclte2)
     {
         this.nombreclte2= nombreclte2;
     }
     public void setNroCta2(String nrocta2)
     {
         this.nrocta2 = nrocta2;
     }
     public void setSaldo2(double saldo2)
     {
         this.saldo2 = saldo2;
     }
    
     public String getNombreClte2()
     {
         return(nombreclte2);
     }
     public String getNroCta2()
     {
         return(this.nrocta2);
     }
     public double getSaldo2()
     {
         return(this.saldo2);
     }
    
     
    
    public Cuenta(){
    }
    
     public  Cuenta(String nrocta2){
         this.nrocta2 = nrocta2;
         //this.saldo2 = saldo;
         
    }
    public void deposito(int num)
    {
        
          saldo = saldo + num;
        
        
    }
     public void giro(int num)
    {
        if(saldo >0.0){
          saldo = saldo - num;
        }
        
    }
      public void transferir(int num)
    {
        if(saldo >0.0){
          saldo = saldo - num;
          saldo2 = saldo2 + num;
        }
        
    }
     
}//FIN
