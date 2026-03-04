package com.vehiculo;
import java.util.Date;

public class MainVehiculo {
    public static void main(String[] args) {
        Date hoy = new Date();

        // Mismo número de matrícula -> equals debe dar TRUE
        Coche coche1 = new Coche(
                "1234-ABC",
                4,
                "Diego",
                hoy,
                5,
                true,
                false
        );

        Coche coche2 = new Coche(
                "1234-ABC",   // misma matrícula que coche1
                4,
                "Ana",
                hoy,
                5,
                false,
                true
        );

        // Matrícula distinta -> equals debe dar FALSE
        Coche coche3 = new Coche(
                "9999-ZZZ",   // matrícula distinta
                4,
                "Carlos",
                hoy,
                5,
                false,
                false
        );

        System.out.println("coche1.equals(coche2) (misma matrícula) = " + coche1.equals(coche2)); // true
        System.out.println("coche1.equals(coche3) (matrícula distinta) = " + coche1.equals(coche3)); // false

        // Ejemplo de hashCode: mismos objetos lógicos (misma matrícula) => mismo hash
        System.out.println("hashCode de coche1 = " + coche1.hashCode());
        System.out.println("hashCode de coche2 = " + coche2.hashCode());
        System.out.println("hashCode de coche3 = " + coche3.hashCode());
    }
}