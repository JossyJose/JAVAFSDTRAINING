package ust.examples;

public class Exception9 {

	public static int returnTest(int number) {
		try {
			if(number%2==0)throw new Exception("Exception thrown");
			else  return 5;
		}
		catch(Exception e ) {
			return 3;
		}
		finally {
			return 7;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(returnTest(2));
	}

}
