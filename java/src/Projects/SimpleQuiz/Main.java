package Projects.SimpleQuiz;
//* Projects = mini console applications for practice.
//* This file is a runnable practice example for learning.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("=== Simple Quiz ===");

        System.out.println("1) Java is platform independent. (true/false)");
        if (scanner.hasNextLine() && scanner.nextLine().trim().equalsIgnoreCase("true"))
            score++;

        System.out.println("2) Which keyword is used to inherit a class?");
        System.out.println("a) implements  b) extends  c) inherit");
        if (scanner.hasNextLine() && scanner.nextLine().trim().equalsIgnoreCase("b"))
            score++;

        System.out.println("3) Which package contains Scanner?");
        System.out.println("a) java.io  b) java.util  c) java.lang");
        if (scanner.hasNextLine() && scanner.nextLine().trim().equalsIgnoreCase("b"))
            score++;

        System.out.println("Your score: " + score + "/3");
    }
}
