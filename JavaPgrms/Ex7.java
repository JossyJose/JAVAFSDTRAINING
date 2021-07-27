package ust.examples;


import java.util.Iterator;
import java.util.TreeSet;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	TreeSet<String> ts = new TreeSet<String>();
		ts.add("Geeks");
		ts.add("for");
		ts.add("Geeks");
		ts.add("is");
		ts.add("Very helpful");
		//traversing elements 
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
