package ust.examples;

import java.io.File;

//basic file operations
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  File f = new File("C:\\Users\\ustjava05\\sample.txt");
 // if(f.createNewFile()) {
	  System.out.println("new file is created");
 // }else {
	  System.out.println("file already exists");
  }
		
	}

//}
