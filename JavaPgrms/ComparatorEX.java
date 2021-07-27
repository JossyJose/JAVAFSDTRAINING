package ust.examples;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


import java.util.Iterator;
class Student6{
	int rollno;
	String name;
	int age;
	Student6(int rollno,String name,int age){
		this.rollno= rollno;
		this.name=name;
		this.age=age;
	}
}
	class NameComparator implements Comparator {
		public int compare(Object o1, Object o2) 
		
{
			Student6 s1=(Student6)o1;
			Student6 s2=(Student6)o2;
			return s1.name.compareTo(s2.name);
		}
	}
	
public class ComparatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al= new ArrayList();
al.add(new Student6(101,"abhi",22));
al.add(new Student6(104,"sanju",22));
al.add(new Student6(105,"jossy",22));

System.out.println("Sorting by name");
Collections.sort(al,new NameComparator());
Iterator itr = al.iterator();
while(itr.hasNext()) {
	Student6 st = (Student6)itr.next();
	System.out.println(st.rollno+" "+st.name+""+st.age);

	}

	}
}

