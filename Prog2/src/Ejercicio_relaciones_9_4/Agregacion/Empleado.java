package Ejercicio_relaciones_9_4.Agregacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Empleado {
    private String nombre;
    private String cargo;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }
    public void mostrarCargo(){
        System.out.println("El empleado " + nombre + " tiene el cargo de "  + cargo + ".");
    }
}
