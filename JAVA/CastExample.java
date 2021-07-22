package ust.examples;

public class CastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double num=15.96;
		System.out.println(num);
		int n=(int)num;//downcasting double type to int type
		System.out.println(n);
		
		int p = 90;
		System.out.println(p);
	double f=p;//smaller one will get into bigger one
		System.out.println(f);
		
		float k= (float)3.34;
		
		byte b =(byte) f;
		System.out.println(b);
		
		long e= 1567;
		float t= (float)e;
		System.out.println(t);
		
		int c = 23347;
		String dbValue= String.valueOf(c);
		System.out.println(dbValue);
		
		dbValue = String.valueOf(c);
				System.out.println(dbValue);	
				
		
				
	}
	
	

}
