package com.vehiculo;

import java.util.Date;
import java.util.Objects;

public class Vehiculo {
     protected final String matricula;
     protected int numeroRuedas;
     protected String propietario;
     protected Date fechacompra;
     protected  int numeroPasajeros;
     
     public Vehiculo(String matricula, int numeroRuedas, String propietario,
                     Date fechacompra, int numeroPasajeros)
     {
          this.matricula = matricula;
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
          
          return Objects.equals(matricula, vehiculo.matricula);
          
     }
     
     @Override
     public int hashCode() {
          return Objects.hashCode(matricula);
     }
     
}
