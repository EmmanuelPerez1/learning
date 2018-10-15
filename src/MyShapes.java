import my.shapes.*;

import java.util.ArrayList;

class MyShapes {

    public static void main(String[] args) {
        ArrayList<IShape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(6, 2.6));
        shapes.add(new Square(6.3));
        shapes.add(new IsoscelesTriangle(3, 7));
        shapes.add(new EquilateralTriangle(7.9));
        shapes.add(new IsoscelesTriangle(3.2, 7));
        shapes.add(new Circumference(5.14));

        System.out.println("Existen " + shapes.size() + " figuras en el arreglo.");
        System.out.println("Sus áreas son:");

        for (IShape shape : shapes)
            System.out.printf("  %1$.3f\n", shape.computeArea());

        System.out.println();
        System.out.println("Sus perímetros son:");

        for (IShape shape : shapes)
            System.out.printf("  %1$.3f\n", shape.computePerimeter());
    }
}
