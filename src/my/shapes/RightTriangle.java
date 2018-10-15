package my.shapes;

public class RightTriangle extends Triangle {
    public RightTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double computePerimeter() {
        return base + height +
                Triangle.computeThirdSide(base, height);
    }
}
