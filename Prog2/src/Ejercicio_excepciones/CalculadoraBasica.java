package Ejercicio_excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2;
        char operador;


        System.out.print("Ingrese el primer número: ");
        numero1 = obtenerNumero(scanner);

        System.out.print("Ingrese el segundo número: ");
        numero2 = obtenerNumero(scanner);

        System.out.print("Elija la operación (+, -, *, /): ");
        operador = obtenerOperador(scanner);

        double resultado = 0;
        try {
            switch (operador) {
                case '+':
                    resultado = numero1 + numero2;
                    break;
                case '-':
                    resultado = numero1 - numero2;
                    break;
                case '*':
                    resultado = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    resultado = numero1 / numero2;
                    break;
                default:
                    System.out.println("Operador no válido.");
                    return;
            }

            System.out.println("El resultado de la operación es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Método para obtener un número válido del usuario
    private static double obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpiar el búfer del scanner
            }
        }
    }

    // Método para obtener un operador válido del usuario
    private static char obtenerOperador(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            if (input.length() == 1 && "+-*/".indexOf(input.charAt(0)) != -1) {
                return input.charAt(0);
            } else {
                System.out.println("Error: Debe ingresar un operador válido (+, -, *, /).");
            }
        }
    }
}
