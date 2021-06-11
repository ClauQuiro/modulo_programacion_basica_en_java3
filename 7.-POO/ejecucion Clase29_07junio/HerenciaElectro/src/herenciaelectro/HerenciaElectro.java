/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectro;
import java.util.Scanner;

/**
 *
 * @author quiro
 */
public class HerenciaElectro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Electrodomesticos E1 = new Electrodomesticos();
        //E1.IngresarValores();
        Scanner leer = new Scanner(System.in);
        int opt = 1;
        while (opt!= 4) 
        {
            System.out.println("Ingrese opcion 1:Hervidor 2:Lavadora 3: Juguera 4:Salir");
        
            opt = leer.nextInt();

            if (opt == 1){
                Hervidor H1 = new Hervidor();
                int salir = 1;
                while (salir!=4){
                    System.out.println("Ingrese opcion 1:ingresar valores 2:Encender 3: Hervir 4:salir");
                    opt = leer.nextInt();
                    if (opt ==1){

                        H1.IngresarValores();
                        System.out.println("Ingresar litros de capacidad hervidor");

                        H1.setLitros(leer.nextInt());
                    }

                    if (opt == 2){

                        H1.Encender();
                    }

                     if (opt == 3){

                        H1.hervir();}
                
                    if (opt == 4){

                            salir = 4;}
                    }
            }
            
            if (opt == 2){
                
                lavadora L1 = new lavadora();
                int salir = 1;
                while (salir!=4){
                    System.out.println("Ingrese opcion 1:ingresar valores 2:Encender 3: APAGAR 4:salir");
                    opt = leer.nextInt();
                    if (opt ==1){

                        L1.IngresarValores();
                       
                    }

                    if (opt == 2){

                        L1.Encender();
                    }

                     if (opt == 3){

                        L1.Apagar();

                    }
                      if (opt == 4){

                        salir = 4;

                    }
            }
        }  
            
            
            
            
            
            
            
        }        
            
        
    }  
        
}    
        //H1.SumarTiempoFunc(5);
   
        
        
       
        
        
        
    
    



