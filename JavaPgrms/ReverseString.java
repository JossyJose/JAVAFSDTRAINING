package ust.examples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original,reverse=" ";
		Scanner sct= new Scanner(System.in);
		System.out.println("Enter string to reverse");
		original=sct.nextLine();
		int length= original.length();
		for(int i = length-1;i>=0;i--)
			reverse=reverse+original.charAt(i);
		System.out.println("Reversed of Entered string is:" +reverse);
		
		
		
	}

}
