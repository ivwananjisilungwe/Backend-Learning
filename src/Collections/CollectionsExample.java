package Collections;
//Collection =  is an object that holds multiple elements(objects) in a single unit

import java.util.*;


public class CollectionsExample {
    public static void main(String[] args){

        //* 1.List
        List<Integer> nums =  new ArrayList<Integer>();
        nums.add(6);
        nums.add(9);
        nums.add(8);
        nums.add(6);

        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(6));

//        for (int n : nums){
//            System.out.println(n);
//        }
//        System.out.println(nums);

        //? 2.Sets
        Set<Integer> numbers =  new HashSet<>();
        numbers.add(100);
        numbers.add(9);
        numbers.add(8);
        numbers.add(8);
        numbers.add(10);

        System.out.println(numbers);

        Collection<Integer> values = new TreeSet<Integer>();
        values.add(3);
        values.add(4);
        values.add(10);
        values.add(3);

        System.out.println(values);

            



   }
}
