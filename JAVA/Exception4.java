package ust.examples;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int arr[]= {1,2,3,4,5};
	System.out.println(arr[7]);
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("the specified index does not exist" + "in array.Please correct the error.");
}
	}

}
