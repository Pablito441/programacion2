package trabajo_practico_diagnostico;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 2.Crea un programa en Java que convierta la temperatura de grados Celsius a Fahrenheit
         * y viceversa. El programa debe permitir al usuario elegir la dirección de la conversión
         * y luego ingresar la temperatura a convertir.
         */

        System.out.println("Choise the option\n1.Conversion the Celsius to Fahrenheit. \n2.Conversion the Fahrenheit to Celsius.\n -->");
        int option = sc.nextInt();

        System.out.println("Enter the temperature to convert");
        double temperatura = sc.nextDouble();

        switch (option) {
            case 1:
                double fahrenheit = celsiusAFahrenheit(temperatura);
                System.out.println(temperatura + " degrees Celsius are equivalent to " + fahrenheit + " degrees Fahrenheit.");
                break;
            case 2:
                double celsius = fahrenheitACelsius(temperatura);
                System.out.println(temperatura + " degrees Fahrenheit are equivalent to " + celsius + " degrees Celsius.");
                break;
            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }

    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
