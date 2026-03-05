package com.Instituto;

import java.time.LocalDate;

/**
 * Clase que representa un profesor titular del instituto.
 * Hereda de Profesor y añade la fecha de incorporación.
 */
public class ProfesorTitular extends Profesor {
    /** Fecha de incorporación al instituto */
    private LocalDate fechaIncorporacion;

    /**
     * Constructor de ProfesorTitular
     * @param dni DNI del profesor
     * @param nombre Nombre del profesor
     * @param fechaNacimiento Fecha de nacimiento
     * @param especialidad Especialidad del profesor
     * @param fechaIncorporacion Fecha de incorporación
     */
    public ProfesorTitular(String dni, String nombre, LocalDate fechaNacimiento, Especialidad especialidad, LocalDate fechaIncorporacion) {
        super(dni, nombre, fechaNacimiento, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    /**
     * Obtiene la fecha de incorporación
     * @return fecha de incorporación
     */
    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    /**
     * Establece la fecha de incorporación
     * @param fechaIncorporacion nueva fecha de incorporación
     */
    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    /**
     * Devuelve la representación en String del ProfesorTitular, incluyendo especialidad y fecha de incorporación
     * @return String con los datos del profesor titular
     */
    @Override
    public String toString() {
        return String.format("%s, %s, %02d/%02d/%04d", super.toString(), getEspecialidad(), fechaIncorporacion.getDayOfMonth(),
                fechaIncorporacion.getMonthValue(), fechaIncorporacion.getYear());
    }
}
