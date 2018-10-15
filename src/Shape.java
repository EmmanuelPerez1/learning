public abstract class Shape implements IShape {
    protected double height;
    protected double width;

    @Override
    public double computeArea() {
        return width * height;
    }

    public abstract double computePerimeter();
}
