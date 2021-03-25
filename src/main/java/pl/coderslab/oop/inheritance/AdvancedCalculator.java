package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(int value, int exp) {
        double result = Math.pow(value, exp);
        String op = "Pow " + value + " by " + exp + " got " + result;
        addOperations(op);
        return result;
    }

    public double root(int value, int root) {
        double result = Math.pow(value, 1.0 / root);
        String op = "Root " + value + " to " + root + " got " + result;
        return result;
    }
}
