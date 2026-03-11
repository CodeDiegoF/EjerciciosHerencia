package com.Instituto;
import java.time.LocalDate;

/**
 * Clase Helper - Clase utilitaria con métodos auxiliares
 * Proporciona funciones de cálculo comunes para el sistema de profesores
 * No necesita atributos, solo ofrece métodos de ayuda reutilizables
 */
public class Helper {

    /**
     * Calcula la edad actual de un profesor en años
     * Utiliza la fecha actual del sistema para realizar el cálculo
     * @param profesor El profesor del cual calcular la edad
     * @return La edad del profesor en años (considerando solo el año, sin meses ni días)
     */
    public int obtenerEdad(Profesor profesor){
        return LocalDate.now().getYear() - profesor.getFechaNacimiento().getYear();
    }

    /**
     * Calcula la antigüedad en años de un profesor titular en el centro
     * Es decir, cuántos años lleva trabajando en el centro desde su incorporación
     * @param profesor El profesor titular del cual calcular la antigüedad
     * @return Los años de antigüedad del profesor en el centro (considerando solo el año)
     */
    public int calcularAntiguedad(ProfesorTitular profesor){
        return LocalDate.now().getYear() - profesor.getFechaIncorporacion().getYear();
    }
}
