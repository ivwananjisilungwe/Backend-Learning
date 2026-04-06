//! The java streamApi is a powerful feature that lets you process collections of data (like lists sets)
//! in a functional,clean and efficient way.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n * 2);
        // int result = s3.reduce(0, (c, e) -> c + e);

        Predicate<Integer> p = (n) -> n % 2 == 0;
          
              
                
        

       int result = nums.stream().filter(p).map(n -> n * 2).reduce(0, (c, e) -> (c + e));

        // s3.forEach(n -> System.out.println(n));

        System.out.println(result);
        System.out.println("Hi");
    }
}

