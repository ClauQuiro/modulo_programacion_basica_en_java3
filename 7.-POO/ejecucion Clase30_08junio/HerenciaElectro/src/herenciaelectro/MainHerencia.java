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
public class MainHerencia {
    
    static Scanner leer = new Scanner(System.in);
        static String rojo ="\033[31m";
        static String azul ="\033[34m";
        static String fazul ="\033[44m";
        static String famarillo = "\033[43m";
        static String b = "\u001B[0m";
   
    public static void main(String[] args) {
        
   //Hervidor H1 = new Hervidor(); 
        menu();
       
        
    }  
       private static void menu(){
           
        boolean Salir = false;
        Hervidor H1 = new Hervidor();  
        Juguera J1 = new Juguera();
        while (!Salir){
        System.out.println(azul+"INGRESE OPCION 1:HERVIDOR 2:JUGUERA 3: LAVADORA 4:SALIR"+b);
        
        
        int opcion = leer.nextInt();
        switch(opcion){
            case 1: OcuparHervidor(H1); break;
            case 2: OcuparJuguera(J1); break;
            case 3: OcuparLavadora();break;
            case 4: Salir = true;
            default: System.out.println("No existe esa opcion"); break;
                }
        }  
    }
       
       
       private  static void OcuparHervidor(Hervidor H1){
         //Hervidor H1 = new Hervidor();
           boolean Salir = false;
           while (!Salir){
           System.out.println("Ingrese opcion 1:Ingresar Datos 2:Hervir 3: Encender 4:Salir");
           int opcion = leer.nextInt();
           switch(opcion){
               
               case 1:H1.IngresarValores();
                     
                      break;
               case 2:H1.hervir();    
                      break;
          
               case 4: Salir = true;
               break;
               default: System.out.println("No existe esa opcion"); break;
                }    
           }  
       }
       private static void OcuparJuguera(Juguera J1){
          // Juguera J1 = new Juguera(JUGUERA J1);
           boolean Salir = false;
           while(!Salir){
               System.out.println("Ingrese opcion 1:Ingresar Datos 2:Aumentar velocidad 3: Encender 4:Salir");
               int opcion = leer.nextInt();
               switch(opcion){
                   case 1:J1.IngresarValores();
                          break;
                   case 2:
                       System.out.println("Ingrese aumento velocidad:");
                       J1.AumentarVlcidad(leer.nextInt());
                       System.out.println(rojo+"Nombre:"+J1.getNombre()+ "Color:"+ J1.getColor()+"La velocidad aumento a:"+ J1.getVelocidad()+b);
                       break;
                   case 4:Salir = true;
                        break;
                        
               }
           }
       }
       private static void OcuparLavadora(){
           Lavadora L1 = new Lavadora();
           L1.IngresarValores();
       }

       
       
}    
        //H1.SumarTiempoFunc(5);
   
        
        
       
        
        
        
    
    



