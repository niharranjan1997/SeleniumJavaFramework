import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Demo
{
	public static void main(String[] args) 
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\iedriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}
}
