package Ejercicio_Interfaces;

public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero(10,"Guerrero",10000);
        Mago mago = new Mago(11,"Mago",15000);
        Picaro picaro = new Picaro(8,"Picaro",12000);

        // Simulando Batalla
        System.out.println("------ BATALLA ------");
        System.out.println("Guerrero vs Mago:");
        int damage = guerrero.atacar();
        mago.defender(damage);
        System.out.println("El Mago recibe " + damage + " de daño.");
        System.out.println("Estado actual del Mago:");
        mago.mostrarEstado();

        System.out.println();

        System.out.println("Pícaro vs Guerrero:");
        damage = picaro.atacar();
        guerrero.defender(damage);
        System.out.println("El Guerrero recibe " + damage + " de daño.");
        System.out.println("Estado actual del Guerrero:");
        guerrero.mostrarEstado();
    }
}
