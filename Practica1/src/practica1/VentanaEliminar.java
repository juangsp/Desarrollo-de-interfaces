/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Juan
 */
public class VentanaEliminar extends JFrame {
    
     public VentanaEliminar() throws HeadlessException {
    }

    public VentanaEliminar(String string) throws HeadlessException {
        super(string);
        this.caracteristicasVentanaEliminar();
    }

   
    
    public void caracteristicasVentanaEliminar(){
        
        this.setSize(400, 300);
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));
        this.setResizable(false);
        JPanel panel1 = new JPanel();
         panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
         panel1.add(new JLabel("Introduce el numero de identificacion del cliente(cif)"));
         panel1.add(new JLabel("que quieres eliminar"));
         
         JPanel panel2 = new JPanel();
       
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.add(new JLabel("Id Cliente: "));
        panel2.add(new JTextField(10));
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton j1 = new JButton("Aceptar");
        j1.setName("aceptar");
        JButton j2 = new JButton("Cancelar");
        j2.setName("cancelar");
        panel3.add(j1);
        panel3.add(j2);
        MiActionListenerEliminar listener =new MiActionListenerEliminar(this);
        
        j1.addActionListener(listener);
        
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
      
        this.setVisible(true);
    }
    
    public class MiActionListenerEliminar implements ActionListener {

        VentanaEliminar ve = null;

        public MiActionListenerEliminar(VentanaEliminar j) {
            ve = j;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            JButton boton = (JButton) ae.getSource();
            if (boton.getName().equals("aceptar")) {
                int i = JOptionPane.showConfirmDialog(ve, "¿Estas seguro que quieres borrar al cliente?");
                if (i == JOptionPane.YES_OPTION) {

                }
                if (i == JOptionPane.NO_OPTION) {

                }

            }
        }

    }

}
