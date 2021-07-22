package ust.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample1 {

	public static void main(String[] args) {
		
		try {
File fName = new File("D:file2.txt");
//fName.write("i'm writing to this file");
if(fName.createNewFile()) {
	System.out.println("file is created");
}else {
	System.out.print("File already exist");
}
System.out.println("---"+fName.canRead());
System.out.println("---"+fName.canWrite());
System.err.println("java ");
Scanner s = new Scanner(System.in);
String txt= s.nextLine();
System.out.print(txt);

fName.setReadable(false);
fName.setWritable(false);
fName.setWritable(false, false);
		//fName.close();
	}catch(IOException e){
		e.printStackTrace();
	}
		
	}

}
