package com.Instituto;

import java.time.LocalDate;

/**
 * Clase que representa un profesor interino del instituto.
 * Hereda de Profesor.
 */
public class ProfesorInterino extends Profesor {
    /** Fecha de finalización del contrato */
    private LocalDate fechaFinContrato;

    /**
     * Constructor de ProfesorInterino
     * @param dni DNI
     * @param nombre Nombre
     * @param fechaNacimiento Fecha de nacimiento
     * @param especialidad Especialidad
     * @param fechaFinContrato Fecha de fin de contrato
     */
    public ProfesorInterino(String dni, String nombre, LocalDate fechaNacimiento, Especialidad especialidad, LocalDate fechaFinContrato) {
        super(dni, nombre, fechaNacimiento, especialidad);
        this.fechaFinContrato = fechaFinContrato;
    }

    /**
     * Devuelve la fecha de fin de contrato
     * @return Fecha de fin de contrato
     */
    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    /**
     * Establece la fecha de fin de contrato
     * @param fechaFinContrato Nueva fecha de fin de contrato
     */
    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
}
