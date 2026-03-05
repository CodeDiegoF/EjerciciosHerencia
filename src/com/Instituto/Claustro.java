package com.Instituto;

import java.time.LocalDate;
import java.util.*;

/**
 * Clase que representa el claustro de profesores del instituto.
 * Permite añadir, eliminar y listar profesores.
 */
public class Claustro {
     /** Lista de profesores del claustro */
     private List<Profesor> profesores = new ArrayList<>();

     /**
      * Añade un profesor al claustro
      * @param profesor Profesor a añadir
      */
     public void addProfesor(Profesor profesor) {
         profesores.add(profesor);
     }

     /**
      * Elimina un profesor del claustro
      * @param profesor Profesor a eliminar
      */
     public void removeProfesor(Profesor profesor) {
         profesores.remove(profesor);
     }

     /**
      * Devuelve la lista de profesores
      * @return Lista de profesores
      */
     public List<Profesor> getProfesores() {
         return profesores;
     }
}
