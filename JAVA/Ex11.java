package ust.examples;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DemoClass1 demo = new DemoClass1();
//generics method working with string
demo.<String>genericsMethod("java programming");
demo.<Integer>genericsMethod(25);

	}

}
class DemoClass1{
	public<T>void genericsMethod(T data){
		System.out.println("GenericsMethod:");
		System.out.println("Data passed :" +data);
	}
}