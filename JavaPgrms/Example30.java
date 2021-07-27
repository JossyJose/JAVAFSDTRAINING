package ust.examples;

abstract class Animal1{
	abstract void makeSound();
}

class Dog extends Animal1{
	public void makeSound() {
		System.out.println("bark bark");
	}
}

class Cat extends Animal1{
	public void makeSound() {
		System.out.println("meoe meow");
	}
}


 class Example30 {

	public static void main(String[] args) {
		Dog d= new Dog();
		d.makeSound();
		
		Cat c= new Cat();
		c.makeSound();
		
	}

}
