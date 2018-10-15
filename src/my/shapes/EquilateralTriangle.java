package my.shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(Triangle.computeThirdSide(side / 2, side),
                side);
    }

    @Override
    public double computePerimeter() {
        return 3 * base;
    }
}
