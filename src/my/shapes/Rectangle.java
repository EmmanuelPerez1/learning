package my.shapes;

public class Rectangle implements IShape {
    protected double width;
    protected double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return width * height;
    }

    @Override
    public double computePerimeter() {
        return 2 * width + 2 * height;
    }
}
