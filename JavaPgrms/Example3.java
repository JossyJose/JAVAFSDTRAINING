package ust.examples;
//example of for loop
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] str= new String[5];
String[] str= {"abhinaya","sanju","gireesh","jossy","deepu"};

for(int i=0;i<=str.length;i++) {
	if(str[i].equals("jossy"))
		break;
		//continue;
	System.out.print(str[i]);
	
}
 
	}

}
