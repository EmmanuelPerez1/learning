public class Lsitas {

    public Lsitas miFunc(String name, int... numeros){
        for (int namse: numeros){
            numeros[namse] *= 1;
        }
        return null;
    }

    public static void main(String[] args){

        Lsitas ne = new Lsitas().miFunc("Juyab",5);

        ne.miFunc("Juan",5,4,6,5);
        Circle circulo = new Circle(10);

        circulo.setRadius(5);
        System.out.println(circulo.computeArea());

        Rectangle rectangulo = new Rectangle(10,10);
        System.out.println(rectangulo.computeArea());

        Figuras fg = Figuras.Circle;
        System.out.println(fg);


    }

    enum Figuras{Circle, rectangulo};
}
