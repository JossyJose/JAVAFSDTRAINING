package ust.examples;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList arr = new ArrayList();
arr.add(2);
arr.add(4.2f);
arr.add("String hai");
arr.add(2,"abhi");
//arr.remove(1);
System.out.println(arr);
ArrayList<Integer>x=new ArrayList<Integer>();
x.add(10);
x.add(1);
x.add(5);
x.add(8);
Collections.sort(x);
System.out.println(x);
boolean a = x.contains(1);
if( a) {System.out.println("the list contails 1");
	}else {
		System.out.println("It does not contain 1");
	}
x.set(1, 3);
System.out.println(x);
	}
}
