package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) {
	//Setup a driver to start a browser.
		WebDriverManager.chromedriver().setup();
		
		//To launch a browser
		ChromeDriver driver = new ChromeDriver();
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
		
		//Click on Find Lead tab
		WebElement elementFindLead = driver.findElement(By.linkText("Find Leads"));
		elementFindLead.click();
		
		//Click on first resulting lead
		WebElement elementFirstLead = driver.findElement(By.linkText("Chitra K (Innova Solution…"));
		elementFirstLead.click();
		
		//Get the Title of Resulting Page.
		String getResultingTitle = driver.getTitle();
		System.out.println(getResultingTitle);
		
		//Click Edit
		WebElement elementClickEdit = driver.findElement(By.linkText("Edit"));
		elementClickEdit.click();
		
		//Change the company name
		WebElement elementUpdateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		elementUpdateCompanyName.clear();
		elementUpdateCompanyName.sendKeys("WellsFargos");
		
		//Click Update
		WebElement elementClickUpdate = driver.findElement(By.name("submitButton"));
		elementClickUpdate.click();
		
		//Confirm the changed name appears
		WebElement getCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
		String companyName = getCompanyName.getText();
		System.out.println(companyName);
		String updateCompanyName = "WellsFargos (10111)";
		if(companyName.equals(updateCompanyName)) 
			System.out.println("It is Perfect");
		else
			System.out.println("Not Perfect");
		
		//Close the browser.
		driver.close();
		
}
}
