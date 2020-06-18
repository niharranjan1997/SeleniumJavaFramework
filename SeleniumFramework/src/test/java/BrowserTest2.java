import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest2 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		
		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("Count of Input elements : "+count);
		//WebElement textBox = driver.findElement(By.name("q"));
		//textBox.sendKeys("Automation step by step");
		driver.close();
	}
}
