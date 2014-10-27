/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan
 */
public class VentanaAñadirCantidad extends JFrame {

    public VentanaAñadirCantidad() throws HeadlessException {
    }

    public VentanaAñadirCantidad(String string) throws HeadlessException {
        super(string);
        this.caracteristicasVentana();
    }
    
    
    public void caracteristicasVentana(){
        this.setSize (350,250);
        
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));
        this.setResizable(false);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel1.add(new JLabel("Introduce el numero de identificacion del cliente(cif)"));
        panel1.add(new JLabel("y el importe de la factura"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(new JLabel("Id Cliente: "));
        panel2.add(new JTextField(10));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.add(new JLabel("Cantidad: "));
        panel3.add(new JTextField(10));

        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton j1 = new JButton("Aceptar");
        j1.setName("Aceptar");
        JButton j2 = new JButton("Cancelar");
        j2.setName("Cancelar");
        panel4.add(j1);
        panel4.add(j2);

        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.setVisible(true);
    }
    
}
