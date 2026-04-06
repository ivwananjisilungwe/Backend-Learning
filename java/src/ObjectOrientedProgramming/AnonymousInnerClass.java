package ObjectOrientedProgramming;
// anonymous inner class = an inner class without a name and for which only a single object is created.
//                          they are also used to override the method of a class or an interface.

abstract class Main {
    public void show() {
        System.out.println("in main show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Main obj = new Main() {
            public void show() {
                System.out.println("in anonymous inner class show");
            }
        };
        obj.show();
    }

}