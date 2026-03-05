package com.vehiculo;

import java.util.Date;

/**
 * Clase que representa una moto, hereda de Vehiculo.
 * Añade información sobre la cilindrada.
 */
public class Moto extends Vehiculo {
    /** Cilindrada de la moto */
    private int cilindrada;

    /**
     * Constructor de Moto
     * @param matricula Matrícula
     * @param numeroRuedas Número de ruedas
     * @param propietario Propietario
     * @param fechacompra Fecha de compra
     * @param numeroPasajeros Número de pasajeros
     * @param cilindrada Cilindrada de la moto
     */
    public Moto(String matricula, int numeroRuedas, String propietario,
                Date fechacompra, int numeroPasajeros,
                int cilindrada)
    {
        super(matricula,numeroRuedas, propietario, fechacompra, numeroPasajeros);
        this.cilindrada= cilindrada;
    }

    /**
     * Devuelve la cilindrada
     * @return Cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Establece la cilindrada
     * @param cilindrada Nueva cilindrada
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
