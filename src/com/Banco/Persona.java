package com.Banco;

import java.util.Objects;

public class Persona {
     private String nombre;
     private final String dni;
     private String direccionPersona;
     
        public Persona(String nombre, String dni, String direccionPersona) {
            this.nombre = nombre;
            this.dni = dni;
            this.direccionPersona = direccionPersona;
        }
     
     public String getNombre() {
          return nombre;
     }
     
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     
     public String getDni() {
          return dni;
     }
     
     public String getDireccionPersona() {
          return direccionPersona;
     }
     
     public void setDireccionPersona(String direccionPersona) {
          this.direccionPersona = direccionPersona;
     }
     
     @Override
     public String toString() {
          return "Persona{ " +
                  "nombre= " + nombre + '\'' +
                  ", dni= " + dni + '\'' +
                  ", direccionPersona= " + direccionPersona + '\'' +
                  " }";
     }
     
     @Override
     public boolean equals(Object o) {
          if (o == null || getClass() != o.getClass()) return false;
          Persona persona = (Persona) o;
          return Objects.equals(dni, persona.dni);
     }
     
     @Override
     public int hashCode() {
          return Objects.hashCode(dni);
     }
}
