package Enums;
//* Enums = fixed sets of constants using enum types.
//* This file is a runnable practice example for learning.

enum Status {
    Running, Failed, Pending, Success;
}
public class EnumExample {
    public static void  main(String[] args){

        Status status = Status.Success;

        switch (status){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            default:
                System.out.println("Done");
        }


//        if (status == Status.Running ){
//            System.out.println("All Good");
//        } else if (status == Status.Failed) {
//            System.out.println("Try Again");
//        } else if (status == Status.Pending) {
//            System.out.println("Please Wait");
//        }else {
//            System.out.println("Done");
//        }

    }
}
