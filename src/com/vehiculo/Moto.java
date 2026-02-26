package com.vehiculo;

import java.util.Date;

public class Moto extends Vehiculo {
     private int cilindrada;
     
     public Moto(String matricula, int numeroRuedas, String propietario,
                  Date fechacompra, int numeroPasajeros,
                  int cilindrada)
     {
          super(matricula,numeroRuedas, propietario, fechacompra, numeroPasajeros);
          this.cilindrada= cilindrada;
     }
     
     public int getCilindrada() {
          return cilindrada;
     }
     
     public void setCilindrada(int cilindrada) {
          this.cilindrada = cilindrada;
     }
}
