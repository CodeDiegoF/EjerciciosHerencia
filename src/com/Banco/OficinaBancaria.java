package com.Banco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase que representa una oficina bancaria.
 * Gestiona un conjunto de cuentas bancarias.
 */
public class OficinaBancaria {
     /** Número de sucursal */
     private String numeroSucursal;
     /** Mapa de cuentas bancarias (clave: número de cuenta, valor: cuenta) */
     private final Map<String, CuentaBancaria> cuentasBancaria = new HashMap<>();

     /**
      * Constructor de OficinaBancaria
      * @param numeroSucursal Número identificador de la sucursal
      */
     public OficinaBancaria(String numeroSucursal) {
            this.numeroSucursal = numeroSucursal;
     }
     
     /**
      * Obtiene el número de sucursal
      * @return Número de sucursal
      */
     public String getNumeroSucursal() {
          return numeroSucursal;
     }
     
     /**
      * Establece el número de sucursal
      * @param numeroSucursal Nuevo número de sucursal
      */
     public void setNumeroSucursal(String numeroSucursal) {
          this.numeroSucursal = numeroSucursal;
     }
     
     /**
      * Obtiene el mapa de cuentas bancarias
      * @return Mapa de cuentas
      */
     public Map<String, CuentaBancaria> getCuentasBancaria() {
          return cuentasBancaria;
     }
     
     /**
      * Añade una cuenta bancaria a la sucursal
      * @param cuenta Cuenta a añadir
      */
     public void addCuentaBancaria(CuentaBancaria cuenta) {
          this.cuentasBancaria.put(cuenta.getNumeroCuenta(), cuenta);
     }
     
     /**
      * Elimina una cuenta bancaria de la sucursal
      * @param numeroCuenta Número de la cuenta a eliminar
      */
     public void eliminarCuentaBancaria(String numeroCuenta) {
            this.cuentasBancaria.remove(numeroCuenta);
     }
     
     /**
      * Obtiene una lista de todas las cuentas bancarias
      * @return Lista de cuentas
      */
     public List<CuentaBancaria> getCuentasBancarias() {
            return List.copyOf(cuentasBancaria.values());
     }
     
     /**
      * Obtiene el saldo mayor entre todas las cuentas de la oficina
      * @return Saldo mayor
      */
     public double getSaldoMayorOficina() {
          double mayorSaldo = 0;
          for (CuentaBancaria cuenta : cuentasBancaria.values()) {
                 if (cuenta.getSaldo() > mayorSaldo) {
                       mayorSaldo = cuenta.getSaldo();
                 }
          }
            return mayorSaldo;
     }
     
     /**
      * Obtiene la primera cuenta con saldo inferior al especificado
      * @param saldo Saldo de referencia
      * @return Cuenta con saldo inferior, null si no la encuentra
      */
     public CuentaBancaria getCuentaSaldoInferior(double saldo){
          for (CuentaBancaria cuenta : cuentasBancaria.values()) {
                if (cuenta.getSaldo() < saldo) {
                      return cuenta;
                }
          }
          return null;
     }
     
     /**
      * Obtiene la cuenta bancaria de un titular por su DNI
      * @param dni DNI del titular a buscar
      * @return Cuenta del titular, null si no la encuentra
      */
     public CuentaBancaria getCuentaPorDNI(String dni){
            for (CuentaBancaria cuenta : cuentasBancaria.values()) {
                 for (Persona titular : cuenta.getTitulares()) {
                        if (titular.getDni().equals(dni)) {
                             return cuenta;
                        }
                 }
            }
            return null;
     }
}
