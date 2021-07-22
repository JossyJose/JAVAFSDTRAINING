package ust.examples;
//method local inner class
public class Example36 {
	String sdName;
	int sdId;

	void outerMethod() {
	System.out.println("inside outerMethod");
	//inner class is local to outerMethod()
	class Inner{
		void innerMethod() {
			System.out.println("inside outerMethod");	
		}
	}
	Inner y = new Inner();
	y.innerMethod();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example36 outer = new Example36();
		outer.outerMethod();
	}

}
