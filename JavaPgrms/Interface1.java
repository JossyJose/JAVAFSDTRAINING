package ust.examples;
interface Animal{
	public void animalSound();
	public void sleep();
}

class Pig implements Animal{
	public void animalSound() {
		System.out.println("the pig says:wee wee");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pig myPig = new Pig();
myPig.animalSound();
myPig.sleep();
	}

}
