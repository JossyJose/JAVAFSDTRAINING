package ust.examples;

public class Exception7  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Exception7  met = new Exception7 () ;
	System.out.println("length of Junk is " + met.getStringSize("Junk"));
	System.out.println("length of wrong is "+met.getStringSize("wrong"));
	System.out.println("length of null String is "+met.getStringSize(null));
	}
catch(Exception ex) {
	
		
	
	System.out.println("lException message :"+ex.getMessage());
		
	}
	
}

	
	public int getStringSize(String str) throws Exception{
		if(str==null) {
			throw new Exception("String input is null");
		}
		return str.length();
	}

}
