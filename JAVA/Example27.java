package ust.examples;

 class Bank {
private int accountNo;
private String accountName;
private float accountBalance;

void printBankdetails(){
	System.out.println(accountNo+"\n" +accountName+"\n"+accountBalance);
}

void insertBankData(int x, String y, float z) {
	accountNo= x;
	accountName=y;
	accountBalance=z;
}
 }
 class Example27{

	public static void main(String[] args) {
	
		Bank e1= new Bank();
		e1.insertBankData(1001,"abhinaya",2000.0f);
		e1. printBankdetails();
		
	}

}
