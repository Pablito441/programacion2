package Ejercicio_en_clase3;

public abstract class Animal {
    private String photo;
    private String food;
    private  String location;
    private  String size;

    public Animal(){}
    public Animal(String photo, String food, String location, String size) {
        this.photo = photo;
        this.food = food;
        this.location = location;
        this.size = size;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFood() {
        return food;
    }

    public void setFoof(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public abstract void makeNoise();
    public abstract void eat();
    public String sleep(){
        return  "Zzzzzzzzzz";
    }
    public abstract void roar();
}
