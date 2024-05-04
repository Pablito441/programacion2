package TP_N4.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;

        System.out.println("Adivine el número el número aleatorio");
        while(true){
            try {
                System.out.println("\nIngrese un número entre el 1 y el 100:\nPara salir ingrese el número [666]");
                int num = sc.nextInt();
                if(num == 666){
                    System.out.println("Te rendiste después de " + intentos + " :( Igualmente gracias por jugar.");
                    break;
                }
                if(num < 1 || num > 100){
                    System.out.println("Error, el número debe ser entre 1 y 100. Se le sumó un intento por pendejo y no leer bien.");
                } else if (num < numeroAdivinar) {
                    System.out.println("El número es más mayor que " + num + ", ¡Intenta nuevamente! ;D");
                } else if (num > numeroAdivinar) {
                    System.out.println("El número es más menor que " + num + ", ¡Intenta nuevamente! ;D");
                } else {
                    System.out.println("Lograste adivinar el número. Tu premio es una patada en la nuca ¡¡Felicidades!! ");
                    System.out.println("Te tomó " + intentos + " intentos.");
                    break;
                }
                intentos ++;
                System.out.println("Intentos = " + intentos + ".");
            }catch (InputMismatchException e) {
                System.out.println("¡Error! Debes ingresar un número entero válido.Por salame te marco un intento más 0.o");
                intentos ++;
                System.out.println("Intentos = " + intentos + ".");
                sc.next();
            }
        }

        sc.close();
    }
}
