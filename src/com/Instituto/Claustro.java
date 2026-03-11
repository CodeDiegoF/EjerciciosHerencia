package com.Instituto;

import java.time.LocalDate;
import java.util.*;

/**
 * Clase Claustro - Representa el conjunto de profesores de un centro educativo
 * Un claustro gestiona todos los profesores que trabajan en un centro
 * Proporciona métodos para agregar, eliminar, buscar y analizar profesores
 */
public class Claustro {
    private static LocalDate fechaActual = LocalDate.now();
    private String nombreCentro;
    private final Map<String, Profesor> profesores = new HashMap<>();

    /**
     * Constructor del Claustro
     * @param nombreCentro El nombre del centro educativo
     */
    public Claustro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    /**
     * Obtiene la fecha actual del sistema (estática)
     * @return La fecha actual
     */
    public static LocalDate getFechaActual() {
        return fechaActual;
    }

    /**
     * Modifica la fecha actual del sistema (estática)
     * Se usa principalmente para pruebas o simulaciones
     * @param fechaActual La nueva fecha actual
     */
    public static void setFechaActual(LocalDate fechaActual) {
        Claustro.fechaActual = fechaActual;
    }

    /**
     * Obtiene el nombre del centro educativo
     * @return El nombre del centro
     */
    public String getNombreCentro() {
        return nombreCentro;
    }

    /**
     * Modifica el nombre del centro educativo
     * @param nombreCentro El nuevo nombre del centro
     */
    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    /**
     * Obtiene el mapa completo de profesores
     * @return El mapa de profesores (DNI -> Profesor)
     */
    public Map<String, Profesor> getProfesores() {
        return profesores;
    }

    /**
     * Busca un profesor específico por su DNI
     * @param dni El DNI del profesor a buscar
     * @return El profesor encontrado o null si no existe
     */
    public Profesor getProfesorPorDNI(String dni) {
        for(Profesor profesor : profesores.values()){
            if(profesor.getDni().equals(dni)){
                return profesor;
            }
        }
        return null;
    }

    /**
     * Agrega un nuevo profesor al claustro
     * @param profesor El profesor a agregar
     */
    public void addProfesor(Profesor profesor) {
        profesores.put(profesor.getDni(), profesor);
    }

    /**
     * Elimina un profesor del claustro por su DNI
     * @param dni El DNI del profesor a eliminar
     */
    public void removeProfesor(Profesor profesor) {
        profesores.remove(profesor.getDni());
    }

    /**
     * Busca todos los profesores que tengan una edad específica
     * @param edad La edad a buscar
     * @return Lista de profesores con la edad indicada
     */
    public List<Profesor> getProfesoresPorEdad(int edad){
        List<Profesor> profesores = new ArrayList<>();
        for (Profesor profesor : this.profesores.values()){
            if (new Helper().obtenerEdad(profesor) == edad){
                profesores.add(profesor);
            }
        }
        return profesores;
    }

    /**
     * Busca todos los profesores titulares que tengan una antigüedad específica
     * @param antiguedad La antigüedad (en años) a buscar
     * @return Lista de profesores titulares con la antigüedad indicada
     */
    public List<ProfesorTitular> getProfesoresPorAntiguedad(int antiguedad){
        List<ProfesorTitular> profesores = new ArrayList<>();
        for (Profesor profesor : this.profesores.values()){
            if (profesor instanceof ProfesorTitular){
                ProfesorTitular profesorTitular = (ProfesorTitular) profesor;
                if (new Helper().calcularAntiguedad(profesorTitular) == antiguedad){
                    profesores.add(profesorTitular);
                }
            }
        }
        return profesores;
    }

    /**
     * Calcula la edad media de todos los profesores del claustro
     * @return La edad media (como número decimal)
     */
    public double calcularEdadMediaProfesores(){
        int edad = 0;
        for (Profesor profesor : this.profesores.values()){
            edad += new Helper().obtenerEdad(profesor);
        }
        return (double) edad / this.profesores.size();
    }

    /**
     * Representación en texto del Claustro
     * Muestra el nombre del centro y la lista de profesores
     * @return La representación en texto del Claustro
     */
    @Override
    public String toString() {
        return "Claustro{ " +
                "nombreCentro='" + nombreCentro + '\'' +
                ", profesores=" + profesores +
                '}';
    }
}
