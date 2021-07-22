package ust.examples;

import java.util.Scanner;

public class VowelsInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		char ch;
		int i= 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		s=sc.nextLine();
		System.out.println("Vowels in a String are");
		for(int j=0;j<s.length();j++)
		{
		ch=s.charAt(j);
		switch(ch)
		{
			
		case 'a':
			
		case 'e':
			
		case 'i':
			
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': i= 1;
		System.out.println(ch);
		}
			
			}
		if(i==0)
			System.out.println("there are no vowels in a String");

}
}
