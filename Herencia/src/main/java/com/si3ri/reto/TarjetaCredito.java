package main.java.com.si3ri.reto;

public class TarjetaCredito extends CuentaBase {

    public TarjetaCredito(double apertura){
        super(apertura *-1); // El *-1 es para tener el efecto de invertir el signo de apertura antes de inicializar la superclase.
    }

   public void sumaInteres(){
        double montoActual = getMontoActual();
        double cantidad = montoActual * 0.15; // El metodo 'sumaInteres' aumenta la deuda en un 15%.
       setMontoActual(montoActual + cantidad);
    }

}