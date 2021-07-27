package ust.examples;
//nested inner class eg
public class Example37 {
class Inner{
	public void show() {
		System.out.println("in a nested class method");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example37.Inner in = new Example37().new Inner();
		in.show();

	}

}
