package ust.examples;


class Base2{

	final void foo(int i) {
	System.out.println(i);
	}	
		
	}


class Child extends Base2{
void foo(int i, String s) {
	System.out.println(i+""+s);
	
}
	
}
	
	
public class Base11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj1 = new Child();
obj1 .foo(2);

obj1 .foo(10,"gfhg");
	}

}
