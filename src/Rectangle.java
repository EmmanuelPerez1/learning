public class Rectangle extends Shape {
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double computePerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public double computeArea() {
        return super.computeArea();
    }
}
