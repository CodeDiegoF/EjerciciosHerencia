package com.Instituto;

import java.time.LocalDate;

/**
 * Clase que representa un profesor del instituto.
 * Hereda de Persona y añade la especialidad.
 */
public class Profesor extends Persona {
    /** Especialidad del profesor */
    protected Especialidad especialidad;

    /**
     * Constructor de Profesor
     * @param dni DNI
     * @param nombre Nombre
     * @param fechaNacimiento Fecha de nacimiento
     * @param especialidad Especialidad
     */
    public Profesor(String dni, String nombre, LocalDate fechaNacimiento, Especialidad especialidad) {
        super(dni, nombre, fechaNacimiento);
        this.especialidad = especialidad;
    }

    /**
     * Devuelve la especialidad
     * @return Especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
