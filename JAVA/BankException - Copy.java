package ust.examples;

public class BankException extends Exception{
	static String message = "error";
	BankException(String message){
	super(message);
	}
	
	public static void main(String[] args)throws BankException {
		// TODO Auto-generated method stub
		if(message.equals("error")) {
			System.out.println("error message");
		}
		else {
			throw new BankException("BankException");
		}
	//	BankException e = new BankException("error");
		//try {
		//	int x=5/0;
	//	}catch(ArithmeticException ex) {
	//		e.printStackTrace();
		}
	}

//}
