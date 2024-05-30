package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MenFilters {
WebDriver driver;
	
	@Test
	public void FilteringMensBottoms() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Bottoms')]")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Style']")).click();
		driver.findElement(By.xpath("//div[@class='block-content filter-content']//div[2]//div[2]//ol[1]//li[6]//a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Size']")).click();
		driver.findElement(By.xpath("//a[@aria-label='32']//div[contains(@class,'swatch-option text')][normalize-space()='32']")).click();
		

}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}
