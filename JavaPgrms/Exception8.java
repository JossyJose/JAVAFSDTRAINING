package ust.examples;

public class Exception8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[]=new int[3];
	a[3]=8/9;
	try {
		a[2]=78;
	}
			catch(ArithmeticException e) {
				System.out.println("Error occures");
			}
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("No errors");
}
	}

}
