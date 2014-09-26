/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.io.Serializable;

/**
 *
 * @author admindam
 */
public abstract class Cliente implements Serializable {
    
    protected String nombre;
    protected String tlf;
    protected String cif;
    protected String tipo;
    protected int factura;
    protected int descuento;

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }
   
   
    public Cliente(String nombre, String tlf, String cif,String tipo,int descuento) {
        this.nombre = nombre;
        this.tlf = tlf;
        this.cif = cif;
        this.tipo=tipo;
        this.descuento=descuento;
      
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getTlf() {
        return tlf;
    }

    public String getCif() {
        return cif;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    
   public void añadirFacturas(int cantidad){
       
       this.factura=this.factura+cantidad;
   }

    @Override
    public String toString() {
         if (tipo=="normal"){
          return cif+","+nombre+","+tipo+","+factura;
      }
        return cif+","+nombre+","+tipo+","+factura+","+descuento;
    }

    
    public String imprimirDatos(){
     
        return cif +" ( " + nombre +"  " + tlf + " " + tipo + " ): " + factura ;
    }
    
    
   
           
       
   }

   
   

   
    

   
    
    
    
    

