package ust.examples;

interface Emp
{
	int eid= 2101;
	void geteid();
	
}
class ImplClass implements Emp
{
	public void geteid()
	{
		System.out.println("Employee id is " +eid);
	}
}
public class Example43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ImplClass obj= new ImplClass();
obj.geteid();
	}

}
