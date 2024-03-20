package trabajo_practico_diagnostico;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: \n-->");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: \n-->");
        int num2 = sc.nextInt();

        if(num2 < num1){
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }

        System.out.println("the numbers in the interval numbers.");
        for(int i=num1; i<=num2;i++){
            System.out.println(i);
        }

    }
}
