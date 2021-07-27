package ust.examples;
//copy constructor
public class Example23 {
	String web;
	Example23(String w){
		web=w;
	}
Example23(Example23 cc){
web=cc.web;
}
void disp() {
	System.out.println("Constructor:"+web);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example23 obj1= new Example23("Example of copy constructor in java");
		
		Example23 obj2= new Example23(obj1);
		obj1.disp();
		obj1.disp();
	}

}
