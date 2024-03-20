package trabajo_practico_diagnostico;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a phrase:");
        String phrase = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char character = phrase.charAt(i);

            if (Character.isLetter(character)) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("The phrase has " + vowels + " vowels and " + consonants + " consonants.");

        sc.close();
    }
}
