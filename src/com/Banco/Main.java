package com.Banco;

/**
 * Clase Main del módulo Banco.
 * Demuestra el funcionamiento de personas, cuentas bancarias y oficinas bancarias.
 */
public class Main {
     /**
      * Método principal
      * @param args Argumentos de línea de comandos (no utilizados)
      */
     public static  void main(String[] args) {
          // Crear tres personas con sus datos
          Persona persona1 = new Persona("Juan Pérez", "12345678A", "Calle Falsa 123");
          Persona persona2 = new Persona("María Gómez", "87654321B", "Calle Real 456");
          Persona persona3 = new Persona("Carlos López", "11223344C", "Avenida Siempre Viva 789");
          
          // Crear primera cuenta bancaria y agregar titulares
          CuentaBancaria cuenta1 = new CuentaBancaria("ES1234567890", 1000.0);
          cuenta1.añadirTitular(persona1);
          cuenta1.añadirTitular(persona2);
          // Mostrar titulares de la cuenta
          System.out.println(cuenta1.getTitulares());
          // Eliminar un titular
          cuenta1.eliminarTitular(persona1);
          
          // Realizar operaciones sobre el saldo
          cuenta1.variarSaldo(500.0);// Ingresar dinero
          System.out.println(cuenta1.getSaldo());
          cuenta1.variarSaldo(-200.0);// Retirar dinero
          System.out.println(cuenta1.getSaldo());
          
          // Comparar dos personas usando equals
          System.out.println(persona1.equals(persona2));
          // Mostrar el hashCode de una persona
          System.out.println(persona1.hashCode());
          
          // Crear segunda cuenta bancaria con tercera persona
          CuentaBancaria cuenta2 = new CuentaBancaria("ES4571567890", 200.0);
          cuenta2.añadirTitular(persona3);
          
          // Crear una oficina bancaria y agregar cuentas
          OficinaBancaria oficina = new OficinaBancaria("Sucursal Central");
          oficina.addCuentaBancaria(cuenta1);
          oficina.addCuentaBancaria(cuenta2);
          
          // Realizar búsquedas y obtener información de la oficina
          System.out.println(oficina.getCuentasBancarias());
          System.out.println("Saldo mayor en la oficina: " + oficina.getSaldoMayorOficina());
          System.out.println("Cuenta con saldo inferior a 300: " + oficina.getCuentaSaldoInferior(300.0));
          System.out.println("Cuenta por DNI 11223344C: " + oficina.getCuentaPorDNI("11223344C"));
          
     }
}
