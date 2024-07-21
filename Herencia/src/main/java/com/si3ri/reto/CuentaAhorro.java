package main.java.com.si3ri.reto;

public class CuentaAhorro extends CuentaBase {

    public CuentaAhorro(double apertura) {
        super(apertura);
    }

    public void invertir(){
        double montoActual = getMontoActual();
        double cantidad = montoActual * 0.10; // El metodo 'invertir' aumenta el 10% al monto actual.
        setMontoActual(montoActual + cantidad);
    }

}