package Projects.CalculatorApp;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculator App ===");
        System.out.print("Enter first number: ");
        if (!scanner.hasNextDouble())
            return;
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        System.out.print("Enter second number: ");
        if (!scanner.hasNextDouble())
            return;
        double b = scanner.nextDouble();

        double result;
        switch (op) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = a / b;
            }
            default -> {
                System.out.println("Invalid operator.");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}
