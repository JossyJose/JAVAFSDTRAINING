package ust.examples;

//parameterized constructor
class Student
{
String name;
int id;
Student(String name, int id)
{
	this.name=name;
	this.id=id;
}
}
public class Example24 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student std1 = new Student("abhinaya",101);
System.out.println("student Name:"+std1.name + "and student id:"+std1.id);
	}

}
