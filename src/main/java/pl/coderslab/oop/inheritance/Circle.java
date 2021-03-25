package pl.coderslab.oop.inheritance;

public class Circle extends Shape {
    public double radius;
    Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }
    public String getDescription() {
        super.getDescription();
        String zwracanyRadius = String.valueOf(this.radius);
        return zwracanyRadius;
    }
//    final double PI = 3.14;
//    public double getArea(final double PI, Circle circle) {
//        return PI * this.
//    }




}
