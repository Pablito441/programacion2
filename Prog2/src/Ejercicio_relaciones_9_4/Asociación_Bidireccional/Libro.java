package Ejercicio_relaciones_9_4.Asociación_Bidireccional;

import java.util.ArrayList;
import java.util.List;
class Libro {
    private String titulo;
    private List<Persona> poseedores;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.poseedores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Persona> getPoseedores() {
        return poseedores;
    }

    public void agregarPoseedor(Persona persona) {
        poseedores.add(persona);
    }

    public void eliminarPoseedor(Persona persona) {
        poseedores.remove(persona);
    }

    public void mostrarPoseedores() {
        System.out.println("Personas que poseen el libro " + titulo + ":");
        for (Persona persona : poseedores) {
            System.out.println("- " + persona.getNombre());
        }
    }


}