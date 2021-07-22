package ust.examples;

import java.io.FileReader;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] array = new char[100];
		try {
			//create a reader using the filereader
			FileReader input = new FileReader("D:file2.txt");
			//read characters
			input.read(array);
			System.out.println("data in the file ");
			System.out.println(array);
			input.close();
		}
		
		catch(IOException e) {
			e.getStackTrace();
		}
	}

}
