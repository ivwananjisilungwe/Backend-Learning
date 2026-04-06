package Projects.NumberGuessingGame;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int target = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (true) {
            System.out.print("Your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                break;
            }

            int guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
    }
}
