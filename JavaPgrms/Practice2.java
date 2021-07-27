package ust.examples;
//smallest number
public class Practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]=new int [] {2,34,56,35,59};
 int min=arr[0];
 
 
 for(int i=0;i<arr.length;i++) {
	 if(arr[i]<min)
		 min=arr[i];
 }
		
	
	System.out.println("the smallest element is=" + min);
	

	

		
		
		
	}

}
