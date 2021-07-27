package ust.examples;

 abstract class Employees {
private String name;
private int payEmployHr;

void display() {
	System.out.println("name is " + name+ "\n" +"Employee hour is " + payEmployHr);
}

public Employees() {


}
public Employees(String name,int payEmployHr) {
	this.name=name;
	this.payEmployHr=payEmployHr;
		
}

	//}

public void setName(String name) {
	this.name=name;
}

public String getName() {
	return name;
}

public void setpayEmployHr(int payEmployHr) {
 this.payEmployHr= payEmployHr;

}


 public int getEmployHr() {
	 return payEmployHr;
	 
 }
 abstract void salary(int x, int y );
}
 
 public class Employee extends Employees{
	Employee(){
		super();
	}
 
	Employee(String name,int payEmployHr){
 super(name,payEmployHr);
	}
	
	void salary(int days, int totalsal) {
		if((totalsal/days)>500) {
		System.out.println("the pay is good");
	}
	
		else {
			System.out.println("the pay is not good");
		}
	
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1 = new Employee("abhinaya",20);
    e1.display();
    Employee e2 = new Employee();
    System.out.println(e2.getName());
    e2.salary(10,10000);
		
	}

}
