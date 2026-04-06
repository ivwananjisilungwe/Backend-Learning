package Annotations;
//* Annotaions = are metadata-they give information about code
// but do not directly change how the code runs.
class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in A show");
    }
}

class B extends A {
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show");
    }
}

public class Main {
    public static void main(String[] args){
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
