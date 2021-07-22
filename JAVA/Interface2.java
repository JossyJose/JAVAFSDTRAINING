package ust.examples;
interface Firstinterface{
	public void myMethod();
}

interface Secondinterface{
public void myOtherMethod();
}
class DemoClass implements Firstinterface,Secondinterface{
	public void myMethod() {
		System.out.println("some text..");
	}
	public void myOtherMethod() {
		System.out.println("some other text..");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoClass myobj = new DemoClass();
myobj.myMethod();
myobj.myOtherMethod();
	}

}
