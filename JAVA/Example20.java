package ust.examples;
//constructor
public class Example20 {
int x;
float y;
String z;

Example20(){}


Example20(int x, float y){
this.x=x;
this.y=y;
}
Example20(int a,float b, String c){
	
	this(a,b);
//x=a;
//y=b;
z=c;
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example20 e1= new Example20();
System.out.println(e1.x);

Example20 e2= new Example20(2,3.0f);
System.out.println(e2.y);	

Example20 e3= new Example20(3,4.4f,"abhinaya");
System.out.println(e3.z);

	}

}
