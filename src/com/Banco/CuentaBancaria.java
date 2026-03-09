package com.Banco;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase que representa una cuenta bancaria.
 * Contiene información sobre titulares, saldo, fecha de apertura y número de cuenta.
 */
public class CuentaBancaria {
     /** Conjunto de titulares de la cuenta */
     private final Set<Persona> titulares = new HashSet<>();
     /** Fecha de apertura de la cuenta */
     private final LocalDate fechaApertura = LocalDate.now();
     /** Saldo actual de la cuenta */
     private double saldo;
     /** Número identificador de la cuenta */
     private final String numeroCuenta;
     
     /**
      * Constructor de CuentaBancaria
      * @param numeroCuenta Número identificador de la cuenta
      * @param saldo Saldo inicial de la cuenta
      */
     public CuentaBancaria(String numeroCuenta, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
     }
     
     /**
      * Obtiene el conjunto de titulares de la cuenta
      * @return Conjunto de titulares
      */
     public Set<Persona> getTitulares() {
          return titulares;
     }
     
     /**
      * Limpia el conjunto de titulares
      * @param titulares Parámetro no utilizado
      */
     public void setTitulares(Set<Persona> titulares) {
          this.titulares.clear();
     }
     
     /**
      * Obtiene la fecha de apertura de la cuenta
      * @return Fecha de apertura
      */
     public LocalDate getFechaApertura() {
          return fechaApertura;
     }
     
     /**
      * Obtiene el saldo actual de la cuenta
      * @return Saldo actual
      */
     public double getSaldo() {
          return saldo;
     }
     
     /**
      * Establece el saldo de la cuenta
      * @param saldo Nuevo saldo
      */
     public void setSaldo(double saldo) {
          this.saldo = saldo;
     }
     
     /**
      * Obtiene el número de cuenta
      * @return Número de cuenta
      */
     public  String getNumeroCuenta() {
            return numeroCuenta;
     }
     
     /**
      * Modifica el saldo de la cuenta sumando o restando una cantidad
      * @param cantidad Cantidad a sumar (positiva) o restar (negativa)
      */
     public void variarSaldo(double cantidad) {
            this.saldo += cantidad;
     }
     
     /**
      * Añade un titular a la cuenta
      * @param persona Persona a añadir como titular
      */
     public void añadirTitular(Persona persona) {
            this.titulares.add(persona);
     }
     
     /**
      * Elimina un titular de la cuenta
      * @param persona Persona a eliminar como titular
      */
     public void eliminarTitular(Persona persona) {
            this.titulares.remove(persona);
     }
     
     /**
      * Devuelve la representación en String de la cuenta bancaria
      * @return String con los datos de la cuenta
      */
     @Override
     public String toString() {
          return "CuentaBancaria{ " +
                  "numeroCuenta='" + numeroCuenta + '\'' +
                  ", saldo= " + saldo +
                  " }";
     }
}
