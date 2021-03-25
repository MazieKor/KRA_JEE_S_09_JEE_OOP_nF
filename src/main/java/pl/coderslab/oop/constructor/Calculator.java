package pl.coderslab.oop.constructor;

import java.util.Arrays;

public class Calculator {

    private String[] operations;

    public Calculator(){
        operations = new String[0];
    }

    public void printOperations() {
        for (String op : operations) {
            System.out.println(op);
        }
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        String operation = "add " + num1 + "to " + num2 + " got " + result;
        addOperations(operation);
        return result;
    }

    public void addOperations(String operation){
        operations = Arrays.copyOf(operations, operations.length + 1);
        operations[operations.length - 1] = operation;
    }

    public int subtract(int num1, int num2) {
        int result = num1 - num2;
        String operation = "From " + num1 + " subtract " + num2 + " got " + result;
        addOperations(operation);
        return result;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        return num1 / num2;
    }

    public void clearOperation() {
        operations = new String[0];
    }

//    String[] history = new String[0];
//
//    public Calculator(){
//        String[1] history = "added " + ;
//    }
//
//    public static void main(String[] args) {
//
//        int result = add(3, 5);
//        System.out.println("wynik dodawania  to: " + result);
//    }
//
//
//    public static int add(int num1, int num2) {
//        int result = num1 + num2;
//        Calculator newSum = new Calculator();
//        return result;
//    }
//
//    public static int multiply(int num1, int num2) {
//        int result = num1 * num2;
//
//        return result;
//    }
//
//    public static int subtract(int num1, int num2) {
//        int result = num1 - num2;
//
//        return result;
//    }
//    public double divide(int num1, int num2) {
//
//        double result = num1 / num2;
//
//        return result;
//    }

//    printOperations();
//    clearOpertions();

}
