package trabajo_practico_diagnostico;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 3.	Pide por teclado dos números y genera 10 números aleatorios entre esos números.
         * Usa el método Math.random para generar un número entero aleatorio.
         */
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for(int i = 0; i<10; i++){
            int numRandom = (int) (Math.random() * (num2 - num1 + 1)) + num1;
            System.out.println(numRandom + "\n");
        }
        sc.close();
    }
}
