package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerDemo 
{
	
	@Test
	public void test1()
	{
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("I am inside Test 2");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("abc")).sendKeys("abcd");
		
		driver.close();
	}
	
	@Test
	public void test3()
	{
		System.out.println("I am inside Test 3");
		throw new SkipException("This test is skipped");
	}
	
}
