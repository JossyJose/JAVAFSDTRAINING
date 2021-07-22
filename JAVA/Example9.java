package ust.examples;
//about strings
public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		String str1= "hello";
		str="hai";
		System.out.println(str1);
		System.out.println(str.concat(str1));
	
		System.out.println(str.charAt(1));

	//	System.out.println(str.compareTo(str1));
		
		//System.out.println(str.indexOf(1));
	
		System.out.println(	str.length());
	
		System.out.println(str1.substring(3));
	
		
		
		System.out.println(str.valueOf(false));
	
		System.out.println(	str.contains(str1));
	//	str.getChars(0, 0, null, 0);
		
		
		System.out.println(str.isEmpty());
		
		
		System.out.println(str.join( str1 , " hello " ,  " zcf " ));
	
	//	System.out.println	(str.compareTo(str1));
	}

	
}
