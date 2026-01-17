package ControlFlow;
//! if-else = a control flow statement that executes a block of code
//!           if a specified condition is true. If the condition is false,
//!           another block of code can be executed.
public class IfElseExample {
    public static void main(String[] args) {

        int number = 10;

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is an odd number.");
        }


    } // end main
} // end class
