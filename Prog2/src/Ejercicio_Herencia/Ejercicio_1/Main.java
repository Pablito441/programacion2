package Ejercicio_Herencia.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Coche("Rojo", 4, 120, 2000));
        vehiculos.add(new Bicicleta("Verde", 2, "Urbana"));
        vehiculos.add(new Camioneta("Azul", 4, 1500));
        vehiculos.add(new Motocicleta("Negra", 2, 180, 1000));

        System.out.println( "\n     Catalogar versión 1:");
        catalogar(vehiculos);

        System.out.println( "\n     Catalogar versión 1:");
        catalogar(vehiculos, 0); // Mostrará todos los vehículos
        catalogar(vehiculos, 2); // Mostrará las bicicletas y las motocicletas
        catalogar(vehiculos, 4); // Mostrará los coches y las camionetas
    }

    public static void catalogar(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.getClass().getSimpleName() + ": " + vehiculo);
        }
    }

    public static void catalogar(List<Vehiculo> vehiculos, int ruedas) {
        int contador = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getRuedas() == ruedas) {
                System.out.println(vehiculo.getClass().getSimpleName() + ": " + vehiculo);
                contador++;
            }
        }
        if (ruedas > 0) {
            System.out.println("Se han encontrado " + contador + " vehículos con " + ruedas + " ruedas.\n ");
        }else{
            System.out.println("No se han encontrado vehículos con " + ruedas + " ruedas.\n ");
        }
    }

}

