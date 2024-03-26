package TP_Ejercicio2_herencia;

public class CuentaAhorros extends Cuenta {

//Atributo

    protected boolean activa;
//Constructor

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa = (saldo >= 10000);
    }

    @Override
    public void consignar(float cantidad) {
        System.out.println("\nConsignación:");
        if(activa){
            saldo += cantidad;
            System.out.println("Su saldo actual es de $" + saldo + " pesos.");
            numeroConsignaciones ++;
        }else{
            System.out.println("No se puede realizar la operación porque la cuenta está inactiva.");
        }
    }

    @Override
    public void retirar(float cantidad) {
        System.out.println("\nRetiro:");
        if(activa){

            if (cantidad <= saldo) {
                saldo -= cantidad;
                numeroRetiros++;
                System.out.println("Su saldo actual es de $" + saldo + " pesos.");
            } else {
                System.out.println("No hay suficiente saldo para realizar el retiro.");
            }
        }else{
            System.out.println("No se puede realizar la operación porque la cuenta está inactiva.");
        }
    }

    @Override
    public void extractoMensual() {
        if (numeroRetiros >4) {
            comisionMensual = (numeroRetiros - 4) * 1000;
        }
        saldo -= comisionMensual;
        super.calcularInteresMensual();
        activa = (saldo >= 10000);

    }

    @Override
    public void imprimir() {
        System.out.println("\nDatos de la cuenta:");
        super.imprimir();
        System.out.println("La cuenta está activa: " + activa);

    }



}
