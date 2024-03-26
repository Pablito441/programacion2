package TP_Ejercicio2_herencia;

public abstract class Cuenta {
//Atributos
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual;
//Constructor
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

//Métodos
    public abstract void consignar(float cantidad);
    public abstract void retirar(float cantidad) ;
    public void calcularInteresMensual() {
        float interesMensual = saldo * (tasaAnual / 12) / 100;
        saldo += interesMensual;
    }
    public abstract void extractoMensual();
    public void imprimir(){
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones realizadas: " + (numeroConsignaciones + numeroRetiros));
    }



}
