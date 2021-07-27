package ust.examples;


	abstract class Sum {
		
		public abstract int sumOfTwo(int n1,int n2);
		public abstract int sumOfTHree(int n1,int n2,int n3);
		
		
		public void disp() {
			System.out.println("Method of class sum");
		}
		}
	
	public class Demo extends Sum{
			
			public int sumOfTwo(int num1,int num2) {
				return num1=num2;
			}
			public int sumOfTHree(int num1, int num2, int num3) {
				return num1 + num2+num3;
			}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum obj=new Demo();
		
		System.out.println(obj.sumOfTwo(3,7));
		System.out.println(obj.sumOfTHree(4,3,19));
		obj.disp();
		
		
		
		
		
		
	}

}
