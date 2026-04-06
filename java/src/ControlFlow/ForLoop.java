package ControlFlow;
//! for loop = a control flow statement that allows code to be executed
//!            repeatedly based on a given boolean condition.
public class ForLoop {
    public static void main(String[] args) {

        int number = 5;

         for (int i = 0; i <= number; i++){
             System.out.println(i);
         }

         // Nested for loop
         for (int i = 1; i <= 3; i++) {
             for (int j = 1; j <= 2; j++) {
                 System.out.println("i: " + i + ", j: " + j);
             }
         }

         // break statement and continue statement
         for (int i = 1; i <= 10; i++) {
             if (i == 5) {
                continue;
             } else if (i == 8) {
                 break;
             }
             System.out.println(i);
         }
    }
}
