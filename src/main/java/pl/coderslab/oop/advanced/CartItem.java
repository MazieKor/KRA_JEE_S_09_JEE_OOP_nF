package pl.coderslab.oop.advanced;

public class CartItem {
    private Product product;
    int quantity;

    public CartItem (Product product ,int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Product pr1 = new Product("cebula");
        pr1.setPrice(0.06);

        double test = pr1.getPrice();
        System.out.println("cena: " + test);

    }



}
