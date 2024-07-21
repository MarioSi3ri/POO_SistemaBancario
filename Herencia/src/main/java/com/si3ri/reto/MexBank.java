/* RETO 4. HERENCIA DE CLASES Y PASO DE PARÁMETROS */

package main.java.com.si3ri.reto;

import java.util.Scanner;

public class MexBank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TarjetaCredito tarjetaCredito = new TarjetaCredito(1000); // Instancias de las clases con sus respectivos nombres y determinada cantidad de apertura.
        TarjetaDebito tarjetaDebito = new TarjetaDebito(3000);
        CuentaAhorro cuentaAhorro = new CuentaAhorro(5000);

        System.out.println("====TARJETA DE CRÉDITO====");
        System.out.println("Saldo/Deuda inicial: " + tarjetaCredito.getMontoActual());
        System.out.println("Actualizando saldo y aplicando intereses del 15%...");
        tarjetaCredito.sumaInteres();
        System.out.println("Saldo/Deuda inicial actualizado/a: " + tarjetaCredito.getMontoActual());
        System.out.print("Ingrese la cantidad a depositar en la tarjeta de crédito: ");
        double cantidadDepositar = scanner.nextDouble(); // Se declara una variable de tipo double utilizando un objeto de la clase 'Scanner' llamado 'scanner' para leer la entrada desde la consola al ejecutar.
        tarjetaCredito.depositar(cantidadDepositar);
        if (cantidadDepositar > 0) { // Si se depósita una cantidad mayor a 0, se muestra el mensaje de aplicando el depósito.
            System.out.println("Depositando cantidad...");
        }
        System.out.println("Saldo/Deuda actual de la tarjeta de credito: " + tarjetaCredito.getMontoActual());
        System.out.println();

        System.out.println("====TARJETA DE DÉBITO====");
        System.out.println("Saldo inicial: " + tarjetaDebito.getMontoActual());
        System.out.print("Ingrese la cantidad a retirar de la tarjeta de débito: ");
        double cantidadRetirar = scanner.nextDouble();
        tarjetaDebito.retirar(cantidadRetirar);
        System.out.println("Saldo actual de la tarjeta de debito: " + tarjetaDebito.getMontoActual());
        System.out.println();

        System.out.println("====CUENTA DE AHORRO====");
        System.out.println("Saldo inicial: " + cuentaAhorro.getMontoActual());
        System.out.println("Actualizando saldo y aplicando invesión del 10%...");
        cuentaAhorro.invertir();
        System.out.println("Saldo inicial actualizado: " + cuentaAhorro.getMontoActual());
        System.out.print("Ingrese la cantidad a invertir en su cuenta de ahorro: ");
        double cantidadInvertir = scanner.nextDouble();
        cuentaAhorro.depositar(cantidadInvertir);
        if (cantidadInvertir > 0) { // Si se invierte una cantidad mayor a 0, se aplica la inversión al nuevo saldo.
            System.out.println("Saldo con el depósito aplicado en la cuenta de ahorro: " + cuentaAhorro.getMontoActual());
            System.out.println("Aplicando inversión del 10% al nuevo saldo...");
            cuentaAhorro.invertir();
        }
        System.out.println("Saldo actual de la cuenta de ahorro: " + cuentaAhorro.getMontoActual());
        System.out.println();

        System.out.println("*GRACIAS POR EJECUTAR OPERACIONES EN EL PROGRAMA Y CONSULTAR SUS SALDOS.*");
        System.out.println();
    }
}