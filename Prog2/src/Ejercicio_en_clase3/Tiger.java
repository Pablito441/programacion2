package Ejercicio_en_clase3;

public class Tiger extends Feline {
    public Tiger() {
    }

    public Tiger(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("The tiger makes noise.");

    }
    @Override
    public void eat() {
        System.out.println("The tiger eats "+ super.getFood() + ".");
    }


}
