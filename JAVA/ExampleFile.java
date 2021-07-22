package ust.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFile {

	public static void main(String[] args) {
		try {
	File f= new File("D.File1.txt");
/*
 	if(f.createNewFile()) {
 */
	//	System.out.println(f.getName()+ "is created");
//	}else {
//		System.out.println("Already exists");
//	}
	//f.write("this is a java training");
	Scanner read = new Scanner(f);
	while(read.hasNextLine()) {
		String data = read.nextLine();
				System.out.println(data);
	}
read.close();
	}
catch(IOException e) {
	System.out.println("Exception gone");
}
}
}