package ObjectOrientedProgramming.Inheritance;
//* ObjectOrientedProgramming = classes, objects, and OOP principles.
//* This file is a runnable practice example for learning.


public class InheritanceExample {
    public static void main(String[] args) {

        VeryAdvancedCalculator calculator = new VeryAdvancedCalculator();
        int r1 = calculator.add(4,2);
        int r2 = calculator.sub(9,5);
        int r3 = calculator.multi(5,3);
        int r4 = calculator.div(15,4);
        int r5 = (int) calculator.power(2,2);

        System.out.println(r1 +" "+ r2 + " " + r3 + " " + r4 + " " + r5);

    }
}
