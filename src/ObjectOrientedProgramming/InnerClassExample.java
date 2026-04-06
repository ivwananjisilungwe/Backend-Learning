package ObjectOrientedProgramming;
// inner class = a class which is nested within another class
//! inner classes are used to logically group classes that are only used in one place
//! increases encapsulation
//! can lead to more readable and maintainable code

 class A {

    int age;

    public void show(){
        System.out.println("in A show");
    }

    class B {
        public void config(){
            System.out.println("In config");
        }
    }
}


public class InnerClassExample {
   public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj2 = obj.new B();
        obj2.config();


    }
}
