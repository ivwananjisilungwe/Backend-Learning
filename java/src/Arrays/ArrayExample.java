package Arrays;
//* Arrays = array creation, traversal, and multidimensional structures.
//* This file is a runnable practice example for learning.

class Student {
    int id;
    String name;
    int marks;
}
public class ArrayExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Ivwananji";
        s1.marks = 100;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "samson";
        s2.marks = 200;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "jason";
        s3.marks = 300;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }

        //for each loop
        for (Student s : students){
            System.out.println(s.name + " : " + s.marks);
        }

    }
}
