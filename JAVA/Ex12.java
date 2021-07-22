package ust.examples;
class GenericsClass1< T extends Number>{
	public void display() {
		System.out.println("this is a bounded type generics class.");
	}
}
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	GenericsClass1<Number> obj = new GenericsClass1<>();
obj.display();
}

}