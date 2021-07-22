package ust.examples;
//local inner
public class Example40 {
private int data=30;
void display() {
	class Local{
		void msg() {System.out.println(data);
	}
	}

Local l = new Local();
l.msg();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Example40  obj = new  Example40();
		 obj.display();
	

}
}