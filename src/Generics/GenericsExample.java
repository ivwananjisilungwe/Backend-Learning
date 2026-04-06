package Generics;
//* Generics = type-safe reusable classes and methods.
//* This file is a runnable practice example for learning.


import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {
        Box<String> nameBox = new Box<>();
        nameBox.setValue("Ivwananji");
        System.out.println("Name from box: " + nameBox.getValue());

        Box<Integer> numberBox = new Box<>();
        numberBox.setValue(42);
        System.out.println("Number from box: " + numberBox.getValue());

        List<Integer> marks = new ArrayList<>();
        marks.add(88);
        marks.add(74);
        marks.add(93);
        printList(marks);

        Integer max = maxOf(12, 30, 25);
        System.out.println("Max value: " + max);
    }

    // Generic method
    public static <T> void printList(List<T> items) {
        System.out.println("Items: " + items);
    }

    // Bounded type parameter: T must implement Comparable
    public static <T extends Comparable<T>> T maxOf(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}

class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
