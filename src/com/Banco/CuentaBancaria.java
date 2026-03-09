package com.Banco;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class CuentaBancaria {
     private final Set<Persona> titulares = new HashSet<>();
     private final LocalDate fechaApertura = LocalDate.now();
     private double saldo;
     private final String numeroCuenta;
     
     public CuentaBancaria(String numeroCuenta, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
     }
     
     public Set<Persona> getTitulares() {
          return titulares;
     }
     
     public void setTitulares(Set<Persona> titulares) {
          this.titulares.clear();
     }
     
     public LocalDate getFechaApertura() {
          return fechaApertura;
     }
     
     public double getSaldo() {
          return saldo;
     }
     
     public void setSaldo(double saldo) {
          this.saldo = saldo;
     }
     
     public  String getNumeroCuenta() {
            return numeroCuenta;
     }
     
     public void variarSaldo(double cantidad) {
            this.saldo += cantidad;
     }
     
     public void añadirTitular(Persona persona) {
            this.titulares.add(persona);
     }
     
     public void eliminarTitular(Persona persona) {
            this.titulares.remove(persona);
     }
     
     
}
