package ust.examples;
//local inner 2
public class Example41 {
private int data = 30;
void display() {
	int value= 50;
	class Local{
		void msg() {System.out.println(value);
	}
	}
	Local l = new Local();
	l.msg();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example41 obj = new Example41();
		obj.display();
	}

}
