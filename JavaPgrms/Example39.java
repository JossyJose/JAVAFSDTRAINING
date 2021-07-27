package ust.examples;
//static nested class
public class Example39 {
static class Nested_Demo{
	public void my_mathod() {
		System.out.println("This is my nested class");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example39.Nested_Demo nested = new Example39.Nested_Demo();
		nested.my_mathod();
	}

}
