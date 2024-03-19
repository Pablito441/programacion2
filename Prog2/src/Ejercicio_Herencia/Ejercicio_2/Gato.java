package Ejercicio_Herencia.Ejercicio_2;

public class Gato extends Animal {
    //Atributos
    private String color;

    //Constructores
    public Gato() {
    }
    public Gato(String nombre, int edad, String genero, String color) {
        super(nombre, edad, genero);
        this.color = color;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Métodos
    @Override
    public void hacer_sonido() {
        System.out.println("El gato maulla.");
    }

    public void informacion() {
        System.out.println("Información del gato:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Género: " + getGenero());
        System.out.println("Color: " + color);
    }
}
