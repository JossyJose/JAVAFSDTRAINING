package ust.examples;

import java.io.IOException;
import java.io.StringReader;

//string reader
public class FileExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Hello world!\n this is StringReader Program";
StringReader sr = new StringReader(str);
int i = 0;
try {
	while((i=sr.read())!=-1) {
		System.out.print((char)i);
	}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}
	}


