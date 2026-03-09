package com.Instituto;
import java.time.LocalDate;

/**
 * Clase de ayuda con utilidades para profesores.
 * Proporciona métodos para calcular edad y antigüedad.
 */
public class Helper {
    /**
     * Calcula la edad de un profesor a partir de su fecha de nacimiento.
     * @param profesor Profesor del que se calcula la edad
     * @return Edad en años
     */
    public int calcularEdad(Profesor profesor) {
        return LocalDate.now().getYear() - profesor.getFechaNacimiento().getYear();
    }
    
    /**
     * Calcula la antigüedad de un profesor titular a partir de su fecha de incorporación.
     * @param profesor ProfesorTitular del que se calcula la antigüedad
     * @return Antigüedad en años
     */
    public int CalcularAntiguedad(ProfesorTitular profesor) {
        return LocalDate.now().getYear() - profesor.getFechaIncorporacion().getYear();
    }
}
