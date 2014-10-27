/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuListener;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Juan Gabriel Spalla
 */
class MiJFrame extends JFrame {

    private JButton anadir;
    private JButton buscar;
    private JButton eliminar;
    private JButton modificar;
    private JButton anadirCantidad;
    private JButton salir;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    

    public MiJFrame() throws HeadlessException {
        super();
    }
    
   
    public MiJFrame(Control c) throws HeadlessException {
        this.caracteristicasJFrame();
    }

    public MiJFrame(GraphicsConfiguration gc,Control c) {
        super(gc);
        this.caracteristicasJFrame();
    }

    public MiJFrame(String string,Control c) throws HeadlessException {
        super(string);
        this.caracteristicasJFrame();
    }

    public MiJFrame(String string, GraphicsConfiguration gc,Control c) {
        super(string, gc);
        this.caracteristicasJFrame();
    }
  
    
    public void caracteristicasJFrame(){
        this.setSize(800, 800);
        this.getContentPane().setLayout(new BorderLayout());
        MiLabel l=new MiLabel();
        MiMenu m = new MiMenu(this);
        MyWindowListener listener = new MyWindowListener(this,l);
        addWindowListener(listener);
        
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(Color.CYAN);

        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.setBackground(Color.BLUE);
        
        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.setBackground(Color.WHITE);
        
        panel4=new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel4.setBackground(Color.BLUE);
        
        anadir = new JButton("Añadir Cliente");
        anadir.setName("anadir");
        anadir.setMaximumSize(new Dimension(150,60));
        
        buscar = new JButton("Buscar");
        buscar.setName("buscar");
        

        eliminar = new JButton("Eliminar Cliente");
        eliminar.setName("eliminar");
        eliminar.setMaximumSize(new Dimension(150, 60));

        anadirCantidad = new JButton("Añadir Cantidad");
        anadirCantidad.setName("añadirCantidad");
        anadirCantidad.setMaximumSize(new Dimension(150, 60));

//      modificar = new JButton("Modificar Cliente");
//        modificar.setName("modificar");
//        modificar.setMaximumSize(new Dimension(150,60));
        salir = new JButton("Salir");
        salir.setName("salir");

        MiActionListener listener2 = new MiActionListener(this);

        anadir.addActionListener(listener2);
        eliminar.addActionListener(listener2);
        anadirCantidad.addActionListener(listener2);
        buscar.addActionListener(listener2);
        // modificar.addActionListener(listener2);
        salir.addActionListener(listener2);

        panel1.add(anadir);
        panel1.add(eliminar);
        panel1.add(anadirCantidad);
        //panel1.add(modificar);

        panel2.add(new JTextField(20));
        panel2.add(buscar);

        panel4.add(salir);
        
        this.add(panel1,BorderLayout.WEST);
        this.add(panel2,BorderLayout.SOUTH);
        this.add(panel3,BorderLayout.CENTER);
        this.add(panel4,BorderLayout.NORTH);
       
        
        this.setVisible(true);

    }

    public class MiMenu extends JMenuBar{
       
        private JMenuBar jmb;
        private JMenu m1;
        private JMenu m2;
        private JMenu m3;

        public MiMenu() {
        }
        
        public MiMenu(MiJFrame f){
            
            jmb = new JMenuBar();
            
            m1 = new JMenu("Generar Informe");
            m1.setName("generar");

            m2 = new JMenu("Guardar Informe");
            m2.setName("guardar");

            m3 = new JMenu("Cargar Informe");
            m3.setName("cargar");

            MiMenuListener e = new MiMenuListener(f);
            m1.addMenuListener(e);
            m2.addMenuListener(e);
            m3.addMenuListener(e);


           
            jmb.add(m1);
            jmb.add(m2);
            jmb.add(m3);
            f.setJMenuBar(jmb);

        }
        
    }
    public class MiLabel extends JLabel{
        JLabel l1;

        public MiLabel() {
        }
        
        public MiLabel(JFrame f, String s){
            
            l1=new JLabel(s);
            f.getContentPane().add(l1);
            f.setVisible(true);
        }
    }
    public class MyWindowListener  implements WindowListener {
        MiJFrame j;
        MiLabel jl;
        public MyWindowListener(MiJFrame f,MiLabel l){
            j=f;
            jl=l;
        }       
        @Override
        public void windowOpened(WindowEvent we) {
            
        }

        @Override
        public void windowClosing(WindowEvent we) {
            
            int  i=JOptionPane.showConfirmDialog(j,"¿Estas seguro que quiere salir?");
        if(i==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        if(i==JOptionPane.NO_OPTION){
            j.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            
            
        }
        if(i==JOptionPane.CANCEL_OPTION){
            j.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
           
        }
        }
        @Override
        public void windowClosed(WindowEvent we) {    
        }
        @Override
        public void windowIconified(WindowEvent we) { 
        }
        @Override
        public void windowDeiconified(WindowEvent we) {  
        }
        @Override
        public void windowActivated(WindowEvent we) {
        }
        @Override
        public void windowDeactivated(WindowEvent we) { 
        }
        
    }
    
    public class MiMenuListener implements MenuListener{
        MiJFrame j=null;     
        JMenu m=new JMenu();
        JPanel pl=null;
        public MiMenuListener(MiJFrame ventana) {
            j=ventana;
           
        }

        @Override
        public void menuSelected(MenuEvent me) {
            JMenu jm=(JMenu)me.getSource();
           if(jm.getName().equals("generar")){
              
                Object[][] datos = {
                {"Nombre1", "Aplellido1", "Esquiar", new Integer(3333), false},
                {"Nombre2", "Aplellido2", "Patinar", new Integer(4444), true},
                {"Nombre3", "Aplellido3", "Escalar", new Integer(5555), false},
                {"Nombre3", "Aplellido3", "Correr", new Integer(5555), true},
                {"Nombre3", "Aplellido3", "Nadar", new Integer(5555), false},};

            String[] columnas = {"Nombre", "Apellido", "Pasatiempo", "Id", "Soltero/a"};
            panel3.removeAll();
            JTable f = new JTable(datos, columnas); 
       
            JScrollPane sp=new JScrollPane(f); 
            panel3.add(sp,BorderLayout.CENTER);
            j.setVisible(false);
            j.setVisible(true);
           
           }
           
           if(jm.getName().equals("guardar")){
               JFileChooser jfc=new JFileChooser();
               jfc.showSaveDialog(null);
               
               
           }
           
            if(jm.getName().equals("cargar")){
               JFileChooser jfc=new JFileChooser();
               jfc.showOpenDialog(jm);
               
               
           }
        }

        @Override
        public void menuDeselected(MenuEvent me) {
            
        }

        @Override
        public void menuCanceled(MenuEvent me) {
            
        }

       

        
}
}