package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOption {
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	//Load Url in the browser.
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			//Maximize the browser.
			driver.manage().window().maximize();
			
			//Enter the Username.
			WebElement elementUsername = driver.findElement(By.id("username"));
			elementUsername.sendKeys("demosalesmanager");
			
			//Enter the password.
			WebElement elementPassword = driver.findElement(By.id("password"));
			elementPassword.sendKeys("crmsfa");
			
			//click Login button.
			WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
			
			//Click on CRM/SFA link
			WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFA.click();
			
			//click on Leads tab.
			WebElement elementLeads = driver.findElement(By.linkText("Leads"));
			elementLeads.click();
			
			//Implicitly Wait
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			//Click on Create Lead Option
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			
			//Select "Employee" from Source dropdown using VisibleText
			WebElement elementSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//Create an Object for Select Class and pass webelement elementSource as arg in Class
			Select source = new Select(elementSource);
			//select the option from sropdown using VisibleText
			source.selectByVisibleText("Employee");
			
			//Select "Finance" from Industry dropdown using Value
			WebElement elementIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
			//Create an Object for Select Class and pass webelement elementIndustry as arg in Class
			Select industry = new Select(elementIndustry);
			//select the option from sropdown using VisibleText
			industry.selectByValue("IND_FINANCE");
			
			//Select "Corporation" from Ownership dropdown using Index
			WebElement elementOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			//Create an Object for Select Class and pass webelement elementOwnership as arg in Class
			Select ownership = new Select(elementOwnership);
			//select the option from sropdown using VisibleText
			ownership.selectByIndex(5);
			
			
	
}
}
