package TP_N3.Ejercicio_4;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nSeleccione una opción:\n1. Agregar nuevo alumno\n2. Mostrar lista de alumnos\n3. Calcular media de notas\n4. Mostrar alumno con la nota más alta\n5. Buscar alumno por nombre\n6. Salir\nOpción: ");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        agregarAlumno(listaAlumnos, scanner);
                        break;
                    case 2:
                        mostrarListaAlumnos(listaAlumnos);
                        break;
                    case 3:
                        calcularMediaNotas(listaAlumnos);
                        break;
                    case 4:
                        mostrarAlumnoNotaMasAlta(listaAlumnos);
                        break;
                    case 5:
                        buscarAlumnoPorNombre(listaAlumnos, scanner);
                        break;
                    case 6:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    private static void agregarAlumno(ArrayList<Alumno> listaAlumnos, Scanner scanner) {
        try {
            System.out.print("Nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad del alumno: ");
            int edad = scanner.nextInt();
            System.out.print("Nota del alumno: ");
            double nota = scanner.nextDouble();

            listaAlumnos.add(new Alumno(nombre, edad, nota));
            System.out.println("Alumno agregado correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Asegúrese de ingresar el tipo correcto de datos.");
            scanner.nextLine();
        }
    }


    private static void mostrarListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            System.out.println("Lista de alumnos:");
            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno);
            }
        }
    }

    private static void calcularMediaNotas(ArrayList<Alumno> listaAlumnos) {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            double sumaNotas = 0;
            for (Alumno alumno : listaAlumnos) {
                sumaNotas += alumno.getNota();
            }
            double media = sumaNotas / listaAlumnos.size();
            System.out.println("Media de notas: " + media);
        }
    }

    private static void mostrarAlumnoNotaMasAlta(ArrayList<Alumno> listaAlumnos) {
        if (listaAlumnos.isEmpty()) {
            System.out.println("No hay alumnos en la lista.");
        } else {
            Alumno alumnoNotaMasAlta = listaAlumnos.get(0);
            for (Alumno alumno : listaAlumnos) {
                if (alumno.getNota() > alumnoNotaMasAlta.getNota()) {
                    alumnoNotaMasAlta = alumno;
                }
            }
            System.out.println("Alumno con la nota más alta:");
            System.out.println(alumnoNotaMasAlta);
        }
    }

    private static void buscarAlumnoPorNombre(ArrayList<Alumno> listaAlumnos, Scanner scanner) {
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        try {
            String nombreBuscar = scanner.nextLine().trim();

            boolean encontrado = false;
            for (Alumno alumno : listaAlumnos) {
                if (alumno.getNombre().equalsIgnoreCase(nombreBuscar)) {
                    System.out.println("Alumno encontrado:");
                    System.out.println(alumno);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Alumno no encontrado.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Error: No se proporcionó ninguna entrada.");
        }
    }

}
