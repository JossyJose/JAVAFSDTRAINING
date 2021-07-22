package ust.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception2 {
	//declaring the type of exception 
	public static void findfile()throws IOException {
		File newFile = new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	findfile();
}
catch(IOException e) {
	System.out.println(e);
}
	}

}
