package com.vehiculo;

import java.util.Date;

/**
 * Clase que representa un coche, hereda de Vehiculo.
 * Añade información sobre si es diésel y si es descapotable.
 */
public class Coche extends Vehiculo {
    /** Indica si el coche es diésel */
    private boolean diesel;
    /** Indica si el coche es descapotable */
    private boolean descapotable;

    /**
     * Constructor de Coche
     * @param matricula Matrícula
     * @param numeroRuedas Número de ruedas
     * @param propietario Propietario
     * @param fechacompra Fecha de compra
     * @param numeroPasajeros Número de pasajeros
     * @param diesel Si es diésel
     * @param descapotable Si es descapotable
     */
    public Coche(String matricula, int numeroRuedas, String propietario,
                 Date fechacompra, int numeroPasajeros,
                 boolean diesel, boolean descapotable)
    {
        super(matricula, numeroRuedas, propietario, fechacompra, numeroPasajeros);
        this.diesel = diesel;
        this.descapotable = descapotable;
    }

    /**
     * Indica si el coche es diésel
     * @return true si es diésel
     */
    public boolean esDiesel() {
        return diesel;
    }

    /**
     * Indica si el coche es descapotable
     * @return true si es descapotable
     */
    public boolean esDescapotable() {
        return descapotable;
    }
}
