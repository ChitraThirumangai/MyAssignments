package week2.day2.leafgroundAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInput {
 public static void main(String[] args) {
	//Setup a driver to start a browser.
		WebDriverManager.chromedriver().setup();
		
		//To launch a browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		//Maximize the browser.
		driver.manage().window().maximize();
        
		//Enter the Name.
		WebElement elementName = driver.findElement(By.xpath("//input[@id='j_idt88:name']"));
		elementName.sendKeys("Chitra");
 
		//Append Country to this City.
		WebElement elementCountry = driver.findElement(By.xpath("//input[@value='Chennai']"));
		elementCountry.sendKeys("India");
		
		//Verify if text box is disabled
		WebElement elementIsTextBoxDisabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
		boolean isTextboxEnabled = elementIsTextBoxDisabled.isEnabled();
		if(isTextboxEnabled == false)
			System.out.println("Text Box is disabled");
			
		//Clear the typed text.
		WebElement elementClearText = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']"));
		elementClearText.clear();
		
		//Retrieve the typed text.
		WebElement elementRetrieveText = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']"));
		String retrieveText = elementRetrieveText.getAttribute("value");
		System.out.println("Retrieved text is "+ retrieveText);
		
		//Type email and Tab. Confirm control moved to next element.
		WebElement elementEmail = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']"));
		elementEmail.sendKeys("chitra@gmail.com"+"\t");
		
		/*//Type email and Tab. Confirm control moved to next element.
		WebElement elementAboutYourself = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt101']"));
		elementAboutYourself.sendKeys("I am Chitra. I am learning Selenium/Java in Testleaf. Thank You!");
		
		WebElement elementTextEditor = driver.findElement(By.xpath("//class[contains(text(),'ql-editor ql-blank')]"));
		elementTextEditor.sendKeys("I am Chitra. I am learning Selenium/Java in Testleaf. Thank You!");*/
		
		WebElement elementPressEnter = driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']"));
		elementPressEnter.sendKeys("\n");
		
 }
}
