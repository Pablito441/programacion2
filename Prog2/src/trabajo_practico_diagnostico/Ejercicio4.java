package trabajo_practico_diagnostico;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: \n--> ");
        int num = sc.nextInt();

        double count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){count+=1;}
        }

        if (num < 2){
            System.out.println("Enter another number wasn't 1 or minor that 1.");
        }else{
            if(count == 2){
                System.out.println("The number is primo.");
            } else {
                System.out.println("the number isn't primo.");
            }
        }
        sc.close();
    }
}
