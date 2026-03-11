package com.Instituto;

import java.time.LocalDate;

/**
 * Clase ProfesorTitular - Representa a un profesor con contrato fijo en el centro
 * Un profesor titular es un profesor que tiene una fecha de incorporación al centro
 * Lo que indica cuánto tiempo lleva trabajando en la institución
 * Esta clase hereda de Profesor
 */
public class ProfesorTitular extends Profesor {
    private final LocalDate fechaIncorporacion;

    /**
     * Constructor de ProfesorTitular
     * @param dni El DNI del profesor
     * @param fechaNacimiento La fecha de nacimiento del profesor
     * @param nombrePersona El nombre del profesor
     * @param especialidad La especialidad académica del profesor
     * @param fechaIncorporacion La fecha en que el profesor se incorporó al centro
     */
    public ProfesorTitular(String dni, LocalDate fechaNacimiento, String nombrePersona, Especialidad especialidad, LocalDate fechaIncorporacion) {
        super(dni, fechaNacimiento, nombrePersona, especialidad);
        this.fechaIncorporacion = fechaIncorporacion;
    }

    /**
     * Obtiene la fecha de incorporación del profesor al centro
     * @return La fecha de incorporación del profesor
     */
    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    /**
     * Representación en texto del ProfesorTitular
     * Incluye toda la información de Profesor más la fecha de incorporación
     * @return La representación en texto del ProfesorTitular
     */
    @Override
    public String toString() {
        return super.toString() + fechaIncorporacion;
    }
}
