
package Projects.TemperatureConverter;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose: ");

        if (!scanner.hasNextInt())
            return;
        int choice = scanner.nextInt();

        System.out.print("Enter temperature value: ");
        if (!scanner.hasNextDouble())
            return;
        double temp = scanner.nextDouble();

        switch (choice) {
            case 1 -> System.out.printf("Result: %.2f°F%n", (temp * 9 / 5) + 32);
            case 2 -> System.out.printf("Result: %.2f°C%n", (temp - 32) * 5 / 9);
            default -> System.out.println("Invalid option.");
        }
    }
}
