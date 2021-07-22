package ust.examples;
//method local inner class
public class Example38 {
void outerMethod() {
	System.out.println("Inside outerMethod");
	//inner class is local to outerMethod()
class Inner {
	void innerMethod(){
		System.out.println("Inside innerMethod");	
		
	}
}
Inner y = new Inner();
y.innerMethod();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example38 outer= new Example38();
		outer.outerMethod();
	}

}
