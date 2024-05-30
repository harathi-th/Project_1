package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MensShop {
WebDriver driver;
	
	@Test
	public void ShopTees() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@id='ui-id-5']")).click();
		driver.findElement(By.xpath("//a[@class='block-promo mens-t-shirts']//span[@class='more icon'][normalize-space()='Shop Tees']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='Strike Endurance Tee']")).click();
        driver.findElement(By.id("option-label-size-143-item-167")).click();
        driver.findElement(By.id("option-label-color-93-item-49")).click();
        driver.findElement(By.xpath("//a[@class='action towishlist']")).click();
        
        
}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}
