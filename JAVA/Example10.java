package ust.examples;
/*
 * Arrays
 */
public class Example10 {
	public static void displayArray(int a[] ) {
		
		// for(int i : a) {
   		//  System.out.println(a[i]);
		
	}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // int array[]= new int[5];
   // array[0]=1;
    		//  array[1]=2;
    		//  array[2]=3;
    		//  array[3]=4;
    		//  array[4]=5;
    		 int array[]= {1,2,3,4,5};
    		 
    		//  for(i=0;i<array.length;i++);
    		 for(int i : array) {
    		  System.out.println(i);
	}

    		 displayArray(new int [] {1,2,3,4});
}
}