

package practica1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileWriter;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Dao  {
    
   
    public void  cargarFichero(){
        try{
           /* FileInputStream fis = new FileInputStream("fichero1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (int i = 0; i < Clientes.size(); i++) {

                Clientes.add(i, ois.readObject());
            }
            ois.close();*/
            
            Scanner sc=new Scanner(new File("fichero1.txt"));
            String s;
             while(sc.hasNext()){
                
                 System.out.println(sc.nextLine());
                
                
            }
           sc.close();

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }
        
    }
    
    public void guardarFichero(ArrayList  clientes) throws IOException{
     
     
  
              FileWriter f = null;
              PrintWriter pw=null;
             
        try {
            f = new FileWriter("fichero1.txt");
            pw=new PrintWriter(f);
            pw.flush();
            for(int i=0;i<clientes.size();i++){
            pw.write(clientes.get(i).toString());
            pw.println();
          
            }
            pw.close();
            /*FileOutputStream fos = new FileOutputStream("fichero1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < clientes.size(); i++) {

                oos.writeObject(clientes.get(i));
            }

            oos.close();*/
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        
        
        }
        
    }

