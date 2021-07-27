package ust.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExampleFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//FileInputStream input = new FileInputStream("D:file2.txt");
//	System.out.println("Data in the file:");
	//Reads the first byte
//	int i = input.read();
//	while(i!=-1) {
	//	System.out.print((char)i);
		//reads next byte from the file
	//	i=input.read();
	//}
//	input.close();
	String x = "i need to write this into the file";
	
	FileOutputStream output=new FileOutputStream("D:file2.txt");
	output.write(x.getBytes());
	output.close();
}
catch(Exception e) {
	e.getStackTrace();
}
	}

}
