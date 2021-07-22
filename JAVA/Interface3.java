package ust.examples;
class Student1{
	int roll;
	void getData(int p){
		roll=p;
	}
	void display(){
		System.out.println("roll no is : " +roll);
	}
}

class Test2 extends Student1{
	double p1,p2;
	void PutMarks(double x, double y) {
		p1=x;
		this.p2=y;
	}
	void ShowMarks(){
		System.out.println("test 1 =" +p1);
		System.out.println("test 2 = " +p1);
	}
}

interface Sports{
	double weight=50.0;
	void ShowWeight();
	
}
class Results extends Test2 implements Sports{
	double total;
	public void ShowWeight(){
		System.out.println("Weight="+weight);
	}
		void DisplayAll(){
			total=p1+p2+weight;
			display();
			ShowMarks();
			ShowWeight();
			System.out.println("The total is :"+total);
		
	}
}

public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Results res = new Results();
res.getData(101);
res.PutMarks(55.5, 77.4);
res.DisplayAll();
	}
	

}
