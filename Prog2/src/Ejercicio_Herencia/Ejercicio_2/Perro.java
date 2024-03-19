package Ejercicio_Herencia.Ejercicio_2;
public class Perro extends Animal {
    //Atributos
    private String raza;
    // Constructores
    public Perro() {
    }
    public Perro(String nombre, int edad, String genero, String raza) {
        super(nombre, edad, genero);
        this.raza = raza;
    }
    // Getters y setters
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    //Métodos
    @Override
    public void hacer_sonido() {
        System.out.println("El perro ladra.");
    }

    public void informacion() {
        System.out.println("Información del perro:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Género: " + getGenero());
        System.out.println("Raza: " + raza);
    }
}
