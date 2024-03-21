package Ejercicio_en_clase3;

public abstract class Canine extends Animal {
    public Canine() {
    }
    public Canine(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    public void roar(){
        System.out.println("guaf guaf gauf guaf");
    }

}
