package Abstraction;

	abstract class Animal {
	    abstract void makeSound();  //abstract method
	    void sleep() {
	        System.out.println("Sleepin");
	    }
	}

	class Dog extends Animal {
	    public void makeSound() {
	        System.out.println("Bark");  //dog class extending abstract class
	    }
	}
	
