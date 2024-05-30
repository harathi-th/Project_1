package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Women {
WebDriver driver;
	
	@Test
	public void AddingTopstoCart() throws InterruptedException
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
		driver.findElement(By.id("search")).sendKeys("Tops");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://magento.softwaretestingboard.com/");
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Radiant Tee']")).click();
		driver.findElement(By.id("option-label-size-143-item-167")).click();
		driver.findElement(By.id("option-label-color-93-item-56")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
		
		

}
	@AfterMethod
    public void Quit() {
   	driver.quit(); 
    }
}
