package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo 
{
	public static void main(String[] args) 
	{
		seleniumWaits();
	}
	public static void seleniumWaits() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//250 ms
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By. name("abcdef")));
		
		driver.findElement(By.name("abcd")).click();
		
		driver.close();
		driver.quit();
	}
}
