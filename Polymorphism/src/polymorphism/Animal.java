package polymorphism;

public class Animal {
	void makeSound() {
        System.out.println("making sound");
    }

}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("dog barking");
    }
}   //this code is showing method overriding ,the child class dog overrides parent class 