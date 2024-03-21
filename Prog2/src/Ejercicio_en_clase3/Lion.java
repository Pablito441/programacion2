package Ejercicio_en_clase3;

public class Lion extends Feline {
    public Lion() {
    }

    public Lion(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("The lion makes noise.");

    }
    @Override
    public void eat() {
        System.out.println("The lion eats "+ super.getFood() + ".");
    }


}
