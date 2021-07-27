package ust.examples;

import java.io.IOException;

//throw example
class ThrowExample{
	void myMethod(int num)throws IOException,
	ClassNotFoundException{
		if(num==1)
			throw new
			IOException("IOEcxeption Occures");
		else
			throw new
			ClassNotFoundException("ClassNotFoundException");
	}
}
public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ThrowExample obj = new ThrowExample();
	obj.myMethod(1);
}
catch(Exception ex) {
	System.out.println(ex);
}
	}

}
