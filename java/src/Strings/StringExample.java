package Strings;
//!? Strings = a sequence of characters
//!?           are immutable = cannot be changed
//!?           created using string literal or new keyword
//!?           special class with many methods to manipulate strings
public class StringExample {
    public static void main(String[] args) {
        String name = "Ivwananji";
        String greeting = "Hello, " + name + "!";

        String s1 = "Hello";
        String s2 = s1;
        System.out.println(s1.equals(s2));

        //Mutable String using StringBuffer and StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        sb.deleteCharAt(0);
        sb.insert(1, "java");
        System.out.println(sb);


    }
}
