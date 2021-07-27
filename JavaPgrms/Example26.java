package ust.examples;

public class Example26 {
int num;
public Example26() {
	System.out.println("hello");
	num=30;
}

public Example26(int value) {
	this();
	System.out.println("hi");
	num=value;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Example26 e1 = new  Example26(30);
	}

}
