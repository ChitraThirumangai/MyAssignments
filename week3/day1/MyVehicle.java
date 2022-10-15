package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// Vehicle Class object
		Vehicle myVehicle = new Vehicle();
		System.out.println("My Vehicle");
		myVehicle.applyBrake();
		myVehicle.soundHorn();

		// Car Class object
		Car myCar = new Car();
		System.out.println("\n My Car");
		myCar.applyBrake();
		myCar.soundHorn();
		myCar.openSunRoof();
		myCar.turnOnAC();

		// BMW Class object
		BMW bmw320d = new BMW();
		System.out.println("\n My BMW");
		bmw320d.applyBrake();
		bmw320d.soundHorn();
		bmw320d.openSunRoof();
		bmw320d.turnOnAC();
		bmw320d.autoPark();

		// Audi Class object
		Audi audiA4 = new Audi();
		System.out.println("\n My Audi");
		audiA4.brake();
		audiA4.applyBrake();
		audiA4.soundHorn();
		audiA4.openSunRoof();
		audiA4.turnOnAC();
		audiA4.hybridFuel();
		

		// Auto Class object
		Auto ape = new Auto();
		System.out.println("\n My Auto");
		ape.applyBrake();
		ape.soundHorn();
		ape.handStart();

		// Bajaj Class object
		Bajaj bajajRE = new Bajaj();
		System.out.println("\n My Bajaj");
		bajajRE.applyBrake();
		bajajRE.soundHorn();
		bajajRE.handStart();

	}
}
