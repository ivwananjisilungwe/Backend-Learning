package ObjectOrientedProgramming.Constructors;

//? Constructor = is a special method that is used to initialize objects
//?               the constructor is called when an object of a class is created
//?               it can be used to set initial values for object attributes
//?
//?               note: 1. constructor name must be same as class name
//?                     2. constructor has no return type
class Human {

    String name;
    int age;

    // Constructor
   public Human() {
        name = "Ivwananji";
        age = 21;

    }

    public Human(String name, int age) {
       this.name = name;
       this.age = age;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human("Silungwe", 22);
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
