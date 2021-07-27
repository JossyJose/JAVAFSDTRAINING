package ust.examples;
enum Operations{
	PLUS,
	MINUS,
	TIMES,
	DIVIDE;
	double calculate(int i,double y) {
		switch(this) {
		case PLUS:
			return i+y;
			
		case MINUS:
			return i-y;
			
		case TIMES:
			return i*y;
			
		case DIVIDE:
			return i/y;	
			default:
				throw new AssertionError("Unknown operations"+this);
			
		}
	}
}
public class Enum6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operations op=Operations.MINUS;
System.out.println(op.calculate(34, 67));

	}

}
