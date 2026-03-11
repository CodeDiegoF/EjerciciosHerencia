package com.Instituto;
import java.time.LocalDate;

/**
 * Clase Profesor - Representa a un profesor que es una especialización de Persona
 * Un profesor tiene todos los atributos de Persona más una especialidad académica
 * Esta clase es base para ProfesorTitular y ProfesorInterino
 */
public class Profesor extends Persona {
    private Especialidad especialidad;

    /**
     * Constructor de Profesor
     * @param dni El DNI del profesor
     * @param fechaNacimiento La fecha de nacimiento del profesor
     * @param nombrePersona El nombre del profesor
     * @param especialidad La especialidad académica del profesor
     */
    public Profesor(String dni, LocalDate fechaNacimiento, String nombrePersona, Especialidad especialidad) {
        super(dni, fechaNacimiento, nombrePersona);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad del profesor
     * @return La especialidad del profesor
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Modifica la especialidad del profesor
     * @param especialidad La nueva especialidad del profesor
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Representación en texto del Profesor
     * Incluye toda la información de Persona más la especialidad
     * @return La representación en texto del Profesor
     */
    @Override
    public String toString() {
        return String.format("%s,%s", super.toString(), especialidad);
    }
}
