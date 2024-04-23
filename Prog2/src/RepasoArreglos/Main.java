package RepasoArreglos;
import java.util.Scanner;






public class Main {
    public static void main(String[] args) {

    }
    public class ejercicio1{
        //        1.	Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está el mayor número leído.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] numeros = new int[10];


            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = sc.nextInt();
            }


            int maximo = numeros[0];
            int posicion = 0;
            for (int i = 1; i < 10; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                    posicion = i;
                }
            }

            System.out.println("El mayor número es " + maximo + " y está en la posición " + (posicion + 1));
        }
    }



   public class ejercicio2{
       //        2.	Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del arreglo está el mayor número primo leído.
       public static boolean esPrimo(int n) {
           if (n <= 1) {
               return false;
           }
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
               }
           }
           return true;
       }

       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int[] numeros = new int[10];

           for (int i = 0; i < 10; i++) {
               System.out.print("Ingrese el número " + (i + 1) + ": ");
               numeros[i] = sc.nextInt();
           }

           int maximoPrimo = Integer.MIN_VALUE;
           int posicion = -1;
           for (int i = 0; i < 10; i++) {
               if (numeros[i] > maximoPrimo && esPrimo(numeros[i])) {
                   maximoPrimo = numeros[i];
                   posicion = i;
               }
           }

           if (posicion != -1) {
               System.out.println("El mayor número primo es " + maximoPrimo + " y está en la posición " + (posicion + 1));
           } else {
               System.out.println("No se encontraron números primos en el arreglo.");
           }
       }
   }
   public class ejercicio3{
       //3.	Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos entre 100 y 300. Luego mostrarlos en pantalla.
       public static boolean esPrimo(int n) {
           if (n <= 1) {
               return false;
           }
           for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % i == 0) {
                   return false;
               }
           }
           return true;
       }

       public static void main(String[] args) {
           int[] primos = new int[10];
           int contador = 0;

           for (int i = 100; i <= 300 && contador < 10; i++) {
               if (esPrimo(i)) {
                   primos[contador] = i;
                   contador++;
               }
           }

           System.out.println("Los números primos entre 100 y 300 son:");
           for (int primo : primos) {
               System.out.print(primo + " ");
           }
       }
   }

   public class ejercicio4{
       //4.	Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué posiciones se encuentran los números terminados en 4.
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int[] numeros = new int[10];


           for (int i = 0; i < 10; i++) {
               System.out.print("Ingrese el número " + (i + 1) + ": ");
               numeros[i] = sc.nextInt();
           }


           System.out.print("Los números terminados en 4 se encuentran en las posiciones: ");
           for (int i = 0; i < 10; i++) {
               if (numeros[i] % 10 == 4) {
                   System.out.print((i + 1) + " ");
               }
           }
       }

   }

public class ejercicio5{
    //5.Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas veces está repetido el mayor.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int maximo = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        int repeticiones = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == maximo) {
                repeticiones++;
            }
        }

        System.out.println("El mayor número es " + maximo + " y está repetido " + repeticiones + " veces.");
    }
}
}
