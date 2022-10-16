package week3.Assignments;

//Method Overriding.
public class AxisBank extends BankInfo {

	// Create a method deposit().
	public void deposit() {
		System.out.println("This is an Axis Bank deposit");

		// to call the method in BankInfo(Parent) Class.
		super.deposit();

	}

	public static void main(String[] args) {
		AxisBank bankAccount = new AxisBank();
		bankAccount.deposit();
	}
}
