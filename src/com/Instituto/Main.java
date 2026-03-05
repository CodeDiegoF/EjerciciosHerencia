package com.Instituto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una persona
        Persona persona1 = new Persona("12345678A", "jacinto gómez gómez", LocalDate.of(2000, 12, 1));
         System.out.println(persona1);
         System.out.println("***************************************");
         
        // Crear otra persona y usar equals
        Persona persona2 = new Persona("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1));
        System.out.println(persona1.equals(persona2)); // false
        System.out.println(persona2.getDni() + "," + persona2.getNombre() + "," + persona2.getFechaNacimiento().getDayOfMonth() + "/" + persona2.getFechaNacimiento().getMonthValue() + "/" + persona2.getFechaNacimiento().getYear() + "," + Especialidad.EDUCACION_FISICA);

        System.out.println("***************************************");

        // Crear un profesor de una especialidad
        Profesor profesor = new Profesor("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1), Especialidad.EDUCACION_FISICA);
        // Crear un profesor titular
        ProfesorTitular titular = new ProfesorTitular("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1), Especialidad.EDUCACION_FISICA, LocalDate.of(2020, 1, 24));
        System.out.println(titular);

        // Crear un profesor interino
        ProfesorInterino interino = new ProfesorInterino("12345678B", "marisa perales ruíz", LocalDate.of(2000, 12, 1), Especialidad.EDUCACION_FISICA, LocalDate.of(2026, 3, 5));
        // Mostrar datos del interino (usando los getters)
        System.out.println(interino.getDni() + ", " + interino.getNombre() + "," + interino.getFechaNacimiento().getDayOfMonth() + "/" + interino.getFechaNacimiento().getMonthValue() + "/" + interino.getFechaNacimiento().getYear() + "," + interino.getEspecialidad() + "," + interino.getFechaFinContrato().getDayOfMonth());
    }
}