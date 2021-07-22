package ust.examples;
//methods
//method overloading
public class Example8 {
	int x;
	int y;
	int calculate(int a,int b) {
		return a+b;
	}
	float calculate(float a,float b) {
		return a+b;
	}
//a,b arr parameters
	
	String calculate(String a , String b) {
		return a+b;
	}
  void calculate(String a ) {
		
	}
  {
	  int z = 5;//block
	  System.out.println("z=" + z);
  }
 int z=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Example8 e = new Example8() ;
			
		
	String o= e.calculate("Hello " ," World");
int m = e.calculate(5,6);
float n = e.calculate(5.5f,6.6f);

System.out.println(m);
System.out.println(n);
System.out.println(o);
		}
}
	

	


