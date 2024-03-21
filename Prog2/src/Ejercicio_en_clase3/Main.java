package Ejercicio_en_clase3;

public class Main {
    public static void main(String[] args) {
        Dog doggi = new Dog("photo","squirrel","Mendoza, GC","Pequeño");
        Cat kitten = new Cat("photo","fish","Mendoza, GC","Pequeño");

        kitten.eat();
        doggi.takeWalk();
    }
}
