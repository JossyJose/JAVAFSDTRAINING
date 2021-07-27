package ust.examples;
//print odd and even numbers
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("odd numbers");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2!=0) {
		
	System.out.println(num[i]);
		
			}

}

		System.out.println("even numbers");
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0){
				System.out.println(num[i]);
			}
		}
	}
	
	
	
	
}