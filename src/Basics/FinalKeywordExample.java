package Basics;
// final = a keyword in Java that can be used to declare constants, prevent method overriding, and prevent inheritance.

// 1. Final variable: A final variable is a constant that cannot be changed once it is initialized. It must be initialized at the time of declaration or in the constructor.
// 2. Final method: A final method cannot be overridden by subclasses. It can be inherited, but it cannot be modified in the subclass.
// 3. Final class: A final class cannot be extended by any other class. It can be instantiated, but it cannot be subclassed.

class Calc {
    public void show() {
        System.out.println("in calc show");
    }

    public void add(int a, int b) {
        System.out.println(a + b);

    }
}

class AdvCalc extends Calc {
    public void show() {
        System.out.println("in adv calc show");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(5, 10);
    }

}
