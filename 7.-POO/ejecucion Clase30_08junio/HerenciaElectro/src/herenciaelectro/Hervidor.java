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
public class Hervidor extends Electrodomesticos {
   protected  int litros;

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
    
   
   public Hervidor(){
        super();
        
    }
    
    public Hervidor(int peso,String color,double precio,String tipoLetra,int Litros){
        super(peso,color,precio,tipoLetra);
        this.litros = litros;
    }
    
    public void hervir(){
        
    
       for(int i = 0; i<=5 ;i++){
                System.out.println("Esperando que hierva");
            }
        System.out.println("Tetera Hervida de :"+litros + "Litros y Color :"+color);
         }
    
    
   @Override
    public void IngresarValores(){
         Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese nombre Hervidor:");
            Nombre = leer.next();
            System.out.println("Ingrese color:");
            color = leer.next();
            System.out.println("Ingrese precio");
            precio = leer.nextInt();
            System.out.println("Ingrese tipo letra:");
            tipoLetra = leer.next();
            System.out.println("Ingrese litros:");
            litros = leer.nextInt();
    }
    
    
     }
     

    
