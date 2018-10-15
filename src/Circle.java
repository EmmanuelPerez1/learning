public class Circle extends Shape {
    protected final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double computePerimeter() {
        return (2 * PI) * radius;
    }

    public double computeArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            throw new ArithmeticException("El radio no puede ser menor o igual a cero (0)");

        this.radius = radius;
    }
}
