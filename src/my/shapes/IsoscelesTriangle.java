package my.shapes;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double computePerimeter() {
        double side = Triangle.computeThirdSide(base / 2, height);
        return 2 * side + base;
    }
}
