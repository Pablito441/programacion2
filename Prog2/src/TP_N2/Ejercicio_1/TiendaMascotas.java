package TP_N2.Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascotas {
    private List<Animal> animales;
    private String nombre;

    public TiendaMascotas(String nombre) {
        this.animales = new ArrayList<>();
        this.nombre = nombre;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAnimal(Animal animal){
        animales.add(animal);
        System.out.println("Se agregó un " + animal + " a la tienda.");
    }
    public void listarAnimales(){
        System.out.println("Animales de la Tienda de mascotas " + nombre + ".");
        for (Animal animal : animales){
            System.out.println(animal);
        }
    }
    public void venderAnimal(String nombre){
        for (Animal animal : animales){
            if (animal.getNombre().equals(nombre)){
                animales.remove(animal);
                System.out.println("Se vendió el animal: " + animal);
                return;
            }
        }
        System.out.println("No se encontró ningún animal con ese nombre.");
    }
    public void alimentarAnimal(String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                animal.alimentar(nombre);
                return;
            }
        }
        System.out.println("No se encontró ningún animal con ese nombre.");
    }

}
