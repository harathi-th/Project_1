package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class MyAccount {
	WebDriver driver;
	
	@Test
	public void LoginandManage() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
		driver.findElement(By.id("email")).sendKeys("harathi.thippaluru@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Jaisri@123");
		driver.findElement(By.xpath("//button[@id=\"send2\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
		driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='My Account']")).click();
        driver.findElement(By.linkText("Manage Addresses")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("company")).sendKeys("ABC");
        driver.findElement(By.id("telephone")).sendKeys("1234567890");
        driver.findElement(By.id("street_1")).sendKeys("Street1");
        driver.findElement(By.id("city")).sendKeys("Hyderabad");
        WebElement country= driver.findElement(By.id("country"));
        Select con=new Select(country);
        con.selectByVisibleText("India");
        
        WebElement region= driver.findElement(By.id("region_id"));
        Select rg=new Select(region);
        rg.selectByVisibleText("Telangana");
        driver.findElement(By.id("zip")).sendKeys("516360");
        driver.findElement(By.xpath("//button[@title='Save Address']")).click();
        
        
        
}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}
