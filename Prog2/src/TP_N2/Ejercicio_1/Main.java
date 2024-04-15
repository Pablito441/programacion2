package TP_N2.Ejercicio_1;

import TP_N2.Ejercicio_1.Perro;
import TP_N2.Ejercicio_1.Gato;
import TP_N2.Ejercicio_1.Ave;
import TP_N2.Ejercicio_1.Pez;
import TP_N2.Ejercicio_1.TiendaMascotas;

public class Main {
    public static void main(String[] args) {

        TiendaMascotas tienda = new TiendaMascotas("PetsOfPablo");

        Perro perro = new Perro(2, "Vercetti", 1500, "Overjero Alemán", true );
        Gato gato = new Gato(1,"Tom",500,"Griego",true);
        Ave ave = new Ave(1,"Piolín",750,"Extravagante",false);
        Pez pez = new Pez(2,"Nemito",950,"Carpa");

        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);

        tienda.venderAnimal("Vercetti");

        tienda.alimentarAnimal("Tom");
        tienda.alimentarAnimal("Piolín");
        tienda.alimentarAnimal("Nemito");

        tienda.listarAnimales();


    }
}