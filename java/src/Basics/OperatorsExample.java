package Basics;
//! Operators = special symbols that perform specific operations on one, two, or three operands, and then return a result.
//! There are several types of operators in Java, including:
//! 1. Arithmetic Operators: +, -, *, /, %, ++, --
//! 2. Assignment Operators: =, +=, -=, *=, /=, %=
//! 3. Comparison Operators: ==, !=, >, <, >=, <=
//! 4. Logical Operators: &&, ||, !
//! 5. Bitwise Operators: &, |, ^, ~, <<, >>, >>>
//! 6. Ternary Operator: ?

public class OperatorsExample {
    public static void main(String[] args) {

        // 1.Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2.Assignment Operators
        int c = 10;
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c);

        // 3.Comparison Operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than

        // 4.Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR

        // 5.Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max value: " + max);


    }
}
