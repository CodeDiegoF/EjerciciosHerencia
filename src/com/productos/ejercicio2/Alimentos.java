package com.productos.ejercicio2;
import java.time.LocalDate;

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
}
