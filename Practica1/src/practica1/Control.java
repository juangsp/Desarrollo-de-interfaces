

package practica1;

import java.io.IOException;
import java.util.ArrayList;


public class Control {
   ArrayList<Cliente> clientes=new ArrayList();
   Dao d=new Dao();
   
   
  public void crearClienteNormal(ClienteNormal cn){
      
      clientes.add(cn);
  }
   
  public void crearClientePreferente(ClientePreferente cp){
      clientes.add(cp);
  }
  
  public void añadirFactura(String cif,int cantidad){
      
      for(int i=0;i<clientes.size();i++){
          if(clientes.get(i).getCif().equals(cif)){
              if("normal".equals(clientes.get(i).getTipo())){
                   clientes.get(i).añadirFacturas(cantidad);
              }else{
                 int descuento=clientes.get(i).getDescuento();
                 int cobrar=cantidad-cantidad*(descuento/100);
                 
              }
             
          }else{
              System.out.println("Error ese CIF no existe");
                  
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
       
  }
       
   

