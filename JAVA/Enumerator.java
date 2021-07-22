package ust.examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class Enumerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Enumeration names;
String key;
Hashtable<String,String>hashtable=new Hashtable<String,String>();
hashtable.put("key1","abhinaya");
hashtable.put("key2","abhi");
hashtable.put("key3","asdrfg");
hashtable.put("key4","nhjt");
hashtable.put("key5","hghd");
names=hashtable.keys();
while(names.hasMoreElements()) {
	key= (String) names.nextElement();
	System.out.println("key:" +key+"& Value:"+ hashtable.get(key));

	}

}
}