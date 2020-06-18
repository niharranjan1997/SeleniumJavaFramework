package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo 
{
	public static void main(String[] args) throws Exception 
	{
		test();
	}
	public static void test() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		
		driver.findElement(By.className("pole_plik")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\nihar\\Desktop\\SeleniumTest\\FileUploadScript.exe");
		
		Thread.sleep(3000);
		driver.close();
	}
}
