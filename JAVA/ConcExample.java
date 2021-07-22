package ust.examples;

public class ConcExample {
int x ;
private ConcExample(int y) {
	x=y;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcExample obj=new ConcExample(5);
		System.out.println(obj.x);
	}

}
