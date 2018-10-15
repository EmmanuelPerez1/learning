package my.shapes;

public abstract class Triangle implements IShape {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (base * height) / 2;
    }

    @Override
    public abstract double computePerimeter();

    public static double computeThirdSide(double firstSide, double secondSide) {
        double a = Math.pow(firstSide, 2),
                b = Math.pow(secondSide, 2),
                c = Math.sqrt(a + b);

        return c;
    }
}
