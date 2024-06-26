package TP_N3.Ejercicio_5;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDeTareas listaDeTareas = new ListaDeTareas();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nSeleccione una opción:\n1. Agregar nueva tarea\n2. Mostrar todas las tareas\n3. Eliminar tarea\n4. Salir\nOpción:");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        agregarTarea(listaDeTareas, scanner);
                        break;
                    case 2:
                        mostrarTareas(listaDeTareas);
                        break;
                    case 3:
                        eliminarTarea(listaDeTareas, scanner);
                        break;
                    case 4:
                        System.out.println("¡Nos vemos pa!");
                        return;
                    default:
                        System.out.println("Opción ingresada no válida, intentelo de nuevo.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }

    private static void agregarTarea(ListaDeTareas listaDeTareas, Scanner scanner) {
        try {
            System.out.print("Descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            System.out.print("Prioridad de la tarea: ");
            int prioridad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            listaDeTareas.agregarTarea(new Tarea(descripcion, prioridad));
            System.out.println("Tarea agregada correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Prioridad debe ser un número entero.");
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }


    private static void mostrarTareas(ListaDeTareas listaDeTareas) {
        System.out.println("Todas las tareas:");
        for (Tarea tarea : listaDeTareas) {
            System.out.println(tarea);
        }
    }

    private static void eliminarTarea(ListaDeTareas listaDeTareas, Scanner scanner) {
        try {
            System.out.print("Descripción de la tarea a eliminar: ");
            String descripcion = scanner.nextLine();

            if (listaDeTareas.eliminarTarea(descripcion)) {
                System.out.println("Tarea eliminada correctamente.");
            } else {
                System.out.println("La tarea no existe en la lista.");
            }
        } catch (Exception e) {
            System.out.println("Error al intentar eliminar la tarea: " + e.getMessage());
        }
    }

}
