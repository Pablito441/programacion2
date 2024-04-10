package TP_N1.Codigo2;

public class Circule extends GeometricFigure{
    private double radio;

    public Circule(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * 2 * radio;
    }
}
