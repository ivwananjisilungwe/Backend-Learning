package ObjectOrientedProgramming.Encapsulation;
// Encapsulation =  is Hiding the data + expose only what’s necessary

class Human {
     private int age = 21;
     private String name = "Ivwananji";

     public int getAge() {
        return age;
     }

     public void setAge(int age) {

         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name){
         this.name = name;
     }
}

public class EncapsulationExample {

    public static void main(String[] args) {
    Human obj1 = new Human();

    obj1.setName("Silungwe");
    obj1.setAge(22);

        System.out.println("Name : " + obj1.getName() + " Age : " + obj1.getAge());

    }
}
