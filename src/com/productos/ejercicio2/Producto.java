package com.productos.ejercicio2;

import java.util.Objects;

public abstract class Producto {
     protected final String idProducto;
     protected String nombreProducto;
     protected double precioProducto;
     
     public Producto(String idProducto, String nombreProducto, double precioProducto)
     {
          this.idProducto = idProducto;
          this.nombreProducto = nombreProducto;
          this.precioProducto = precioProducto;
     }
     
     public String getIdProducto() {
          return idProducto;
     }
     
     public String getNombreProducto() {
          return nombreProducto;
     }
     
     public void setNombreProducto(String nombreProducto) {
          this.nombreProducto = nombreProducto;
     }
     
     public void setPrecioProducto(double precioProducto) {
          this.precioProducto = precioProducto;
     }
     
     public abstract double getPrecioProducto();
     
     public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null || getClass() != obj.getClass()) return false;
          
          Producto producto = (Producto) obj;
          
          return Objects.equals(idProducto, producto.idProducto);
     }
     
     public int hashCode() {
          return Objects.hashCode(idProducto);
     }
     
}
