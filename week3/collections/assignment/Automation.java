package week3.collections.assignment;

public class Automation {
public static void main(String[] args) {
	System.out.println("Accessing methods in interface and implementation Class:");
	MultipleLanguage allLanguage = new MultipleLanguage();
	allLanguage.python();
	allLanguage.java();
	allLanguage.javaScript();
	allLanguage.ruby();
	allLanguage.selenium();
	
	Language fewLanguage = new MultipleLanguage();
	System.out.println("\nScope Restriction of Object: Accessing methods from Language interface:");
	fewLanguage.ruby();
	fewLanguage.java();
	fewLanguage.javaScript();
	
	TestTool seleniumLanguage = new MultipleLanguage();
	System.out.println("\nScope Restriction of Object: Accessing methods from TestTool interface:");
	seleniumLanguage.selenium();
}
}
