package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Sort {
WebDriver driver;
	
	@Test
	public void SortBySize() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Tops')]")).click();
		Thread.sleep(1000);
	    WebElement st=driver.findElement(By.id("sorter"));
	    Select srt=new Select(st);
	    srt.selectByVisibleText("Price");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='column main']//div[2]//div[4]//a[1]")).click();

}
	@AfterMethod
    public void Quit() {
   	driver.quit(); 
    }
}