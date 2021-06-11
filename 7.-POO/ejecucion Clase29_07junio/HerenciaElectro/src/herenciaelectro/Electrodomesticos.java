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
public class Electrodomesticos {
    private String Nombre;
    private String color;
    private double precio;
    private String tipoLetra;
    
    

public  Electrodomesticos()
        {
        }
public  Electrodomesticos(int peso,String color,double precio,int tamaño,String tipoLetra)
        {
            
            this.color = color;
            this.precio = precio;
         
            this.tipoLetra= tipoLetra;
            
        }

 public  void IngresarValores(){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese nombre electrodomestico:");
            Nombre = leer.next();
            System.out.println("Ingrese color:");
            color = leer.next();
            System.out.println("Ingrese precio");
            precio = leer.nextInt();
            System.out.println("Ingrese tipo letra:");
            tipoLetra = leer.next();
        }

    public String getNombre() {
        return Nombre;
    }
   

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

   

    public String getTipoLetra() {
        return tipoLetra;
    }
//Metodos SET
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
   

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  

    public void setTipoLetra(String tipoLetra) {
        this.tipoLetra = tipoLetra;
    }
 
 
 
 
 
public void Encender(){
    System.out.println("Aparato encendido :"+ getNombre()+" "+getColor());
}

public void Apagar(){
    System.out.println("Aparato apagado");
}

public int  SumarTiempoFunc(int numIni){
   int sum = numIni + 1;
   return sum;
}



}