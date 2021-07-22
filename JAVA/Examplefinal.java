package ust.examples;
/*
 * final variable
 * final method
 * final class
 * 
 * 
 */
public class Examplefinal {

	int a ;
	final int b ;

	Examplefinal (){
		a=7;
		b=2;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	final int x;//x is a local variable and is also made final
		x=10;
		System.out.println(x);
		
		Examplefinal e = new Examplefinal();
		System.out.println(e.a);
		System.out.println(e.b);
		e.a=3;
		System.out.println(e.a);

	}

}
