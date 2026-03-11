package com.Instituto;

import java.time.LocalDate;
import java.util.List;

/**
 * Clase Main - Programa principal para demostrar el funcionamiento de Claustro y Helper
 * Este programa crea un claustro de profesores y realiza diversas operaciones con ellos
 */
public class Main {
    /**
     * Método main - Punto de entrada del programa
     * Demuestra la creación de un claustro, adición/eliminación de profesores,
     * y realiza búsquedas y cálculos usando los métodos disponibles
     * @param args Argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        /**
         * Crea una instancia de Claustro con el nombre "Instituto Nacional"
         * El claustro es el contenedor de todos los profesores del centro
         */
        Claustro claustro = new Claustro("Instituto Nacional");

        /**
         * Crea un profesor regular con los siguientes datos:
         * DNI: 12345678A, Fecha de nacimiento: 20/05/1980, Nombre: Juan Perez
         * Especialidad: MATEMATICAS
         */
        Profesor profesor1 = new Profesor("12345678A", LocalDate.of(1980, 5, 20), "Juan Perez", Especialidad.MATEMATICAS);

        /**
         * Crea otro profesor regular con los siguientes datos:
         * DNI: 87654321B, Fecha de nacimiento: 15/08/1980, Nombre: Maria Gomez
         * Especialidad: LENGUA
         */
        Profesor profesor2 = new Profesor("87654321B", LocalDate.of(1980, 8, 15), "Maria Gomez", Especialidad.LENGUA);

        /**
         * Crea un profesor titular (con contrato fijo) con los siguientes datos:
         * DNI: 11223344C, Fecha de nacimiento: 10/03/1970, Nombre: Carlos Sanchez
         * Especialidad: INGLES, Fecha de incorporación: 01/01/2000
         */
        ProfesorTitular profesorTitular1 = new ProfesorTitular("11223344C", LocalDate.of(1970, 3, 10), "Carlos Sanchez", Especialidad.INGLES, LocalDate.of(2000, 1, 1));

        /**
         * Crea un profesor interino (con contrato temporal) con los siguientes datos:
         * DNI: 44332211D, Fecha de nacimiento: 05/12/1990, Nombre: Ana Martinez
         * Especialidad: LENGUA, Meses de contratación: 3 meses
         */
        ProfesorInterino profesorInterino = new ProfesorInterino("44332211D", LocalDate.of(1990, 12, 5), "Ana Martinez", Especialidad.LENGUA, 3);

        /**
         * Agrega el profesor1 al claustro usando el método addProfesor()
         * El profesor se almacena en el mapa con su DNI como clave
         */
        claustro.addProfesor(profesor1);

        /**
         * Agrega el profesor2 al claustro usando el método addProfesor()
         * Ahora el claustro tiene 2 profesores
         */
        claustro.addProfesor(profesor2);

        /**
         * Imprime todos los profesores actualmente en el claustro
         * Debe mostrar profesor1 y profesor2
         */
        System.out.println(claustro.getProfesores());

        /**
         * Elimina el profesor2 del claustro usando su DNI
         * El claustro ahora solo tiene 1 profesor (profesor1)
         */
        claustro.removeProfesor(profesor2);

        /**
         * Imprime todos los profesores después de la eliminación
         * Debe mostrar solo profesor1
         */
        System.out.println(claustro.getProfesores());

        /**
         * Agrega el profesor titular al claustro
         * Ahora hay 2 profesores en el claustro
         */
        claustro.addProfesor(profesorTitular1);

        /**
         * Agrega el profesor interino al claustro
         * Ahora hay 3 profesores en el claustro
         */
        claustro.addProfesor(profesorInterino);

        /**
         * Crea una instancia de Helper para usar sus métodos auxiliares
         * Helper proporciona funciones para calcular edad y antigüedad
         */
        Helper helper = new Helper();

        /**
         * Calcula y imprime la edad actual del profesor1
         * Utiliza el método obtenerEdad() que devuelve la edad en años
         */
        System.out.println("Edad profesor1: " + helper.obtenerEdad(profesor1));

        /**
         * Calcula y imprime los años de antigüedad del profesorTitular1
         * Utiliza el método calcularAntiguedad() que devuelve años desde su incorporación
         */
        System.out.println("Antiguedad profesorTitular1: " + helper.calcularAntiguedad(profesorTitular1));

        /**
         * Busca todos los profesores de 46 años de edad en el claustro
         * Utiliza el método getProfesoresPorEdad() que devuelve una lista
         */
        System.out.println("Profesores por edad 46: " + claustro.getProfesoresPorEdad(46));

        /**
         * Busca todos los profesores titulares con 26 años de antigüedad
         * Utiliza el método getProfesoresPorAntiguedad() que devuelve una lista
         */
        System.out.println("Profesores por antiguedad 26: " + claustro.getProfesoresPorAntiguedad(26));

        /**
         * Busca un profesor específico por su DNI (11223344C)
         * Utiliza el método getProfesorPorDNI() que devuelve el profesor o null
         */
        System.out.println("Profesor por DNI 11223344C: " + claustro.getProfesorPorDNI("11223344C"));

        /**
         * Calcula y imprime la edad media de todos los profesores del claustro
         * Utiliza el método calcularEdadMediaProfesores() que devuelve un double
         */
        System.out.println("Edad Media: " + claustro.calcularEdadMediaProfesores());

    }
}
