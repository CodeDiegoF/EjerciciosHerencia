package com.Instituto;

import java.time.LocalDate;

/**
 * Clase que representa un profesor interino del instituto.
 * Hereda de Profesor.
 */
public class ProfesorInterino extends Profesor {
    /** Fecha de finalización del contrato */
    private int mesesContratacion;

    /**
     * Constructor de ProfesorInterino
     * @param dni DNI
     * @param nombre Nombre
     * @param fechaNacimiento Fecha de nacimiento
     * @param especialidad Especialidad
     * @param mesesContratacion Meses de contratación
     */
    public ProfesorInterino(String dni, String nombre, LocalDate fechaNacimiento, Especialidad especialidad, int mesesContratacion) {
        super(dni, nombre, fechaNacimiento, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    /**
     * Devuelve los meses de contratación
     * @return mesesContratacion
     */
    public int getMesesContratacion() {
        return mesesContratacion;
    }

    /**
     * Establece los meses de contratación
     * @param mesesContratacion Meses de contratación
     */public void setMesesContratacion(int mesesContratacion) {
        this.mesesContratacion = mesesContratacion;
    }
    
        @Override
        public String toString() {
             return String.format("%s,%d", super.toString(), mesesContratacion);
        }
}
