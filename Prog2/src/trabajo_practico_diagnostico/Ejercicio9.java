package trabajo_practico_diagnostico;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number: \n-->");
        int num1 = sc.nextInt();
        System.out.println("Enter a number: \n-->");
        int num2 = sc.nextInt();

        int[][] matriz1 = new int[num1][num2];
        int[][] matriz2 = new int[num1][num2];
        int[][] matriz3 = new int[num1][num2];

        for(int i = 0; i < num1;i++){
            for(int j = 0; j < num2;j++){
                matriz1[i][j] = random.nextInt(101);
                matriz2[i][j] = random.nextInt(101);
            }
        }
        for(int i = 0; i < num1;i++){
            for(int j = 0; j < num2;j++){
                matriz3[i][j] = matriz1[i][j]+ matriz2[i][j];
            }
        }

        System.out.println("\n<<<   Matriz 1   >>>");
        for(int i = 0; i < num1;i++){
            for(int j = 0; j < num2;j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n<<<   Matriz 2   >>>");
        for(int i = 0; i < num1;i++){
            for(int j = 0; j < num2;j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n<<<   Matriz 3   >>>");
        for(int i = 0; i < num1;i++){
            for(int j = 0; j < num2;j++){
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }




    }
}
