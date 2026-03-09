package com.Banco;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OficinaBancaria {
     private String numeroSucursal;
     private final Map<String, CuentaBancaria> cuentasBancaria = new HashMap<>();

     public OficinaBancaria(String numeroSucursal) {
            this.numeroSucursal = numeroSucursal;
     }
     public String getNumeroSucursal() {
          return numeroSucursal;
     }
        
     public void setNumeroSucursal(String numeroSucursal) {
          this.numeroSucursal = numeroSucursal;
     }
        
     public Map<String, CuentaBancaria> getCuentasBancaria() {
          return cuentasBancaria;
     }
     
     public void addCuentaBancaria(CuentaBancaria cuenta) {
          this.cuentasBancaria.put(cuenta.getNumeroCuenta(), cuenta);
     }
     
     public void eliminarCuentaBancaria(String numeroCuenta) {
            this.cuentasBancaria.remove(numeroCuenta);
     }
     
     public List<CuentaBancaria> getCuentasBancarias() {
            return List.copyOf(cuentasBancaria.values());
     }
     
     public double getSaldoMayorOficina() {
          double mayorSaldo = 0;
          for (CuentaBancaria cuenta : cuentasBancaria.values()) {
                 if (cuenta.getSaldo() > mayorSaldo) {
                       mayorSaldo = cuenta.getSaldo();
                 }
          }
            return mayorSaldo;
     }
     
     public CuentaBancaria getCuentaSaldoInferior(double saldo){
          for (CuentaBancaria cuenta : cuentasBancaria.values()) {
                if (cuenta.getSaldo() < saldo) {
                      return cuenta;
                }
          }
          return null;
     }
     
     
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
