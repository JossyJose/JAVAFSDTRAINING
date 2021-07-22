package ust.examples;

import java.io.StringWriter;

public class FileExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Hello World";
String str2="\n this is stringReader program";
StringWriter outputWriter = new StringWriter();
outputWriter.write(str1, 0, 5);
System.out.println(outputWriter.toString());
//get stringbuffer of output writer
StringBuffer sbuf = outputWriter.getBuffer();
//appemd str2 into stringbuffer
sbuf.append(str2);
System.out.println(outputWriter.toString());
	}

}
