package Projects.ExpenseTracker;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add expense");
            System.out.println("2. View total");
            System.out.println("3. View all expenses");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            if (!scanner.hasNextLine()) break;
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Enter amount: ");
                    if (!scanner.hasNextLine()) break;
                    try {
                        double amount = Double.parseDouble(scanner.nextLine());
                        if (amount > 0) {
                            expenses.add(amount);
                            System.out.println("Expense added.");
                        } else {
                            System.out.println("Amount must be positive.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid amount.");
                    }
                }
                case "2" -> {
                    double total = expenses.stream().mapToDouble(Double::doubleValue).sum();
                    System.out.printf("Total expenses: %.2f%n", total);
                }
                case "3" -> {
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded.");
                    } else {
                        for (int i = 0; i < expenses.size(); i++) {
                            System.out.printf("%d. %.2f%n", i + 1, expenses.get(i));
                        }
                    }
                }
                case "0" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
