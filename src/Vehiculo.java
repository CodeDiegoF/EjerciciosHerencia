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

}
