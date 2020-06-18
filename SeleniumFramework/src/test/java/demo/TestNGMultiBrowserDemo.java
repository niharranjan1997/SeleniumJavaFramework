package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo 
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) 
	{
		System.out.println("Browser name is : "+browserName);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void test1() throws Exception 
	{
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown() 
	{
		driver.close();
		System.out.println("Test Completed!!");
	}
}
