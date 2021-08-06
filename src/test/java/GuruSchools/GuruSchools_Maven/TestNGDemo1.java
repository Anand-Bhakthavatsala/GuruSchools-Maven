package GuruSchools.GuruSchools_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGDemo1 {
	WebDriver driver=null;
	
	@Test (priority=0) //Annotation in TestNG
	public void zmavenRepository() //a-z
	{
		driver.get("https://mvnrepository.com/");		
		System.out.println(driver.getTitle());		
	}
	
	@Test //Annotation in TestNG
	public void google()
	{
		driver.get("https://google.com/");		
		System.out.println(driver.getTitle());
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Google", actualTitle);
		System.out.println("Test pass");
	}
	
	@BeforeTest //BeforeMethod is another annotation in TestNG
	public void browser()
	{
		/*WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();*/
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void close() throws InterruptedException
	{
		//Thread.sleep(2000);
		driver.close();
	}
}
