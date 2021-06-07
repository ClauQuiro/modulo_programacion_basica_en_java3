/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroarrayl;

/**
 *
 * @author quiro
 */
public class Libro {
    private String nombre;
    private String autor;
    private int ejemp;
    private int prest;


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
     public void setAutor(String autor){
        this.autor = nombre;
    }
      public void setEjemplares(int ejemp){
        this.ejemp = ejemp;
    }
       public void setEjempPrestado(int ejemPres){
        this.prest = prest;
    } 
    
     public String getNombre(){
        return(nombre);
    }
      public String getAutor(){
        return(autor);
    }
     public int getEjemplares(){
        return(ejemp);
    }
      public int getEjemprestado(){
        return(prest);
    }
    
    
    public Libro(){
    
}

public  Libro(String nombre,String autor,int ejemp,int prest){
        this.nombre = nombre;
        this.autor = autor;
        this.ejemp = ejemp;
        this.prest = prest;
      }


public boolean  Prestamo(){
    
    boolean ok;
    ok = false;
    if (ejemp > 0){ 
        prest = prest + 1;
        ejemp = ejemp -1;
        ok = true;
                  }   
    return (ok);
    
   }

 
public boolean  Devolucion(){
    
    if (prest<=0){
            //System.out.println("Este libro no se ha prestado");
            return false;
        } else {
            ejemp++;
            prest--;
            //System.out.println("Recibido");
            return true;
        }
    }
    
}
