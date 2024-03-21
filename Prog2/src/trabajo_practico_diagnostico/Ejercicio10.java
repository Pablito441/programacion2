package trabajo_practico_diagnostico;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of grades or students:");
        int numberOfGrades = scanner.nextInt();

        if (numberOfGrades <= 0) {
            System.out.println("The number of grades must be greater than zero.");
            return;
        }

        System.out.println("Enter the grades:");

        double sumOfGrades = 0;
        for (int i = 1; i <= numberOfGrades; i++) {
            System.out.print("Grade " + i + ": ");
            double grade = scanner.nextDouble();
            sumOfGrades += grade;
        }

        double average = sumOfGrades / numberOfGrades;

        System.out.println("The average of the grades is: " + average);

        scanner.close();
    }
}
