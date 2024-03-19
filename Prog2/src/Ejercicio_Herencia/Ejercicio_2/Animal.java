package Ejercicio_Herencia.Ejercicio_2;
// Esta vez lo comento para no perderme porque son mucho más atributos.
public class Animal {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;

    // Constructores
    public Animal() {
    }
    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    // Método
    public void hacer_sonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

