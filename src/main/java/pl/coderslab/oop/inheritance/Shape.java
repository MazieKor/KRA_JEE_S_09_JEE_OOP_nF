package pl.coderslab.oop.inheritance;

public class Shape {
    private int x;
    private int y;
    String color;

    Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        String zwracanyX = String.valueOf(this.x);
        String zwracanyY = String.valueOf(this.y);
        String zwracanyColor = String.valueOf(this.color);
        return String.join(" ", zwracanyX, zwracanyY, zwracanyColor);
    }

    public double getDistance(Shape shape2) {
        double result = Math.pow((this.x - shape2.x), 2) + Math.pow((this.y - shape2.y), 2);
        return result;
    }
}
