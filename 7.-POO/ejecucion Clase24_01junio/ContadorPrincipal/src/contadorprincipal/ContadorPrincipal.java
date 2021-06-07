/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorprincipal;
import java.util.Scanner;
/**
 *
 * @author quiro
 */
public class ContadorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese valor inicial:");
        int ContInicial = leer.nextInt();
                     
        Contador C1 = new Contador(ContInicial);
        System.out.println("Ingrese Opcion 1:Incrementa 2: Decrementa");
        int op = leer.nextInt();
        if (op == 1) {
              
            C1.incrementa();
        }
         if (op == 2){
            C1.decrementa();
         }
         
          System.out.println("Valor contador :"+C1.getCont());
         
    }
    
}
