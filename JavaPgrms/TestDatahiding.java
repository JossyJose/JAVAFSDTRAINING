package ust.examples;
// encapsulation

class TestData{
	private String name;
	private int age;
	float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

public class TestDatahiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestData t = new TestData();
	
		t.setName("abhinaya");
		t.setAge(22);
		t.setSalary(12000.0f);
		
		System.out.println(t.getName()+""+t.getAge()+""+t.getSalary());
		
	}

}
