/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author quiro
 */
public class Ventana extends JFrame{
     int Avance;
    public Ventana(int a,int b){//COnstructor de la clase ventana
       
        this.setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("LA GRAN CIUDAD");
        setLocation(a,b);
        //setBounds(100,200,500,500);
        //setLocationRelativeTo(null);
        //IniciarComponentes();
                
                
     }

    
    public void IniciarComponentes(int Avanza,int jug)
    {
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        //panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        panel2.setLayout(null);
        this.getContentPane().add(panel);
        this.getContentPane().add(panel2);
        JLabel etiqueta = new JLabel();
        JLabel etiqueta2 = new JLabel();
        if (jug == 1) {
            etiqueta.setText("jugador :"+jug +"Avanza"+Avanza);
            etiqueta.setBounds(10,50,150,100);
            panel.add(etiqueta);
        }
        if(jug == 2){
            etiqueta2.setText("jugador :"+jug +"Avanza"+Avanza);
            etiqueta2.setBounds(50,50,150,100);
            panel2.add(etiqueta2);
            
            
        }
        }
        
    }
    

