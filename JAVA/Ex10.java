package ust.examples;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GenericsClass<Integer>intObj= new GenericsClass<>(5);
System.out.println("Generic Class returns:" + intObj.getData());
GenericsClass<String>StringObj = new GenericsClass<>("java programming");
System.out.println("Generic class returns :" + StringObj.getData());
	}

}
//create a genericclass
class GenericsClass<T>{
	//variable of t type
	private T data;
	public GenericsClass(T data) {
		this.data= data;
	}
	//method that returns t type variable
	public T getData() {
		return this.data;
	}
}