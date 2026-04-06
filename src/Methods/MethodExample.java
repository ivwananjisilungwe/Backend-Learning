package Methods;
//! method = a block of code that is executed whenever it is called upon.
//!          methods are used to perform certain actions, and they are
//!          also known as functions.
public class MethodExample {
    public static void main(String[] args) {
        int result = add(4,5);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int product = calculator.multiply(2,3);
        System.out.println(product);


    }
    //! 1.value returning method
    public static int add(int a, int b) {
        return a + b;
    }

    //! 2.void method
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


}
//! 3.method overloading = multiple methods with the same name
//!                        but different parameters.
class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}