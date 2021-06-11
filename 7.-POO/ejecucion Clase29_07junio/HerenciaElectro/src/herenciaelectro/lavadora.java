/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectro;

/**
 *
 * @author quiro
 */
public class lavadora extends Electrodomesticos{
    

    public lavadora(){
        super();
    }
    public lavadora(String Nombre, int peso,String color,double precio,int tamaño,String tipoLetra){
        super(peso,color,precio,tamaño,tipoLetra);
        
    }
}