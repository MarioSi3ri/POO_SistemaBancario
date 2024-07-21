package main.java.com.si3ri.reto;

public class CuentaBase {

    private double montoActual; // Atributo.

    public CuentaBase(double apertura) {
        this.montoActual = apertura;  // Constructor de la clase para inicializar los atributos.

    }

    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual = montoActual;

    }

    public void depositar(double cantidad) {
        this.montoActual += cantidad; // Metodo definido para agregar alguna cantidad al monto actual.
    }

   public void retirar(double cantidad){
        this.montoActual -= cantidad; // Metodo definidio para restar una cantidad al monto actual.
    }

}