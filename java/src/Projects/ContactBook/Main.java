package Projects.ContactBook;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contacts = new HashMap<>();

        while (true) {
            System.out.println("\n=== Contact Book ===");
            System.out.println("1. Add contact");
            System.out.println("2. Find contact");
            System.out.println("3. List contacts");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            if (!scanner.hasNextLine()) break;
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine().trim();
                    contacts.put(name, phone);
                    System.out.println("Contact saved.");
                }
                case "2" -> {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine().trim();
                    String phone = contacts.get(name);
                    if (phone == null) {
                        System.out.println("Contact not found.");
                    } else {
                        System.out.println(name + " -> " + phone);
                    }
                }
                case "3" -> {
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts.");
                    } else {
                        contacts.forEach((name, phone) -> System.out.println(name + " -> " + phone));
                    }
                }
                case "0" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
