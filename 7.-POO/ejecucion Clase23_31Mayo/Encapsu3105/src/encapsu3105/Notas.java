/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsu3105;

/**
 *
 * @author quiro
 */
public class Notas {
   // private float Notas;
    private float[] Notas= new float[3];
    
    public Notas(){
   
    }
     public void setNotasAlumno( float Notas[]){
        this.Notas = Notas;
        
    }
    
    
    public float[]  getNotasAlumno(){
        
        return Notas;
        }
        
     public void SubeNota(){
        for (int i=0;i<=2;i++){
            if (Notas[i] >= 6.8f){
                Notas[i]= 7.0f;
            }
            
                
        }
        
    }
    

}