public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return super.computeArea() / 2;
    }

    @Override
    public double computePerimeter() {
        return base * 3;
    }
}
