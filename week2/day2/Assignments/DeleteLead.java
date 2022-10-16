package week2.day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) {
		// Setup a driver to start a browser.
		WebDriverManager.chromedriver().setup();

		// To launch a browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser.
		driver.manage().window().maximize();

		// Enter the Username.
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("demosalesmanager");

		// Enter the password.
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");

		// click Login button.
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();

		// Click on CRM/SFA link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();

		// click on Leads tab.
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();

		// Click on Find Lead tab
		WebElement elementFindLead = driver.findElement(By.linkText("Find Leads"));
		elementFindLead.click();

		// Click on Phone Number
		WebElement elementFirstLead = driver.findElement(By.xpath("//span[text()='Phone']"));
		elementFirstLead.click();
		
		WebElement elementPhoneCountryCode = driver.findElement(By.name("phoneCountryCode"));
		elementPhoneCountryCode.clear();
		elementPhoneCountryCode.sendKeys("5");
				
		WebElement elementPhoneAreaCode = driver.findElement(By.name("phoneAreaCode"));
		elementPhoneAreaCode.sendKeys("123");
		
		WebElement elementPhoneNumber = driver.findElement(By.name("phoneNumber"));
		elementPhoneNumber.sendKeys("9566688250");
				
		// Click on Find Lead tab
		WebElement elementClickFindLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		elementClickFindLeads.click();
		
		// Capture lead ID of First Resulting lead
		WebElement elementCaptureFirstResultingLead = driver.findElement(By.linkText("createLeadForm_firstName …"));
		String firstLeadId = elementCaptureFirstResultingLead.getAttribute("linkText");
		System.out.println("First Lead Id: "+ firstLeadId);

		// Get the Title of Resulting Page.
		String getResultingTitle = driver.getTitle();
		System.out.println(getResultingTitle);

		// Click Delete
		WebElement elementClickDelete = driver.findElement(By.linkText("Delete"));
		elementClickDelete.click();
		
		//Click Find leads tab
		elementFindLead.click();
		
		//Enter captured lead ID
		WebElement elementEnterLeadId = driver.findElement(By.xpath("//input[@name='id']"));
		elementEnterLeadId.sendKeys(firstLeadId);
		
		//Click find leads button
		elementClickFindLeads.click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement getMessage = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String getDisplayMessage = getMessage.getAttribute("value");
		System.out.println(getDisplayMessage);
		
		// Close the browser.
		driver.close();
	}
}
