package trabajo_practico_diagnostico;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int positive = 0;
        int negative = 0;
        int mayorNum = 0;
        int minorNum = 0;
        int sumNum = 0;
        int medNUm = 0;
        int counter = 0;
        int ceros = 0;

        while(true){
            System.out.println("Enter a number: \n-->");
            num = sc.nextInt();

            if (num == -1){
                System.out.println("Thanks for use this program.");
                break;
            }

            if (num < minorNum){ minorNum = num;}
            if (num > mayorNum){ mayorNum = num;}
            sumNum += num; counter +=1;
            if(num > 0){
                positive += num;
            } else if (num < 0) {
                negative += num;
            }else{ceros += num;}

        }
        if (counter == 0){
            System.out.println("no numbers were provided.");
        }else{
            System.out.println("The mayor number is " + mayorNum + ".");
            System.out.println("The minor number is " + minorNum + ".");
            System.out.println("The sum of the all numbers is " + sumNum + ".");
            System.out.println("The sum of the negative numbers is " + negative + ".");
            System.out.println("The sum of the positive numbers is " + positive + ".");
            System.out.println("The media of the all number is: " + sumNum/counter + ".");
        }


    }
}
