package com.vehiculo;

import java.util.Date;

public class Vehiculo {
     protected int numeroRuedas;
     protected String propietario;
     protected Date fechacompra;
     protected  int numeroPasajeros;
     
     public Vehiculo(int numeroRuedas, String propietario,
                     Date fechacompra, int numeroPasajeros)
     {
          this.numeroRuedas = numeroRuedas;
          this.propietario = propietario;
          this.fechacompra = fechacompra;
          this.numeroPasajeros = numeroPasajeros;
     }
     
     public String getPropietario()
     {
          return propietario;
     }
     
     public void setPropietario(String propietario)
     {
          this.propietario = propietario;
     }
     
     public Date  getFechacompra()
     {
          return fechacompra;
     }
     
     public int getNumeroPasajeros()
     {
          return numeroPasajeros;
     }
     
     @Override
     public boolean equals(Object obj) {
          if(this == obj) return true;
          if(obj == null || getClass() != obj.getClass()) return false;
          
          Vehiculo vehiculo = (Vehiculo) obj;
          
          return propietario != null ? propietario.equals(vehiculo.propietario) : vehiculo.propietario == null;
          
     }
     
     @Override
     public int hashCode() {
          return propietario != null ? propietario.hashCode() : 0;
     }
     
}
