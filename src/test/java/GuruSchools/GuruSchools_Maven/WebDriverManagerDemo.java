package GuruSchools.GuruSchools_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static WebDriver driver;
	
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
	/*	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_87\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
	//	WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	//	driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		FileInputStream fis = new FileInputStream("E:\\eclipse-workspace\\GuruSchools-July2021\\data.properties");
	//	WebDriver driver=null;
		Properties prop = new Properties();
		prop.load(fis);
		
	//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	

		//	driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.get(prop.getProperty("baseurl"));//enter the url
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String title=driver.getTitle();
		if(title.equals("OrangeHRM"))
		{
			System.out.println("Test case pass");
		}
		else
			System.out.println("Test case fail");
		//take the screen shot
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     Files.copy(src,new File("./screenshot/"+title+System.currentTimeMillis()+".jpeg"));
	     
	     Thread.sleep(3000);
		
	//	driver.close();
	}

}
