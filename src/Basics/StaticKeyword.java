package Basics;
//! static = modifier. A single copy of a variable/method is created
//!          and shared.
//!          static belongs to the class, rather than an instance of the class.
class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    public void showSpec() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Network: " + network);
        System.out.println("Name: " + name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        Mobile.name = "iphone 14 pro max";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 800;
        Mobile.name = "Galaxy S23 ultra";

        Mobile.name = "Flagship Phone";


        obj1.showSpec();
        obj2.showSpec();

    }
}
