/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnologia;
import java.util.Scanner;
/**
 *
 * @author quiro
 */
public class Tecnologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num,minu,optTv,resultado,numNote,seguir;
        
        seguir = 1 ;
        String marca;
        while(seguir != 4){
        System.out.println("Que tecnologia desea ocupar? 1: Celular 2:Notebbok 3: Smartv 4:Salir");
        num = leer.nextInt();
             if (num == 1){
                                        
                    System.out.println("Ingrese Minutos :");
                     minu = leer.nextInt();
                     Celular C1 = new Celular();
                    // C1.LLamar();
                    resultado= C1.CostoLLamar(minu);
                    System.out.println("El costo de la llamda es  :"+ resultado);
                    
             }
             if (num == 2){
                     System.out.println("1:Encender 2:Resetear 3: leercorreo");
                     numNote = leer.nextInt();
                     Notebook N1 = new Notebook();
                     N1.Accion(numNote);
             }
             if (num == 3){
                     Smartv S1 = new Smartv();
                     System.out.println("1:Marca,2:Apagar");
                     optTv = leer.nextInt();
                     if (optTv == 1) { 
                          
                          System.out.println("Ingrese marca :");
                          marca = leer.next();  
                          S1.Encender(marca);
                          
                     }
                      if (optTv == 2) { 
                          System.out.println("Ingrese minutos :");
                          minu = leer.nextInt();
                          S1.apagado(5);
                     }
                    
                     
             }
             if (num == 4){
                 seguir = 4;
             }
    }
    }
}
