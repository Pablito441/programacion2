package TP_N2.Ejercicio_1;

public abstract class Animal {
    private int edad;
    private  String nombre;
    private  double precio;
    private  String tipoAnimal;


    public Animal(int edad, String nombre, double precio, String tipoAnimal) {
        this.edad = edad;
        this.nombre = nombre;
        this.precio = precio;
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void alimentar(String nombre) {
        System.out.println(nombre + " ha sido alimentado.");
    }


    public String toString(){
        return "Nombre: " + nombre + ", Edad: " + edad + ", Tipo:" + tipoAnimal + ", precio = $" + precio + ".";
    }

}
