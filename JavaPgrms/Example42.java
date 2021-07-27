package ust.examples;

public class Example42 {
	private void getValue() {
		int sum = 20;
		class Inner
		{
			public int divisor;
			public int remainder;
			public Inner()
			{
				divisor=4;
				remainder=sum%divisor;
			}
			public int getDivisor() {
				return divisor;
			}
			
			public int getRemainder() {
				return remainder;
			}
			private int getQuotient()
			{
				System.out.println("Inner inner class");
				return sum/divisor;
			}
		}
		Inner inner = new Inner();
		System.out.println("Divisor="+ inner.getDivisor());
		System.out.println("Remainder="+ inner.getRemainder());
		System.out.println("Quotient="+ inner.getQuotient());
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example42 outer = new Example42 ();
		outer.getValue();
	}

}
