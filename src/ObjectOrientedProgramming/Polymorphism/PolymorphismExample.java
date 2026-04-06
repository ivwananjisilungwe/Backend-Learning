package ObjectOrientedProgramming.Polymorphism;
// Polymorphism is the ability of an object to take on many forms.
// It allows us to use a single interface to represent different types of objects.
// In Java, there are two types of polymorphism: compile-time polymorphism (method overloading)
// and runtime polymorphism (method overriding).

class Calculator {
    // Method overloading: same method name, different parameters
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape{
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape{
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class PolymorphismExample {

    public static void main(String[] args) {
        // Compile-time polymorphism (method overloading)
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10)); // Output: 15
        System.out.println(calculator.add(5.5, 10.5)); // Output: 16.0

        // Runtime polymorphism (method overriding)
        Shape shape = new Shape();
        shape.draw();

        shape =  new  Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();




    }
}
