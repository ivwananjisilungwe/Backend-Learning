package Enums;
//* Enums = fixed sets of constants using enum types.
//* This file is a runnable practice example for learning.

enum Laptop {
    Macbook(2000), XPS(2200), Surface, Thinkpad(800);

    private int price;

   private Laptop() {
        price = 500;
    }

   private Laptop(int price) {
        this.price = price;
       System.out.println("in Laptop " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Main {
   public static void main(String[] args) {
//        Laptop laptop = Laptop.Macbook;
//        System.out.println(laptop + ":" + laptop.getPrice());

       for (Laptop laptop : Laptop.values()) {
           System.out.println(laptop + " : " + laptop.getPrice());
       }

    }
}
