package com.productos.ejercicio2;

public class Drogueria extends Producto {
     private NivelToxicidad nivelToxicidad;
     private final double IVA = 1.21;
     
     public Drogueria(String idProducto, String nombreProducto, double precioProducto,
                      NivelToxicidad nivelToxicidad) {
          
          super(idProducto, nombreProducto, precioProducto);
          this.nivelToxicidad = nivelToxicidad;
     }
     
     @Override
     public double getPrecioProducto() {
          return precioProducto * IVA;
     }
     
     public String toString() {
          StringBuilder sb = new StringBuilder();
          
          sb.append("Drogueria{ ");
          sb.append("idProducto= ").append(idProducto);
          sb.append(", nombreProducto= ").append(nombreProducto);
          sb.append(", precioProducto= ").append(precioProducto).append("€");
          sb.append(", iva= ").append(getPrecioProducto()).append("€");
          sb.append(", nivelToxicidad= ").append(nivelToxicidad);
          sb.append(" }");
          
          return sb.toString();
     }
     
 
}
