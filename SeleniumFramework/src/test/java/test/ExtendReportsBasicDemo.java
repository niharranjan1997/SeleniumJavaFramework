package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportsBasicDemo 
{
	private static WebDriver driver;
	
	public static void main(String[] args) 
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google search Test One","This is a test to validate google search functionality");
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered text in Searchbox");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test1.pass("Pressed Keyboard Enter Key");
		
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		
		test1.info("Test Completed!!!!");
		
		
		
		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google search Test Two","This is a test to validate google search functionality");
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test2.log(Status.INFO, "Starting Test Case");
		driver.get("https://www.google.com/");
		test2.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test2.pass("Entered text in Searchbox");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test2.fail("Pressed Keyboard Enter Key");
		
		driver.close();
		driver.quit();
		test2.pass("Close the browser");
		
		test2.info("Test Completed!!!!");
		
		// calling flush writes everything to the log file
        extent.flush();
	}

}
