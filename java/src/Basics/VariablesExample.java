package Basics;
//! Variable = is a named location that stores a value. in java, every variable has a type, No type, no code
//! There are two types of variables in java:
//! 1. Primitive types and 2. Reference types

public class VariablesExample {
    public static void main(String[] args) {

        // 1.primitive types
        int number = 10;
        double price = 12.79;
        float rate = 2.5f;
        long population = 10000000L;

        char grade = 'A';
        boolean isActive = true;


        // 2.reference types
        String name = "Ivwananji";

        String s1 = "Hello";
        String s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

        s2 = "World";


        System.out.println(s1);
        System.out.println(s2);
    }
}
