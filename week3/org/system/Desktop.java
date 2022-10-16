package week3.org.system;

//Inherits Computer Class.Single Inheritance
public class Desktop extends Computer {
	
	// Create desktopSize() method
	public void desktopSize() {
		int desktopsize = 14;
		System.out.println("Desktop Size :" + desktopsize + "inch");
	}

	public static void main(String[] args) {
		Desktop desktopModel = new Desktop();
		desktopModel.computerModel();
		desktopModel.desktopSize();
	}
}
