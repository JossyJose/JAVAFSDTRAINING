package ust.examples;
//credit card is a super class


public class Craditcard {
	protected  String cardName;//instance variable
	 private int expiryDate;
	private float creditBalance;
	
	void CraditCards(){
		cardName="abhinaya";
		expiryDate= 20-42-26;
		creditBalance=5000.0f;
	}
	
	 void checkCardBalance() {
	 
		 if(creditBalance>=40000)
		 {
			 System.out.println("Sufficient balance");
		 }else
		 {
			 System.out.println("not much");
		 }
	 } 
	 
    void makePayment() {
    	
    }
    //visa is a dub class
class Visa extends  Craditcard{
	float interestRate;
	float creditLimit;
	
//	Visa(String x, int y,float z){
		Visa(){
		super();
		
	}
	
}
	void checkDiscounts() {
		System.out.println("many discounts will be provided");
	}
}
   // master card is a subclass
class Mastercard extends Craditcard
{
	void checkPaymentOptions()
	{
		System.out.println("online payment mode is available");
	}

    
	public static void main(String[] args) {

	}	
		
	}


