package myproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class EditAndDelete2 {
WebDriver driver;
	
	@Test
	public void Delete() throws InterruptedException
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
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
        driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[3]//div[2]//a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[normalize-space()='OK']")).click();

}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}