package com.Instituto;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase que representa una persona del instituto.
 * Contiene información común como DNI, nombre y fecha de nacimiento.
 */
public class Persona {
    /** DNI de la persona */
    protected String dni;
    /** Nombre de la persona */
    protected String nombre;
    /** Fecha de nacimiento */
    protected LocalDate fechaNacimiento;

    /**
     * Constructor de Persona
     * @param dni DNI
     * @param nombre Nombre
     * @param fechaNacimiento Fecha de nacimiento
     */
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Devuelve el DNI
     * @return DNI
     */
    public String getDni() {
        return dni;
    }

    /**
     * Devuelve el nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la fecha de nacimiento
     * @return Fecha de nacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // El equals se basa únicamente en el DNI, ya que es el identificador único
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    // El hashCode se basa únicamente en el DNI, ya que es el identificador único
    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    @Override
     public String toString() {
          return String.format("%S,%s,%d/%d/%d", dni, nombre, fechaNacimiento.getDayOfMonth(),
                  fechaNacimiento.getMonthValue(), fechaNacimiento.getYear());
     }
}
