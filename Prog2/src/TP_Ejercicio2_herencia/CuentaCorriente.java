package TP_Ejercicio2_herencia;

public class CuentaCorriente extends Cuenta {
    //Atributo
    protected float sobregiro = 0;
    //Contructor
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    //Métodos
    @Override
    public void retirar(float cantidad) {
        System.out.println("\nRetiro:");
        if(saldo<cantidad){
            sobregiro = (cantidad - saldo);
            saldo = 0;
            System.out.println("Su saldo actual es de $" + saldo + " pesos y debe $" + sobregiro + ".");
        }else{
            saldo -= cantidad;
            System.out.println("Su saldo actual es de $" + saldo + " pesos.");
        }
        numeroRetiros++;
    }



    @Override
    public void consignar(float cantidad) {
        System.out.println("\nConsignación:");
        if(saldo==0){
            if(cantidad>sobregiro){
                saldo += cantidad - sobregiro;
                System.out.println("Su saldo actual es de $" + saldo + " pesos.");
                sobregiro = 0;
            }else{
                sobregiro -= cantidad;
                System.out.println("Su saldo actual es de $" + saldo + " pesos y debe $" + sobregiro + ".");
            }
        }else{
            saldo += cantidad;
            System.out.println("Su saldo actual es de $" + saldo + " pesos.");
        }
        numeroConsignaciones ++;
    }

    @Override
    public void calcularInteresMensual() {
        float interesMensual = saldo * (tasaAnual / 12) / 100;
        saldo += interesMensual;
    }

    @Override
    public void extractoMensual() {
        super.calcularInteresMensual();
        if (sobregiro > 0) {
            saldo -= sobregiro;
            sobregiro = 0;
        }
    }

    @Override
    public void imprimir(){
        System.out.println("\nDatos de la cuenta:");
        super.imprimir();
        System.out.println("Valor de sobregiro es de $"+ sobregiro + ".");
    }
}
