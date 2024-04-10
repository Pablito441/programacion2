package TP_N1.Codigo2;

public class Main {
    public static void main(String[] args) {

        Circule cir = new Circule(2.2);
        Rectangule rec = new Rectangule(4,8);

        System.out.println("\n<<< Circule >>>");
        System.out.println("Area: " + cir.calculateArea());
        System.out.println("Perimeter: " + cir.calculatePerimeter());
        System.out.println("\n<<< Rectangule >>>");
        System.out.println("Area: " + rec.calculateArea());
        System.out.println("Perimeter: " + rec.calculatePerimeter());

    }
}
