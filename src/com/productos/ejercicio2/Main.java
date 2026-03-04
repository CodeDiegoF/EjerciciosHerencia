package com.productos.ejercicio2;

import java.time.LocalDate;

public class Main {
     public static void main(String[] args) {
          LocalDate caducidadGalletas = LocalDate.of(2030, 1, 20);
          Alimentos galletas = new Alimentos("002", "galletas", 5.30, caducidadGalletas, true);
          System.out.println(galletas);
          
          
          Drogueria lejia = new Drogueria("001", "lejía", 2.30, NivelToxicidad.ALTA);
          System.out.println(lejia);
     }
}
