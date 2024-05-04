package TP_N4.Ejercicio3;

import java.util.Scanner;

public class CalcularAreaTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = 0;
        double altura = 0;

        // Leer la base del triángulo
        while (true) {
            System.out.print("Ingrese la base del triángulo: ");
            String inputBase = scanner.nextLine();

            try {
                base = Double.parseDouble(inputBase);
                break; // Salir del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la base.");
            }
        }

        // Leer la altura del triángulo
        while (true) {
            System.out.print("Ingrese la altura del triángulo: ");
            String inputAltura = scanner.nextLine();

            try {
                altura = Double.parseDouble(inputAltura);
                break; // Salir del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para la altura.");
            }
        }

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);

        scanner.close();
    }
}
