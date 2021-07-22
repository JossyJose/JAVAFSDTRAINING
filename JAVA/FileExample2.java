package ust.examples;

import java.io.File;

public class FileExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a file object
		File file = new File("D:file2.txt");
		//create a file
		try {
			file.createNewFile();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		//create an object that contains the new name of file
		File newFile = new File("D:file3.txt");
		//change the name of file
		boolean value = file.renameTo(newFile);
		if(value) {
			System.out.println("the name of the file is changed .");
		}
		else {
			System.out.println("the name of the file cannot be changed.");
		}
	}

}
