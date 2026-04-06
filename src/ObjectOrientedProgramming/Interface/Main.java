package ObjectOrientedProgramming.Interface;
//* ObjectOrientedProgramming = classes, objects, and OOP principles.
//* This file is a runnable practice example for learning.

interface A {

    int age = 44;    // final and static

    void show();
    void config();
}

class B implements A {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Main {
    public static void main(String[] args){
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
    }
}
