package Ejercicio_en_clase4;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0f);
        Cuadrado cuadrado = new Cuadrado(4.0f);


        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Área del cuadrado: " + cuadrado.area());


        circulo.dibujar();
        cuadrado.dibujar();


        cuadrado.rotar();
    }
}

