package com.Instituto;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase Persona - Representa a una persona con datos básicos
 * Esta es la clase base de la cual heredan los profesores
 * Contiene información fundamental como DNI, nombre y fecha de nacimiento
 */
public class Persona {
    private final String dni;
    private String nombrePersona;
    private final LocalDate fechaNacimiento;

    /**
     * Constructor de Persona
     * @param dni El DNI de la persona (identificador único)
     * @param fechaNacimiento La fecha de nacimiento de la persona
     * @param nombrePersona El nuevo nombre de la persona
     */
    public Persona(String dni, LocalDate fechaNacimiento, String nombrePersona) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombrePersona = nombrePersona;
    }

    /**
     * Obtiene el DNI de la persona
     * @return El DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene el nombre de la persona
     * @return El nombre de la persona
     */
    public String getNombrePersona() {
        return nombrePersona;
    }

    /**
     * Modifica el nombre de la persona
     * @param nombrePersona El nuevo nombre de la persona
     */
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona
     * @return La fecha de nacimiento de la persona
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Compara dos personas por su DNI
     * Dos personas son iguales si tienen el mismo DNI
     * @param o El objeto a comparar
     * @return true si tienen el mismo DNI, false en caso contrario
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    /**
     * Calcula el hash code basado en el DNI
     * Se usa para almacenar objetos en HashMap y HashSet
     * @return El hash code basado en el DNI
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    /**
     * Representación en texto de la Persona
     * Formato: DNI,NOMBRE,DÍA/MES/AÑO
     * Ejemplo: 12345678A,Juan Perez,20/5/1980
     * @return La representación en texto de la Persona
     */
    @Override
    public String toString() {
        return String.format("%S,%s,%d/%d/%d", dni, nombrePersona, fechaNacimiento.getDayOfMonth(),
                fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());

    }
}
