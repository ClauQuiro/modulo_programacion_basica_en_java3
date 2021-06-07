/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsu3105;

import java.util.Scanner;


/**
 *
 * @author quiro
 */
public class Encapsu3105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        int edad;
        String Curso;
        //float notas;
        float[] notas= new float[3];
        Scanner leer = new Scanner(System.in);
        Alumno A1 = new Alumno();
        Notas N1 = new Notas();
        //for (int i=0; i<=3;i ++){
            System.out.println("Ingrese Nombre Alumno :");
            Nombre = leer.next();
            System.out.println("Ingrese Edad :");
            edad = leer.nextInt();
            System.out.println("Ingrese Curso Alumno :");
            Curso = leer.next();
            for (int i=0;i<=2;i++){
                System.out.println("Ingrese Nota Alumno :");
                notas[i] = leer.nextFloat();
               // N1.setNotasAlumno(notas);
            }
            if (edad == 15)
            {
                A1.setNombreAlumno(Nombre);
                A1.setEdadAlumno(edad);
                A1.setCursoAlumno(Curso);
                N1.setNotasAlumno(notas);
                N1.SubeNota();
                System.out.println("El nombre ingresado es: :" +A1.getNombreAlumno());
                System.out.println("Curso: :" +A1.getEdadAlumno());
                System.out.println("Edad: :" +A1.getCursoAlumno());
                notas = N1.getNotasAlumno();
                 for (int i=0;i<=2;i++){
                   
                   // System.out.println("Notas: :" +String.format("%.2f",N1.getNotasAlumno()));
                   System.out.println("Notas:" + notas[i]);
                 }
            }
            else
            {
                 System.out.println("Alumno no cumple caracteristicas");
            }
        }

        
        
    //}
    
}
