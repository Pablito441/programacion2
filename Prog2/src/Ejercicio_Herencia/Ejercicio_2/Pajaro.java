package Ejercicio_Herencia.Ejercicio_2;

public class Pajaro extends Animal {
    //Atributos
    private String especie;
    //Constructores
    public Pajaro() {
    }
    public Pajaro(String nombre, int edad, String genero, String especie) {
        super(nombre, edad, genero);
        this.especie = especie;
    }
    // Getters y setters

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    //Métodos
    @Override
    public void hacer_sonido() {
        System.out.println("El pájaro canta.");
    }

    public void informacion() {
        System.out.println("Información del pájaro:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Género: " + getGenero());
        System.out.println("Especie: " + especie);
    }
}
