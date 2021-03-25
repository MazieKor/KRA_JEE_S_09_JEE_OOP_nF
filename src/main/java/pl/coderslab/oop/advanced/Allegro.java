//package pl.coderslab.oop.advanced;
//
//import pl.coderslab.oop.advanced.Product;
//import pl.coderslab.oop.advanced.ShoppingCart;
//public class Allegro {
//    public static void main(String[] args) {
//        ShoppingCart cart = new ShoppingCart();
//        Product cebula = new Product("Cebula", 2.50);
//        Product czosnek = new Product("Czosnek", 4.00);
//        Product bakłażan = new Product("Bakłażan", 8.00);
//        Product kalarepa = new Product("Kalarepa", 12.00);
//        System.out.println("--- TEST DODAWANIA ---");
//        cart.addProduct(cebula, 5);
//        cart.addProduct(czosnek, 1);
//        System.out.println("Czy jest 6 produktów?" + (6 == cart.getTotalQuantity()));
//        System.out.println("Czy kosztują 16.50?" + (16.5 == cart.getTotalSum()));
//        System.out.println("--- TEST DODAWANIA Z AKTUALIZACJĄ ---");
//        cart.addProduct(bakłażan, 2);
//        cart.addProduct(cebula, 4);
//        System.out.println("Czy jest 12 produktów?" + (12 == cart.getTotalQuantity()));
//        System.out.println("Czy kosztują 42.50?" + (42.50 == cart.getTotalSum()));
//        cart.addProduct(kalarepa, 1);
//        System.out.println("--- TEST UPDATEA ---");
//        cart.updateProduct(cebula, 10);
//        System.out.println("Czy jest 14 produktów?" + (14 == cart.getTotalQuantity()));
//        System.out.println("Czy kosztują 57.00?" + (57.0 == cart.getTotalSum()));
//        System.out.println("--- TEST REMOVE ---");
//        cart.removeProduct(kalarepa);
//        System.out.println("Czy jest 13 produktów?" + (13 == cart.getTotalQuantity()));
//        System.out.println("Czy kosztują 45.00?" + (45.0 == cart.getTotalSum()));
//        cart.printReceipt();
//    }
//}