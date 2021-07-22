package ust.examples;


interface Polygon{
	void getArea(int length , int breath);
}
class Rectangle implements Polygon{
	public void getArea(int length,int breath) {
		System.out.println("the area of the Rectangle is " +(length*breath));
		
	}
	

	}
public class Interface5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r1 = new Rectangle();
r1.getArea(5, 6);



	}
}

