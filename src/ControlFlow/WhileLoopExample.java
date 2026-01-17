package ControlFlow;
//! while loop = is used to repeatedly execute a block of code
//!              as long as a specified condition is true.

import java.util.Scanner;

public class WhileLoopExample {
    public static void main(String[] args) {

        int count = 1;

        // Using while loop to print numbers from 1 to 5
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Using while loop to find the sum of first 10 natural numbers
        int sum = 0;
        int number = 1;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("Sum of first 10 natural numbers: " + sum);

        Scanner input = new Scanner(System.in);
        int numberToGuess = 7;
        int userGuess = 0;
         while (userGuess != numberToGuess) {
            System.out.print("Guess a number between 1 and 10: ");
            userGuess = input.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        input.close();
    } // end main
} // end  class

