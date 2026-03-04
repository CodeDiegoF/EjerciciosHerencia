package com.productos.ejercicio2;
import java.time.LocalDate;
import java.util.Objects;

public class Alimentos extends Producto {
     private LocalDate fechaCaducidad;
     private final boolean gluten;
     private final double IVA = 1.11;
     
     
     public Alimentos(String idProducto, String nombreProducto, double precioProducto,
                      LocalDate fechaCaducidad, boolean gluten) {
          
          super(idProducto, nombreProducto, precioProducto);
          
          this.fechaCaducidad = fechaCaducidad;
          this.gluten = gluten;
     }
     
     public LocalDate getFechaCaducidad() {
          return fechaCaducidad;
     }
     public void setFechaCaducidad(LocalDate fechaCaducidad) {
          this.fechaCaducidad = fechaCaducidad;
     }
     
     public boolean getGluten() {
          return gluten;
     }
     
     @Override
     public double getPrecioProducto() {
          return precioProducto * IVA;
     }
     
     public boolean estaCaducado() {
          return fechaCaducidad.isAfter(LocalDate.now());
     }
     
     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
                 
          sb.append("Alimentos{ ");
          sb.append("idProducto= ").append(idProducto);
          sb.append(", nombreProducto= ").append(nombreProducto);
          sb.append(", fechaCaducidad= ").append(fechaCaducidad);
          sb.append(", gluten= ").append(gluten);
          sb.append(", precioProducto= ").append(precioProducto).append("€");
          sb.append(", iva= ").append(getPrecioProducto()).append("€");
          sb.append(", estaCaducado= ").append(estaCaducado());
          sb.append(" }");
                 
          return sb.toString();
     }
}
