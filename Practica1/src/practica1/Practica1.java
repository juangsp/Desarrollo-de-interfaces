

package practica1;

import java.io.IOException;
import java.util.*;
public class Practica1 {

    
   
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int j;
        String nombre;
        String tlf;
        String cif;
        String tipo;
        int fact;
        int descuento;
        String fichero;
        Control c = new Control();

        do {

            System.out.println("¿Que quieres hacer");
            System.out.println("1-Añadir cliente\n2-Añadir cantidad a cliente"
                    + "\n3-Generar informe\n4-Guardar fichero\n5-Cargar fichero\n0-Salir ");
            j = sc.nextInt();
            sc.nextLine();
            switch (j) {
                case 1:
                    System.out.println("Tipo de cliente(normal/preferente");
                    tipo = sc.nextLine();

                    if ("normal".equals(tipo)) {
                        System.out.println("Introduce el nombre");
                        nombre = sc.nextLine();
                        System.out.println("introduce el telefono");
                        tlf = sc.nextLine();
                        System.out.println("Introduce el CIF");
                        cif = sc.nextLine();
                        descuento=0;
                        c.crearClienteNormal(new ClienteNormal(nombre, tlf, cif, tipo,descuento));
                    } else {
                        System.out.println("Introduce el nombre");
                        nombre = sc.nextLine();
                        System.out.println("introduce el telefono");
                        tlf = sc.nextLine();
                        System.out.println("Introduce el CIF");
                        cif = sc.nextLine();
                        System.out.println("Introduce el descuento");
                        descuento=sc.nextInt();
                        sc.nextLine();
                        c.crearClientePreferente(new ClientePreferente(nombre, tlf, cif, tipo,descuento));

                    }

                    break;

                case 2:
                    System.out.println("Introduce el numero de CIF del cliente");
                    cif=sc.nextLine();
                    System.out.println("Introduce el valor de la factura");
                    fact=sc.nextInt();
                    c.añadirFactura(cif, fact);
                     
                    break;
                case 3:
                    
                    for(int i=0;i<c.clientes.size();i++){
                        System.out.println( c.verCarteraClientes(i));
                    }
                    break;
                    
                case 4:
                    
                    c.guardarFichero();
                    break;
                    
                case 5:
                    c.cargarArchivo();
            }
        } while (j != 0);

           

        }
    
    }
