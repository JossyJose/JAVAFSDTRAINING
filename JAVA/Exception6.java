package ust.examples;

import java.net.MalformedURLException;
import java.net.URL;

public class Exception6 {


	
	
	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
try {
	URL url = new URL("http://www.google.com");
	
}
finally {
	System.out.println("in finally block");
}
	}

}
