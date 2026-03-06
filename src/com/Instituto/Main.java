package com.Instituto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona1 = new Persona("12345678A", "jacinto gómez gómez", LocalDate.of(2000, 12, 1));
         System.out.println(persona1);
        System.out.println("hashCode Persona1: " + persona1.hashCode());
         System.out.println("***************************************");
         
        // Crear otra persona y usar equals
        Persona persona2 = new Persona("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1));
        System.out.println(persona1.equals(persona2));
        System.out.println("hashCode Persona2: " + persona2.hashCode());
        System.out.println(persona2);

        System.out.println("***************************************");

        // Crear un profesor de una especialidad
        Profesor profesor = new Profesor("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1), Especialidad.EDUCACION_FISICA);
        System.out.println(profesor);
        System.out.println("***************************************");

        // Crear un profesor titular
        ProfesorTitular titular = new ProfesorTitular("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1), Especialidad.EDUCACION_FISICA, LocalDate.of(2020, 1, 1));
        System.out.println(titular);
        System.out.println("***************************************");

        // Crear un profesor interino
        ProfesorInterino interino = new ProfesorInterino("12345678C", "juan González López", LocalDate.of(2000, 5, 15), Especialidad.EDUCACION_FISICA, 6);
        // Mostrar datos del interino (usando toString)
        System.out.println(interino);

        Helper helper = new Helper();
        // Calcular y mostrar la edad del profesor
        int edadProfesor = helper.calcularEdad(interino);
        System.out.println("Edad del profesor iterino: " + edadProfesor + " años");

        // Calcular y mostrar la antigüedad del profesor titular
        int antiguedadTitular = helper.CalcularAntiguedad(titular);
        System.out.println("Antigüedad del profesor titular: " + antiguedadTitular + " años");
    }
}