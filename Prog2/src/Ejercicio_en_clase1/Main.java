package Ejercicio_en_clase1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo auto1 = new Auto("Davo",5,4,true);
        auto1.caracteristicas();
        Vehiculo camion1 = new Camion("Jorge",2,6,1200);
        camion1.caracteristicas();

    }
}