package com.Instituto;
import java.time.LocalDate;

/**
 * Clase ProfesorInterino - Representa a un profesor con contrato temporal
 * Un profesor interino es un profesor que tiene un contrato por tiempo limitado
 * La duración del contrato se especifica en meses
 * Esta clase hereda de Profesor
 */
public class ProfesorInterino extends Profesor {
    private int mesesContratacion;

    /**
     * Constructor de ProfesorInterino
     * @param dni El DNI del profesor
     * @param fechaNacimiento La fecha de nacimiento del profesor
     * @param nombrePersona El nombre del profesor
     * @param especialidad La especialidad académica del profesor
     * @param mesesContratacion El número de meses de contratación
     */
    public ProfesorInterino(String dni, LocalDate fechaNacimiento, String nombrePersona, Especialidad especialidad, int mesesContratacion) {
        super(dni, fechaNacimiento, nombrePersona, especialidad);
        this.mesesContratacion = mesesContratacion;
    }

    /**
     * Representación en texto del ProfesorInterino
     * Incluye toda la información de Profesor más los meses de contratación
     * @return La representación en texto del ProfesorInterino
     */
    @Override
    public String toString() {
        return String.format("%s,%d", super.toString(), mesesContratacion);
    }
}
