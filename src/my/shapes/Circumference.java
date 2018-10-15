package my.shapes;

public class Circumference implements IShape {
    private double radius;

    public Circumference(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            throw new ArithmeticException("El radio no puede ser menor o igual a cero (0)");

        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }
}
