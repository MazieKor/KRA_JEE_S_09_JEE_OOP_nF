package pl.coderslab.oop.advanced;

public class Product {
    public int id;
    public static int nextId = 1;
    public String name;
    public double price;

    Product(String name) {
        this.id = nextId;
        this.name = name;
        nextId++;
    }

    public void setPrice(double price) {
        if (price > 0.05)
            this.price = price;
        else
            throw new ArithmeticException();
    }

    public double getPrice() {
        return this.price;
    }



}
