

package practica1;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;


public class Control {
   ArrayList<Cliente> clientes=new ArrayList();
   Dao d=new Dao();

    public Control(JFrame j) {
    }

    
   
   
   
  public void crearClienteNormal(ClienteNormal cn){
      
      clientes.add(cn);
  }
   
  public void crearClientePreferente(ClientePreferente cp){
      clientes.add(cp);
  }
  
  public void añadirFactura(String cif,int cantidad){
      
        for (int i = 1; i <= clientes.size(); i++) {
            if (clientes.get(i).getCif().equals(cif) && "preferente".equals(clientes.get(i).getTipo())) {

                int descuento = clientes.get(i).getDescuento();
                cantidad = cantidad - (cantidad * (descuento / 100));
                clientes.get(i).añadirFacturas(cantidad);

            }
            if (clientes.get(i).getCif().equals(cif) && "normal".equals(clientes.get(i).getTipo())) {

                clientes.get(i).añadirFacturas(cantidad);
            }

        }
    }
  
  public String verCarteraClientes(int i){
      
         return clientes.get(i).imprimirDatos()+"\n";
      }
  
    public void guardarFichero() throws IOException {
        
        d.guardarFichero(clientes);
    }
    
    public void  cargarArchivo(){
        
         d.cargarFichero();
    
   /* for (int i=0;i<clientes.size();i++){
        if("normal".equals(clientes.get(i).getTipo())){
            return clientes.get(i).getCif()+","+clientes.get(i).getNombre()+" "+clientes.get(i).getTipo()+","+clientes.get(i).getFactura();
        }else
            return clientes.get(i).getCif()+","+clientes.get(i).getNombre()+" "+clientes.get(i).getTipo()+","+clientes.get(i).getFactura();
        
    }*/
    
    
    }
    
    public void setVentana(JFrame f){
        
        f=new MiJFrame(this);
    }
       
  }
       
   

