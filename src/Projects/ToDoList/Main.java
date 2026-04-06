package Projects.ToDoList;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n=== To-Do List ===");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove task");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            if (!scanner.hasNextLine()) break;
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Task: ");
                    if (!scanner.hasNextLine()) break;
                    String task = scanner.nextLine().trim();
                    if (!task.isEmpty()) {
                        tasks.add(task);
                        System.out.println("Added.");
                    }
                }
                case "2" -> {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                }
                case "3" -> {
                    System.out.print("Task number to remove: ");
                    if (!scanner.hasNextLine()) break;
                    try {
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                            System.out.println("Removed.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a valid number.");
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
