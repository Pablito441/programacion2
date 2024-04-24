package TP_N3.Ejercicio_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno> {
    private String nombre;
    private String curso;
    private char letra;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;

    public Grupo(String nombre, String curso, char letra) {
        this.nombre = nombre;
        this.curso = curso;
        this.letra = letra;
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    //Métodos
    public void mostrarNombresAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre());
        }
    }
    public void mostrarNombresAsignaturas() {
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre());
        }
    }
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }
    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    @Override
    public Iterator<Alumno> iterator() {
        return null;
    }

    private class AlumnosIterator implements Iterator<Alumno> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < alumnos.size();
        }

        @Override
        public Alumno next() {
            if (hasNext()) {
                return alumnos.get(index++);
            }
            return null;
        }
    }
    private class AsignaturasIterator implements Iterator<Asignatura> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < asignaturas.size();
        }

        @Override
        public Asignatura next() {
            if (hasNext()) {
                return asignaturas.get(index++);
            }
            return null;
        }
    }
}
