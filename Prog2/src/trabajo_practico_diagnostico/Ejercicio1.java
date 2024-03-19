package trabajo_practico_diagnostico;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        /**
         * Crea una calculadora simple en Java que pueda realizar operaciones básicas como suma,
         *  resta, multiplicación y división. El programa debe solicitar al usuario que ingrese
         *  dos números y luego le permitirle elegir la operación que desea realizar. Una vez
         *  completada la operación, debe mostrar el resultado al usuario.Cada operación debe
         *  implementarse en un método diferente. El programa principal debe llamar a estos
         *  métodos según la operación seleccionada por el usuario.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Choise the operation you want to perform: \n1.Addition\n2.subtraction\n3.Multiplication\n4.Division");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("The result of the sum is: " + addition(num1, num2));
                break;
            case 2:
                System.out.println("The result of the subtraction is:: " + substraction(num1, num2));
                break;
            case 3:
                System.out.println("The result of the multiplication is: " + multiplication(num1, num2));
                break;
            case 4:
                System.out.println("The result of the division is: " + dividision(num1, num2));
                break;
            default:
                System.out.println("Invalid option.");
        }
        sc.close();
    }
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double substraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividision(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("cannot be divided by zero");
            return Double.NaN;
        }
    }

}


