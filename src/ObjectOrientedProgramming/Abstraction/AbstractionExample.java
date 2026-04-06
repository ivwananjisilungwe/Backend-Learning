package ObjectOrientedProgramming.Abstraction;
// Abstraction = hiding the complex implementation details and showing only the necessary features of an object
//? Abstraction can be achieved with either abstract classes or interfaces (interface will be covered later in the course)
//? Abstract class = is a class that is declared with the abstract keyword

abstract class Car {

    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

abstract class WagonR extends Car {

    public void drive() {
        System.out.println("Driving Wagon");
    }

}
 class UpdatedWagonR extends WagonR {
    public void fly() {
        System.out.println("Driving Wagon");
    }
 }
public class AbstractionExample {
    public static void main(String[] args) {
        
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
    }
}
