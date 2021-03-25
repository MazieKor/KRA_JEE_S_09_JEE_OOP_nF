package pl.coderslab.oop.constructor;

import pl.coderslab.oop.inheritance.AdvancedCalculator;

public class ClaculatorTest {
    public static void main(String[] args) {
        Calculator someCalc = new AdvancedCalculator();   // nowy
        someCalc.printOperations();

        double result = someCalc.add(1,2);
        System.out.println(result);
        result = someCalc.multiply(4, 8);
        result = someCalc.divide(1028901, 2591);

        if (someCalc instanceof AdvancedCalculator) {    //dvancedCalc - drugie zadanie
            AdvancedCalculator advC = (AdvancedCalculator) someCalc;
            advC.pow(10,3);
        }

        someCalc.printOperations();

        someCalc.clearOperation();
        result = someCalc.subtract(10, 100);
        someCalc.printOperations();
    }
}