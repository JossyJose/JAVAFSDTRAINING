package ust.examples;

class Base {

	final void display(){
		System.out.println("Base method called");
	}
}
class Derived extends Base{
	
	//void display()//cannot be called
		{
		System.out.println("Base method called ");
	}
	}


 class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		d.display();
		
		

	}

}
