package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {
	public static void main(String[] args) {
		//Setup a driver to start a browser.
		WebDriverManager.chromedriver().setup();
		
		//Open a browser
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
		
		//Click on Create Lead Option
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		//Enter Company Name.
        WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
        elementCompanyName.sendKeys("Innova Solutions");
        
        //Enter First Name.
        WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
        elementFirstName.sendKeys("Chitra");
        
        //Enter Last Name
        WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
        elementLastName.sendKeys("K");
        
        //Click on Create Lead
        WebElement elementClickCreateLead = driver.findElement(By.className("smallSubmit"));
        elementClickCreateLead.click();
        
        //Get the Title of Resulting Page.
        String resultTitle=driver.getTitle();
        System.out.println("Result Page:" + resultTitle);
        
		//Close the browser.
		//driver.close();
	}

}
