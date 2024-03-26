package TP_Ejercicio2_herencia;

public class Main {
    public static void main(String[] args) {

        CuentaAhorros cuentaH1 = new CuentaAhorros(12000, 100);
        CuentaCorriente cuentaC1 = new CuentaCorriente(12000, 100);

        System.out.println("Cuenta Ahorro:");

        cuentaH1.consignar(500);
        cuentaH1.retirar(13000);
        cuentaH1.extractoMensual();
        cuentaH1.imprimir();

        System.out.println("Cuenta Corriente:");

        cuentaC1.consignar(500);
        cuentaC1.retirar(13000);
        cuentaC1.extractoMensual();
        cuentaC1.imprimir();

    }
}
