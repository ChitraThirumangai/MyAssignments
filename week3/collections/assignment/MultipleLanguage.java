package week3.collections.assignment;

public class MultipleLanguage implements Language,TestTool{

	public void selenium() {
		System.out.println(" Selenium is a open source tool that automates web  browsers. "
				+ "It provides a single interface that lets you write scripts in diff programming lang.");
		
	}

	public void java() {
		System.out.println("Java is a Highlevel Programming Language. "
				+ "Java code can run on any machine that has JVM.");
		
	}

	public void javaScript() {
		System.out.println("JavaScript is a Programming Language of web. "
				+ "	It is a lightweight interpreted programming language.");
		
	}

	public void ruby() {
		System.out.println("Ruby is a intrepreted, high-level programming "
				+ "Language which supports multiple programming paradigms. In ruby everything is "
				+ "	an object including primitive data types.");
		
	}
	
	public void python() {
		System.out.println("Python is commonly used for developing websites and software,task automation, data analysis and "
				+ "data visualisation.");
	}

}
