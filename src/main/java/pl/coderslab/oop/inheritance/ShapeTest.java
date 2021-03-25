package pl.coderslab.oop.inheritance;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape1 = new Shape(4, 8, "czerwony");
        Shape shape2 = new Shape(15, 9, "czerwony");

        System.out.println("wydrukuj kolor shape1: " + shape1.color);
        System.out.println("odległość to: " + shape1.getDistance(shape2));

        Circle circle1 = new Circle(8, 9, "red", 8);
        System.out.println("właściwości circle: " + circle1.getDescription());

    }
}
