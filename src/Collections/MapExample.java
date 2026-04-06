package Collections;
//* Map = is a collection that associates keys with values.
//* A map stores data i key-value pairs, so each key maps to exactly one value
//* Keys are unique, but values can be the same   

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Ivwananji", 56);
        students.put("Samson", 56);
        students.put("Jason", 66);
        students.put("Allan", 0);
        
        System.out.println(students.keySet());
        
    }
}
