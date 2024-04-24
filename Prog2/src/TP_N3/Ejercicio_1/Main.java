package TP_N3.Ejercicio_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(44403734, "Pablo", "Numeros");
        Profesor profesor2 = new Profesor(44403734, "Bananirou", "Numeros");
        Alumno alum1 = new Alumno(43404734,"Guada");
        Alumno alum2 = new Alumno(44347792, "Mercedes");
        Alumno alum3 = new Alumno(42999333,"Indira");
        Alumno alum4 = new Alumno(41232223,"Josue");
        Alumno alum5 = new Alumno(43232333,"Martin");
        Asignatura asig1 = new Asignatura("LIM1","Matemáticas","2 hrs");
        Asignatura asig2 = new Asignatura("LIM1","Estadística","2 hrs");
        Asignatura asig3 = new Asignatura("LIM1","Probabilidad","2 hrs");
        Grupo g1 = new Grupo("Keep On", "1",'A');
        Grupo g2 = new Grupo("Comunidad del anillo", "1",'A');
        Grupo g3 = new Grupo("SLDG", "1",'A');



        //agregar alumnos y asignaturas al grupo 1 keepON
        g1.agregarAlumno(alum1);
        g1.agregarAlumno(alum2);
        g1.agregarAlumno(alum3);

        g1.agregarAsignatura(asig1);

        //Agregar alumnos y asignaturas al grupo 2 CDA
        g2.agregarAlumno(alum4);
        g2.agregarAlumno(alum5);

        g2.agregarAsignatura(asig2);

        //Agregar alumnos y asignaturas al grupo SLDG
        g3.agregarAlumno(alum2);
        g3.agregarAlumno(alum3);

        g3.agregarAsignatura(asig3);

        //Agregar tambien los grupos a las asignaturas
        asig1.asignarGrupo(g1);
        asig2.asignarGrupo(g2);
        asig3.asignarGrupo(g3);

        //Agregar las asignaturas a los profes
        profesor1.agregarAsignatura(asig1);
        profesor1.agregarAsignatura(asig2);
        profesor1.agregarAsignatura(asig3);

        profesor2.agregarAsignatura(asig2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");

        // a. Mostrar el aula de la 3ra. asignatura del profesor
        System.out.println("El aula de la tercera asignatura del profesor es " + profesor1.getAsignaturas().get(2).getAula() + ".");

        // b. Mostrar todos los nombres de las asignaturas que imparte el profesor
        System.out.println("\nAsignaturas que imparte el profesor "+ profesor1.getNombre() + ".");
        profesor1.mostrarNombresAsignaturas();

        // c. Mostrar nombre y dni de los alumnos del grupo que recibe la asignatura 1
        System.out.println("\nNombre y Dni de los alumnos del grupo que recibe la asignatura " + asig1.getNombre() + ".");
        for (Alumno alumno : asig1.getGrupo().getAlumnos()) {
            System.out.println("Nombre: " + alumno.getNombre() + ", DNI: " + alumno.getDni());
        }

        // d. Mostrar la letra del 3er. grupo al que pertenece el alumno
        //dijo este punto no iba pero vamos a suponer que pertenece al alumno 1 y su único grupo
        alum1.asignarGrupo(g1); //el alumno está en el grupo 1

        System.out.println("\nLa letra del grupo al que pertenece el alumno "+ alum1.getNombre() +":");
        System.out.println(alum1.getGrupo().getLetra());

        //e. Mostrar todas las asignaturas recibidas por el 1er. grupo al que pertenece el alumno
        System.out.println("\nAsignaturas recibidas por el primer grupo al que pertenece el alumno:");
        alum1.getGrupo().mostrarNombresAsignaturas();

        // f. Mostrar el profesor que imparte una asignatura ingresada por el usuario
        System.out.println("Ingrese el nombre de una asignatura: [Matemáticas][Estadistaca][Probabilidad]");
        String nombreAsignatura = scanner.nextLine();
        Asignatura asignaturaIngresada = null;
        for (Asignatura asignatura : profesor1.getAsignaturas()){
            if(asignatura.getNombre().equals(nombreAsignatura)){
                asignaturaIngresada = asignatura;
                break;
            }
        }
        if (asignaturaIngresada != null) {
            System.out.println("\nEl profesor que imparte la asignatura " + asignaturaIngresada.getNombre() +
                    " es: " + profesor1.getNombre());
        } else {
            System.out.println("No se encontró la asignatura ingresada.");
        }
        // g. Mostrar los nombres de todos los alumnos inscriptos en el Grupo de la 2da. Asignatura
        System.out.println("\nNombre de los alumnos inscriptos en el grupo de la segunda asignatura.");
        asig2.getGrupo().mostrarNombresAlumnos();
    }


}
