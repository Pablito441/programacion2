package TP_N1.Codigo2;

public class Rectangule  extends GeometricFigure{
    private double height;
    private double width;

    public Rectangule(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
