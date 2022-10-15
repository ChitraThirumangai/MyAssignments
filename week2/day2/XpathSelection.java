package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathSelection {
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
			WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
			elementUsername.sendKeys("demosalesmanager");
			
			//Enter the password.
			WebElement elementPassword = driver.findElement(By.xpath("//label[text()='Password']"));
			elementPassword.sendKeys("crmsfa");
			
			//click Login button.
			WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
}
}
