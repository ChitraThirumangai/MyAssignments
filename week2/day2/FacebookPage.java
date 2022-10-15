package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookPage {
 public static void main(String[] args) {
	//Setup WebDriver Manager to start the browser.
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 
	//Load Facebook Url in the browser.
	 driver.get("https://en-gb.facebook.com/");
	 
	 //Maximize the Webpage.
	 driver.manage().window().maximize();
	 
	 //Implicitly Wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 //Click Create Account
	 WebElement elementCreateNewAccount = driver.findElement(By.linkText("Create New Account"));
	 elementCreateNewAccount.click();
	 
	 //Enter First name
	 WebElement elementFirstName = driver.findElement(By.name("firstname"));
	 elementFirstName.sendKeys("Chitra");
	 
	 //Enter Last Name
	 WebElement elementLastName = driver.findElement(By.name("lastname"));
	 elementLastName.sendKeys("Kannan");
	 
	 //Enter Mobile Number.
	 WebElement elementMobileNumber = driver.findElement(By.name("reg_email__"));
	 elementMobileNumber.sendKeys("9087646783");
	 
	 //Enter the password.
	 WebElement elementPassword = driver.findElement(By.id("password_step_input"));
	 elementPassword.sendKeys("hellochitu");
	 
	 //Handle all the three drop downs.
	 WebElement elementDay = driver.findElement(By.id("day"));
	 Select day = new Select(elementDay);
	 day.selectByVisibleText("13");
	 
	 WebElement elementMonth = driver.findElement(By.name("birthday_month"));
	 Select month = new Select(elementMonth);
	 month.selectByValue("5");
	 
	 WebElement elementYear = driver.findElement(By.id("year"));
	 Select year = new Select(elementYear);
	 year.selectByIndex(35);
	 
	 //Select the radio button "Female"
	 WebElement elementGender = driver.findElement(By.name("sex"));
	 elementGender.click();
	 
}
}
