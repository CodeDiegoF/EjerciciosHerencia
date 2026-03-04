package com.productos.ejercicio2;

import java.time.LocalDate;

public class Main {
     public static void main(String[] args) {
          // Crear fecha de caducidad para el producto de alimentos
          LocalDate caducidadGalletas = LocalDate.of(2030, 1, 20);
          //Crear el producto de alimentos
          Alimentos galletas = new Alimentos("002", "galletas", 5.30, caducidadGalletas, true);
          System.out.println(galletas);
          
          //Crear el producto de droguería
          Drogueria lejia = new Drogueria("001", "lejía", 2.30, NivelToxicidad.ALTA);
          System.out.println(lejia);
          
          // Crear supermercado
          Supermercado supermercado = new Supermercado("MiSuper");

          // Añadir productos
          supermercado.addProducto(galletas);
          supermercado.addProducto(lejia);

          // Buscar producto por ID
          Producto buscado1 = supermercado.getProductoPorID("002");
          System.out.println("Buscado por ID '002': " + buscado1);
          
          Producto buscado2 = supermercado.getProductoPorID("011");
          System.out.println("Buscado por ID '011': " + buscado2);

          // Actualizar precio
          supermercado.actualizarPrecioPorId("002", 7.99);
          System.out.println("Precio actualizado: " + supermercado.getProductoPorID("002"));

          // Eliminar producto
          boolean eliminado = supermercado.removeProducto(lejia);
          System.out.println("¿Lejía eliminada?: " + eliminado);

          // Listar productos caducados (ejemplo con fecha pasada)
          Alimentos pan = new Alimentos("003", "pan", 1.20, LocalDate.of(2020, 1, 1), false);
          supermercado.addProducto(pan);
          System.out.println("Productos caducados: " + supermercado.obtenerProductosCaducados());
     }
}
