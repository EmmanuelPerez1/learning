package my.shapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side,
                Triangle.computeThirdSide(side / 2, side));
    }

    @Override
    public double computePerimeter() {
        return 3 * base;
    }
}
