package week1.day2;

public class Car {
	public static void main(String[] args) {
		
		//Create new object for a Car Class
		Car obj = new Car();
		
		//Access all methods defined in Car Class
		//Create a variable to store the output of addThreeNumbers public Method.
		  int sum = obj.addThreeNumbers(600, 90, 3);
		  System.out.println("Addition of Three Numbers: "+ sum);
		
		//Create a variable to store the output of subTwoNumbers private Method.
		  int sub = obj.subTwoNumbers(60,40);
		  System.out.println("Subtraction of Two Numbers: "+ sub);
		  
		//Create a variable to store the output of multiplyThreeNumbers default Method.
		  float multiply = obj.multiplyThreeNumbers(60.09f,40.87f,16.09f);
		  System.out.println("Multiplication of Three float Numbers: "+ multiply);  
		
	}
	//Method to Print Car Name.
	public void printCarName() {
		System.out.println("Honda WR-V");
	}
	
	//Method to get Car Registration Number.
		public short getCarRegNumber() {
		short carRegNumber = 9492;
		return carRegNumber;
	}
	
	//Method to get Car Color.
		public String getCarColor() {
			String carColor = "White";
			return carColor;
		}
		
	//Method to find whether car is puncture or not.
		public boolean isCarPuncture() {
			return false;
		}
		
	//Method to add three Integer Numbers.
		public int addThreeNumbers(int num1,int num2,int num3) {
			int sum = num1+num2+num3;
			return sum;
		}
		
	//Method to subtract two Integer numbers
		private int subTwoNumbers(int number1,int number2) {
			int sub = number1-number2;
			return sub;
		}
	
	//Method to Multiply Three Decimal Numbers.
		   float multiplyThreeNumbers(float num1,float num2,float num3) {
			float multiply = num1*num2*num3;
			return multiply;
		}
		
	//Method to Divide two Integer numbers.
		public int divTwoNumbers(int number1,int number2) {
			int div = number1/number2;
			return div;
		}
}
