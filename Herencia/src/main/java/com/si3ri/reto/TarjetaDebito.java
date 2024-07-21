package main.java.com.si3ri.reto;

public class TarjetaDebito extends CuentaBase {
    public TarjetaDebito(double apertura){
        super(apertura);
    }

    public void retirar(double cantidad) {
        double montoActual = getMontoActual();
        if (montoActual >= cantidad && 0 < cantidad) { // Si el montoActual es mayor o igual a la cantidad y al mismo tiempo, 0 es menor a la cantidad a retirar...
            setMontoActual(montoActual - cantidad); // Se procede a restar la cantidad del montoActual de la cuenta para realizar la transacción.
            System.out.println("Retirando cantidad...");
            System.out.println("Retiro realizado con éxito.");
        } else {
            System.out.println("* SALDO INSUFICIENTE O NINGUNA OPERACIÓN REALIZADA");
            System.out.println("- No procedece su operación... Retornando a su saldo actual...");
        }
    }

}