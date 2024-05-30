package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateAccount {
	 WebDriver driver;
		
		@Test
		public void AccountCreation() throws InterruptedException
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("firstname")).sendKeys("Harathiraj");
			driver.findElement(By.id("lastname")).sendKeys("Thippaluru");
			driver.findElement(By.name("email")).sendKeys("harathi1.thippaluru@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Harathi@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Harathi@123");
			driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).submit();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
			driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
		}


         @AfterMethod
         public void Quit() {
        	driver.quit(); 
         }
}     