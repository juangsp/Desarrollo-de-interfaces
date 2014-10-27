/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
public class VentanaAlta extends JFrame {

    public VentanaAlta() throws HeadlessException {
    }

    public VentanaAlta(String string) throws HeadlessException {
        super(string);
        this.caracteristicasVentanaAlta();
    }
    
    public void caracteristicasVentanaAlta(){
        
        this.setSize(400, 300);
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(),BoxLayout.PAGE_AXIS));
        this.setResizable(false);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(new JLabel("Nombre: "));
        panel1.add(new JTextField(10));

        JPanel panel2 =new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(new JLabel("Telefono: "));
        panel2.add(new JTextField(10));

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        String[] list = {"normal", "preferente"};
        JComboBox c = new JComboBox(list);
       
        panel3.add(new JLabel("Tipo: "));
        panel3.add(c);

        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel4.add(new JLabel("Descuento: "));
        panel4.add(new JTextField(5));
        
        MiItemListener e = new MiItemListener(this, panel4);
        c.addItemListener(e);
      
        JPanel panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton j1 = new JButton("Aceptar");
        j1.setName("Aceptar");
        JButton j2 = new JButton("Cancelar");
        j2.setName("Cancelar");
        panel5.add(j1);
        panel5.add(j2);

        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
        panel4.setVisible(false);
        this.setVisible(true);
    }
    
    public class MiItemListener implements ItemListener{
        private VentanaAlta ventana;
        private JPanel pan;
        public MiItemListener(VentanaAlta j,JPanel panel) {
            ventana=j;
            pan=panel;
        }

        
        
        @Override
        public void itemStateChanged(ItemEvent ie) {
            
            JComboBox jcb=(JComboBox)ie.getSource();
            
            if(jcb.getSelectedItem().equals("preferente")){
                pan.setVisible(true);
            }
             if(jcb.getSelectedItem().equals("normal")){
                pan.setVisible(false);
            }
        
        }
    
}
            
}
