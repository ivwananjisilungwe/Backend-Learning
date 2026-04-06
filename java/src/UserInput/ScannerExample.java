package UserInput;
//* UserInput = reading input from users.
//* This file is a runnable practice example for learning.


import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = input.nextLine();
        System.out.println(name);
    }
}
