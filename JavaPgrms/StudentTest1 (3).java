package ust.examples;
class StudentNotFoundException extends Exception {
	public StudentNotFoundException(String message) {
		super(message);
	}
}
class student11{
	 student11(){
}
}
class StudentManager11{
	public student11 find(String studentID) throws StudentNotFoundException{
		if(studentID.equals("123456")) {
			return (student11) new student11();
		}
		else {
			throw new StudentNotFoundException("could not find student with id" +studentID);
		}
		}
	}
public class StudentTest1 {
	public static void main(String[] args) {
	StudentManager11 manager= new StudentManager11();
	try {
		student11 student=manager.find("0000001");
	}
	catch(StudentNotFoundException ex) {
		System.err.print(ex);
		
	}

}
}
