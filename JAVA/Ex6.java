package ust.examples;

import java.util.HashSet;
import java.util.Iterator;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating hashset and adding elements
		HashSet<String> hs = new HashSet<String>();
		hs.add("Geeks");
		hs.add("for");
		hs.add("Geeks");
		hs.add("is");
		hs.add("Very helpful");
		//traversing elements 
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
