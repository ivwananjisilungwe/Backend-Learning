package Projects.WordCounter;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Word Counter ===");
        System.out.print("Enter a sentence: ");

        if (!scanner.hasNextLine()) {
            return;
        }

        String input = scanner.nextLine().trim().toLowerCase();
        if (input.isEmpty()) {
            System.out.println("No words entered.");
            return;
        }

        String[] words = input.split("\\s+");
        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Total words: " + words.length);
        System.out.println("Word frequency:");
        frequency.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}
