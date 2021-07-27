package ust.examples;
interface Emp1
{
	int eid= 2101;
	void geteid();
	
}


public class Example44 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp1 obj = new Emp1() {
			public void geteid()
			{
				System.out.println("Employee id is " +eid);
			}
		
		};
	
		obj.geteid();
	}

}
