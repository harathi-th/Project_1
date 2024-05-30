package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Men2 {
WebDriver driver;
	
	@Test
	public void Pages() throws InterruptedException
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
		WebElement pg=driver.findElement(By.xpath("//div[4]//div[3]//div[1]//select[1]"));
		Select Pages=new Select(pg);
		Pages.selectByVisibleText("24");

}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}