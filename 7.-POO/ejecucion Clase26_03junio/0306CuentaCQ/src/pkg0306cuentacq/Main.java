/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0306cuentacq;

import java.util.Scanner;

/**
 *
 * @author quiro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cuenta cta = new Cuenta();
        System.out.println("Ingrese nombre cliente :");
        String nombreclte = leer.next();
        System.out.println("Ingrese Numero de cuenta :");
        String nrocta = leer.next();
        System.out.println("Ingrese Saldo cuenta : ");
        double saldo = leer.nextDouble();
        
        cta.setNombreClte(nombreclte);
        cta.setNroCta(nrocta);
        cta.setSaldo(saldo);
        boolean salir=false;
        
        while(!salir){
        
             System.out.println("Ingrese opcion 1: Deposito 2:GIro 3:Transferencia 4:Salir :");
             int opcion = leer.nextInt();
             
             if (opcion == 1){
                 System.out.println("Ingrese monto:");
                 int monto = leer.nextInt();
                 cta.deposito(monto);
                  System.out.println("Transaccion exitosa: Monto Actual : "+ cta.getSaldo());
             }
             if (opcion == 2){
                 
                  if (cta.getSaldo() <= 0.0){
                      System.out.println("NO SE PUEDEN HACER MAS GIROS");
                                    }
                  else
                  {
                 
                 System.out.println("Ingrese monto GIRO:");
                 int giro = leer.nextInt();
                 cta.giro(giro);
                  System.out.println("Transaccion exitosa: Monto Actual : "+ cta.getSaldo());
                  }
             }
              if (opcion == 3){
                 
                 
                 
                 if (cta.getSaldo() <= 0.0){
                      System.out.println("NO SE PUEDEN HACER TRANSFERENCIA");
                                    }
                  else
                  {
                 
                 System.out.println("Ingrese Numero de cuenta destinatario :");
                  String nrocta2 = leer.next();
                 
                 System.out.println("Ingrese monto Transferencia:");
                 int montoTrans = leer.nextInt();
                 Cuenta cta2 = new Cuenta(nrocta2);
                 cta2.transferir(montoTrans);
                 System.out.println(" Cuenta destinatario :"+cta2.getNroCta2());
                 System.out.println(" Saldo destinatario :"+cta2.getSaldo2());
                 System.out.println(" Cuenta origen :"+cta.getNroCta());
                 System.out.println(" Saldo Cta  origen :"+cta.getSaldo());
                 
                 
                  }
                 
                 
                  }
             
             if (opcion == 4){
                 salir = true;
             }
        }
       
    }
    
}
