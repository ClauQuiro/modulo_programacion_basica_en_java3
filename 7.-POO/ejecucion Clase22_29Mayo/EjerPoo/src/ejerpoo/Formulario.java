/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpoo;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author quiro
 */
public class Formulario extends JFrame implements ActionListener {
    private JButton boton1,boton2,boton3;
    private JLabel label1;

    public Formulario(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10, 100, 90, 30);
        add (boton1);
        boton1.addActionListener(this);
        boton2 = new JButton("2");
        boton2.setBounds(110, 100, 90, 30);
        add (boton2);
        boton2.addActionListener(this);
        boton3 = new JButton("3");
        boton3.setBounds(110, 100, 90, 30);
        add (boton3);
        boton3.addActionListener(this);
        label1 = new JLabel("En espera...");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
    }
   
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton1){
            label1.setText("Has presionado el boton 1");
        }
        if (e.getSource() == boton2){
            label1.setText("Has presionado el boton 2");
        }
        if (e.getSource() == boton3){
            label1.setText("Has presionado el boton 3");
        }
    
    }
    
    public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(0, 0, 350, 200);
        formulario1.setVisible(true);
        
        formulario1.setResizable(false);// que el usuario no modifique las dimensiones d ela interfaz
        formulario1.setLocationRelativeTo(null);// que el forumulario aparezca en el centro de la panralla
        
    }
}
