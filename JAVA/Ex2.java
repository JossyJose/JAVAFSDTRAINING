package ust.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.println("how many elements you want to add to the array:");
int n = Integer.parseInt(in.readLine());
String[] name = new String[n];
for(int i = 0; i<n;i++){
	name[i]=in.readLine();
}
List<String>list= Arrays.asList(name);
System.out.println();
for(String li: list) {
	String str = li;
	System.out.println(str+" ");
}
	}

}
