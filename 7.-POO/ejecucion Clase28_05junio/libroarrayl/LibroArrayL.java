/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroarrayl;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author quiro
 */
public class LibroArrayL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        Libro li = new Libro();
        String rojo ="\033[31m";
        String azul ="\033[34m";
        String fazul ="\033[44m";
        String famarillo = "\033[43m";
        String b = "\u001B[0m";
        int op,lib,opt;
        boolean resp;
        ArrayList<Libro> libro= new ArrayList<Libro>();
        
        do {
        System.out.print("Ingrese nombre Libro :");
        String nombrelibro = leer.next();
        System.out.print("Ingrese Autor :");
        String autor = leer.next();
        System.out.print("Ingrese cantidad de ejemplares: ");
        int ejemp = leer.nextInt();
        System.out.print("Ingrese cantidad de ejemplares prestados: ");
        int prest = leer.nextInt();
        libro.add(new Libro(nombrelibro, autor, ejemp, prest));
        
        System.out.println("");
        System.out.println("Desea ingresar otro libro? 1=Si 2=No");
        op =leer.nextInt();
       } while (op ==1);
        
       
        opt = 1;
        while (opt !=4){
             System.out.println("ingrese opcion 1:Ver libros  2: Prestar  3:devolver 4:salir");
             opt = leer.nextInt();
            if (opt == 1){
            for (int i = 0;i < libro.size();i++)
            {
                System.out.print(azul+"Libros: "+ libro.get(i).getNombre()+" ");
                System.out.print("Autor : "+ libro.get(i).getAutor()+" ");
                System.out.print("Disponible : "+ libro.get(i).getEjemplares()+" ");
                System.out.print("prestados : "+ libro.get(i).getEjemprestado()+" "+b);
                System.out.println("");


            }
            }
            if (opt == 2){

            for (int i=0;i < libro.size();i++){
                           System.out.println("Qué libro desea prestar?");
                           System.out.println(i+" - Nombre Libro: "+libro.get(i).getNombre());
                      }
                      lib=leer.nextInt();
                      resp=libro.get(lib).Prestamo();
                      if (resp == false){
                          System.out.println(famarillo+"No se pueden prestar mas libros de:"+ libro.get(lib).getNombre()+b);
                      }
                       else{
                      System.out.println(famarillo+"PROCESO EXITOSO LIBRO:"+ libro.get(lib).getNombre()+" DISPONIBLES: " +libro.get(lib).getEjemplares()+ "  PRESTADOS: "+ libro.get(lib).getEjemprestado()+b);
                     
                      }
                    }
             if (opt == 3){

            for (int i=0;i < libro.size();i++){
                           System.out.println("Qué libro desea DEVOLVER?");
                           System.out.println(i+" - Nombre Libro: "+libro.get(i).getNombre());
                      }
                      lib=leer.nextInt();
                      
                      //libro.get(lib).getEjemplares();
                      resp =libro.get(lib).Devolucion();
                      if (resp == false){
                          System.out.println(famarillo+"LIBRO:"+ libro.get(lib).getNombre()+" No se puede devolver, ya que no ha sido prestado"+b);
                     }
                      else{
                      System.out.println(famarillo+"PROCESO EXITOSO LIBRO:"+ libro.get(lib).getNombre()+" DISPONIBLES: " +libro.get(lib).getEjemplares()+ "  PRESTADOS: "+ libro.get(lib).getEjemprestado()+b);
                     // System.out.println( "AUTOR :"+ libro.get(lib).getAutor()+" LIBROS DISPONIBLES"+libro.get(lib).getEjemplares()+ " PRESTADOS "+ libro.get(lib).getEjemprestado());
                      }
                    }

        }   
    }
    
}
