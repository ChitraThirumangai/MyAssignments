package week3.day2;

public class MyBankAccount {
	public static void main(String[] args) {

	System.out.println("Accessing methods in interface and implementation Class");	
	HDFC bankHDFC = new HDFC();
	bankHDFC.minimumBalance();
	bankHDFC.provideDebitCard();
	bankHDFC.provideCreditCard();
	
	System.out.println("\nScope Restriction of Object: Accessing methods from interface");
	RBI bankRBI = new HDFC();
	bankRBI.minimumBalance();
	bankRBI.provideDebitCard();
	}	
}
