package Ejercicio_en_clase3;

public abstract class Feline extends Animal {
    public Feline() {
    }

    public Feline(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    public void roar(){
        System.out.println("Brrrrrrrr");
    }
}
