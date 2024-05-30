package myproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GetTitle {
WebDriver driver;
	
	@Test
	public void Title() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="Home Page";
		System.out.println("Title="+actualTitle);
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Pass");
        } 
		else {
            System.out.println("Fail");
        }

}
	 @AfterMethod
     public void Quit() {
    	driver.quit(); 
     }
}
