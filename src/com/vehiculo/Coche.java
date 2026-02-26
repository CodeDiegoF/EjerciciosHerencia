package com.vehiculo;

import java.util.Date;

public class Coche extends Vehiculo {
     private boolean diesel;
     private boolean descapotable;
     
     public Coche(int numeroRuedas, String propietario,
                  Date fechacompra, int numeroPasajeros,
                  boolean diesel, boolean descapotable)
     {
          super(numeroRuedas, propietario, fechacompra, numeroPasajeros);
          this.diesel = diesel;
          this.descapotable = descapotable;
     }
     
     public boolean esDiesel() {
          return diesel;
     }
     
     public boolean esDescapotable() {
          return descapotable;
     }
}
