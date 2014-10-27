/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Juan
 */
public class MiActionListener implements ActionListener {
MiJFrame j;
VentanaAlta va;
VentanaAñadirCantidad vac;
VentanaEliminar  ve;

    public MiActionListener(MiJFrame ventana) {
        j=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton boton =(JButton)ae.getSource();
        
        if(boton.getName().equals("anadir")){
            va= new VentanaAlta("Ventana Alta");
        }
        
        if(boton.getName().equals("añadirCantidad")){
            vac=new VentanaAñadirCantidad("Ventana Cantidad");
        }
         if(boton.getName().equals("eliminar")){
            ve= new VentanaEliminar("Ventana Alta");
        }
         
          if(boton.getName().equals("salir")){
          System.exit(EXIT_ON_CLOSE);
        }
        
    }
    
}
