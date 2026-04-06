package ObjectOrientedProgramming.Interface;
//* ObjectOrientedProgramming = classes, objects, and OOP principles.
//* This file is a runnable practice example for learning.

interface Computer{
   void code();
}

class Laptop implements Computer {
    public void code(){
        System.out.println("code,compile run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code,compile run : faster");
    }
}

class Developer {
    public void devApp(Computer lap){
       lap.code();
    }
}

public class Demo {
   public static void main(String[] args) {

       Computer lap = new Laptop();
       Computer desk = new Desktop();


        Developer ivwa = new Developer();
        ivwa.devApp(desk);
    }
}
