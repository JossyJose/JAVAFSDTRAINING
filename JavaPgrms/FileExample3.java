package ust.examples;

import java.io.*;

public class FileExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file = new File("D:");
try
{
//returns an array of all files
String[] fileList=file.list();
for(String str : fileList) {
	System.out.println(str);
}
	}
catch(Exception e) {
	e.getStackTrace();
}
}
}