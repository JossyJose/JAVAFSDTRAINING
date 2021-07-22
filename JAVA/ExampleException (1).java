package ust.examples;
// example of exception
public class ExampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = null;
//int x=5/0;

try {
	try {
		System.out.println(s.length());
	}
	catch(NullPointerException ex) {
	ex.printStackTrace();
	}
finally {
	System.out.println("this code gets excecuted always" );
	}
	int a[] = new int [5];
	a[6]=10;
}
catch(ArrayIndexOutOfBoundsException ex) {
	System.out.println("Exception occured");
	ex.printStackTrace();
}
	
}
}
