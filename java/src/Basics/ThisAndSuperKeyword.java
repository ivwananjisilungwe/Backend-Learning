package Basics;


// this keyword = is a reference variable that refers to the current object
// super keyword = is a reference variable that refers to the parent class object

class A  {

    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        super();
        System.out.println("in A with a parameter");
    }
}
class B extends A {
    public B(){
        super(5);
        System.out.println("in B");
    }

    public B(int x){
        this();
        System.out.println("in B with parameter: " + x);
    }
}
public class ThisAndSuperKeyword {
    public static void main(String[] args) {

        B obj = new B(5);
    }
}
