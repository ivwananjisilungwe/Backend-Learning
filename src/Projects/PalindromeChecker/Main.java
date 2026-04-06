package Projects.PalindromeChecker;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Palindrome Checker ===");
        System.out.print("Enter text: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        String input = scanner.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
