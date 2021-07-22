package ust.examples;
class Example14 {
	int id;
	String name;
	float salary;
	void insert(int i, String n , float s) {
		id=i;
		name=n;
		salary=s;
	}
	void display() {System.out.println(id+ "  " +name+"  " +salary);}
}
public class Testemploye {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Example14 e1 = new Example14();
		Example14 e2 = new Example14();
		Example14 e3 = new Example14();
		Example14 e4 = new Example14();
		Example14 e5 = new Example14();


		e1.insert(101, "abhinaya", 45000);
		e2.insert(102, "sanju", 45000);
		e3.insert(103, "jossy", 45000);
		e4.insert(104, "Giri", 45000);
		e5.insert(105, "benny", 45000);



		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
			
	}

}
