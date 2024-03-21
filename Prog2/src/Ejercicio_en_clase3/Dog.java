package Ejercicio_en_clase3;

public class Dog extends Canine {
    public Dog() {
    }

    public Dog(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog makes noise.");

    }
    @Override
    public void eat() {
        System.out.println("The dog eats "+ super.getFood() + ".");
    }
    public void Vaccinate(){
        System.out.println("the dog is vaccinated.");
    }
    public void takeWalk(){
        System.out.println("the dog is walking.");
    }
}
