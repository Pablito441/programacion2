package Ejercicio_en_clase3;

public class Wolf extends Canine {
    public Wolf() {
    }

    public Wolf(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }
    @Override
    public void makeNoise() {
        System.out.println("The wolf makes noise.");

    }
    @Override
    public void eat() {
        System.out.println("The wolf eats "+ super.getFood() + ".");
    }


}
