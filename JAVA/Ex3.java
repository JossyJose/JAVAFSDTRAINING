package ust.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List list = Arrays.asList("one two three four five six one three four".split("  "));
System.out.println("List:" +list);
List sublist = Arrays.asList("three four".split("  "));
System.out.println("SubList:" + sublist);
System.out.println("IndexOfSubList:"+ Collections.indexOfSubList(list, sublist));
System.out.println("LastIndexOfSubList:" +Collections.lastIndexOfSubList(list, sublist));

	}

}
