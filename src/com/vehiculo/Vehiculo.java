package com.vehiculo;

import java.util.Date;
import java.util.Objects;

/**
 * Clase base para vehículos.
 * Contiene información común como matrícula, propietario, fecha de compra y número de pasajeros.
 */
public class Vehiculo {
    /** Matrícula del vehículo */
    protected final String matricula;
    /** Número de ruedas */
    protected int numeroRuedas;
    /** Propietario del vehículo */
    protected String propietario;
    /** Fecha de compra */
    protected Date fechacompra;
    /** Número de pasajeros */
    protected int numeroPasajeros;

    /**
     * Constructor de Vehiculo
     * @param matricula Matrícula
     * @param numeroRuedas Número de ruedas
     * @param propietario Propietario
     * @param fechacompra Fecha de compra
     * @param numeroPasajeros Número de pasajeros
     */
    public Vehiculo(String matricula, int numeroRuedas, String propietario,
                    Date fechacompra, int numeroPasajeros)
    {
        this.matricula = matricula;
        this.numeroRuedas = numeroRuedas;
        this.propietario = propietario;
        this.fechacompra = fechacompra;
        this.numeroPasajeros = numeroPasajeros;
    }

    /**
     * Devuelve el propietario
     * @return Propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Establece el propietario
     * @param propietario Nuevo propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Devuelve la fecha de compra
     * @return Fecha de compra
     */
    public Date getFechacompra() {
        return fechacompra;
    }

    /**
     * Devuelve el número de pasajeros
     * @return Número de pasajeros
     */
    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    /**
     * Compara dos vehículos por matrícula
     * @param obj Objeto a comparar
     * @return true si la matrícula es igual
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return Objects.equals(matricula, vehiculo.matricula);
    }

    /**
     * HashCode basado en la matrícula
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
