package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditAccount {
WebDriver driver;
	
	@Test
	public void EditEmailandPassword() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("email")).sendKeys("harathi1.thippaluru@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Harathi@123");
		driver.findElement(By.xpath("//button[@id=\"send2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='My Account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Account Information")).click();
		driver.findElement(By.id("change-email")).click();
		driver.findElement(By.id("change-password")).click();
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("harathi2.thippaluru@gmail.com");
		driver.findElement(By.id("current-password")).sendKeys("Harathi@123");
		driver.findElement(By.id("password")).sendKeys("Harathi@456");
		driver.findElement(By.id("password-confirmation")).sendKeys("Harathi@456");
		driver.findElement(By.xpath("//button[@title='Save']")).click();
		
}      
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}