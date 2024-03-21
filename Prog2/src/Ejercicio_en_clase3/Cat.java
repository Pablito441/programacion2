package Ejercicio_en_clase3;

public class Cat extends Feline {
    public Cat() {
    }

    public Cat(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }



    @Override
    public void makeNoise() {
        System.out.println("The cat makes noise.");

    }
    @Override
    public void eat() {
        System.out.println("The cat eats "+ super.getFood() + ".");
    }
    public void vaccinate(){
        System.out.println("The cat is vaccinated.");
    }
}
