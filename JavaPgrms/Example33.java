package ust.examples;
/*
 * 
 * example of typr onr inner class
 * 
 * 
 *
 */
public class Example33 {
 int x = 5;
void display() {
	System.out.println( "outer class ");
}
  private class Inner{
	 int y;
	  Inner( int y){
	  this.y=y;
	  }
		void display(){
			System.out.println( "Example of inner class ");
		}
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Example33.Inner e1 = new 	Example33().new Inner(6);
		e1.display();
		Example33 e2  =new Example33();
		e2.display();
		e2.x=5;
	
		System.out.println( "e2.x ");
		e1.display();
		
	}

}
