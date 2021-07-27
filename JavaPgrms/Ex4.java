package ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable ht= new Hashtable();
ht.put("1", "one");
ht.put("2", "two");
ht.put("3", "three");
Enumeration e = ht.keys();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}
	}

}
