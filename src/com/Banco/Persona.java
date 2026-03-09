package com.Banco;

import java.util.Objects;

/**
 * Clase que representa una persona del banco.
 * Contiene información personal como nombre, DNI y dirección.
 */
public class Persona {
     /** Nombre de la persona */
     private String nombre;
     /** DNI de la persona (identificador único) */
     private final String dni;
     /** Dirección de la persona */
     private String direccionPersona;
     
        /**
         * Constructor de Persona
         * @param nombre Nombre de la persona
         * @param dni DNI de la persona
         * @param direccionPersona Dirección de la persona
         */
        public Persona(String nombre, String dni, String direccionPersona) {
            this.nombre = nombre;
            this.dni = dni;
            this.direccionPersona = direccionPersona;
        }
     
     /**
      * Obtiene el nombre de la persona
      * @return Nombre de la persona
      */
     public String getNombre() {
          return nombre;
     }
     
     /**
      * Establece el nombre de la persona
      * @param nombre Nuevo nombre
      */
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     
     /**
      * Obtiene el DNI de la persona
      * @return DNI de la persona
      */
     public String getDni() {
          return dni;
     }
     
     /**
      * Obtiene la dirección de la persona
      * @return Dirección de la persona
      */
     public String getDireccionPersona() {
          return direccionPersona;
     }
     
     /**
      * Establece la dirección de la persona
      * @param direccionPersona Nueva dirección
      */
     public void setDireccionPersona(String direccionPersona) {
          this.direccionPersona = direccionPersona;
     }
     
     /**
      * Devuelve la representación en String de la persona
      * @return String con los datos de la persona
      */
     @Override
     public String toString() {
          return "Persona{ " +
                  "nombre= " + nombre + '\'' +
                  ", dni= " + dni + '\'' +
                  ", direccionPersona= " + direccionPersona + '\'' +
                  " }";
     }
     
     /**
      * Compara dos personas por su DNI
      * El DNI es el identificador único
      * @param o Objeto a comparar
      * @return true si el DNI es igual, false en caso contrario
      */
     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          Persona persona = (Persona) o;
          return Objects.equals(dni, persona.dni);
     }
     
     /**
      * Calcula el hashCode basado en el DNI
      * @return hashCode de la persona
      */
     @Override
     public int hashCode() {
          return Objects.hashCode(dni);
     }
}
