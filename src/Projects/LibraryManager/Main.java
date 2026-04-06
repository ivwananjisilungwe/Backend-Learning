package Projects.LibraryManager;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> availableBooks = new HashSet<>();
        Set<String> borrowedBooks = new HashSet<>();

        availableBooks.add("Clean Code");
        availableBooks.add("Effective Java");
        availableBooks.add("Head First Java");

        while (true) {
            System.out.println("\n=== Library Manager ===");
            System.out.println("1. View available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            if (!scanner.hasNextLine())
                break;
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> availableBooks.forEach(System.out::println);
                case "2" -> {
                    System.out.print("Book title: ");
                    String title = scanner.nextLine();
                    if (availableBooks.remove(title)) {
                        borrowedBooks.add(title);
                        System.out.println("Borrowed: " + title);
                    } else {
                        System.out.println("Book unavailable.");
                    }
                }
                case "3" -> {
                    System.out.print("Book title: ");
                    String title = scanner.nextLine();
                    if (borrowedBooks.remove(title)) {
                        availableBooks.add(title);
                        System.out.println("Returned: " + title);
                    } else {
                        System.out.println("That book was not borrowed.");
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
