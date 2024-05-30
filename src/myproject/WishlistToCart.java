package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WishlistToCart {
WebDriver driver;
	
	@Test
	public void AddingAllToCartFromWishlist() throws InterruptedException
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
		driver.findElement(By.xpath("//div[@aria-hidden='false']//ul[@class='header links']//li[@class='link wishlist']//a[@href='https://magento.softwaretestingboard.com/wishlist/']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add All to Cart']")).click();

}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}