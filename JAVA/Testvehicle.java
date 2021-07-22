package ust.examples;
//abstract example

abstract class Vehicle{
	int x = 5;
	Vehicle(){
		System.out.println("Vehicle class constructor");
		}
	abstract void run();
	void changeGear() {
		System.out.println("change variant");
	}
	
}


class Honda extends Vehicle{
	void run() {
	System.out.println("running fine");
}
}

public class Testvehicle {

	public static void main(String[] args) {
		
Vehicle v = new Honda();
System.out.println(v.x);
v.run();
v.changeGear();
	}
}

