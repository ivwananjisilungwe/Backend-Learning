package Exceptions;
//Exception = is an event that disrupts the normal flow of a program while it is running
public class Demo {
    public static void main(String[] args){

        int a = 2;

        int numbers[] = new int[5];


        try {
            int result = 18/0;
            System.out.println(numbers[1]);
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            System.out.println("Something went wrong..." + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit" + e);
        }

    }
}
