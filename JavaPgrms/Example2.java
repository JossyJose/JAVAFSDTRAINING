package ust.examples;
//depicting on the nested if condition
public class Example2 {
float price;
String item;
	public static void main(String[] args) {
		// TODO Auto-generated me
		Example2 e1= new Example2();
		Example2 e2= new Example2();
		
		
		e1.price=1.2f;
		e2.price=25f;
		e1.item="pen";
		e2.item="book";
		
		if(e1.price > e2.price) {
			e1.item="scale";
			
		}
		if(e1.price < e2.price) {
			e1.item="pencil";
		}
		else if(e1.price==e2.price) {
			e1.item="box";
		}
		System.out.println(e1.item);
	}

}
