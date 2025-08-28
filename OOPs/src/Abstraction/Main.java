package Abstraction;

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); 
        a.makeSound();        // output will be bark
        a.sleep();             
    }
}