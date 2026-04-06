package Lambda_Expression;
//Lambda Expressions = are used to write shorter,cleaner code when working with functional interfaces
@FunctionalInterface
interface Functional{
    int add(int a, int b);
}


public class Main {
   public static void main(String[] args) {
       Functional functional = (int a, int b) -> a + b;

       int result = functional.add(5,4);
       System.out.println(result);
   }
}
