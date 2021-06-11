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

public class Juguera  extends Electrodomesticos{
    private int velocidad;
    public Juguera(){
    }
    
    public Juguera(int peso,String color,double precio,String tipoLetra,int velocidad)
    {
         super(peso,color,precio,tipoLetra);
         this.velocidad = velocidad;
    }
    
    
    public void AumentarVlcidad(int velocidad)
    {
        this.velocidad = velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
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
    
    
}
