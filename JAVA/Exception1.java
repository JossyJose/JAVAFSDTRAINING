package ust.examples;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//code that generates exception
	int divideByZero = 5/0;
}
catch(ArithmeticException e)
{
	System.out.println("ArthemeticException => " + e.getMessage());
}
finally {
	System.out.println("this is the final block");
}
	}

}
