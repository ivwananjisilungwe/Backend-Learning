package Basics;
//! Type casting = is the process of converting a variable from one data type to another.
//! it is commonly used when you want to store a value of one type in a variable of another type
//! there are two types of type casting in java:
//!
//! 1. Widening casting (automatically) - converting a smaller type to a larger type size
//!    byte -> short -> char -> int -> long -> float -> double
//! 2. Narrowing casting (manually) - converting a larger type to a smaller type size
//!    double -> float -> long -> int -> char -> short -> byte

public class TypeCastingExample {
    public static void main(String[] args){

        //? 1.Primitive type casting
        // Widening casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Narrowing casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

        //? 2.Reference type casting
        // Upcasting (automatically)

        Dog dog = new Dog();
        Animal animal = dog;

        // Downcasting (manually)
        Animal animal2 = new Dog();
        Dog dog2 = (Dog) animal2;
    }
}

class Animal {}
class Dog extends Animal{}
