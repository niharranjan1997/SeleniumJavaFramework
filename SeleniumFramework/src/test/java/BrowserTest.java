import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\drivers\\iedriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		driver.close();
		//driver.quit();
	}
}
