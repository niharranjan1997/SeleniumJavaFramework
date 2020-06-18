package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile
{
	private static Properties prop = new Properties();
	
	public static void main(String[] args) 
	{
		getProperties();
		setProperties();
		getProperties();
	}
	
	public static void getProperties() 
	{	
		try 
		{
			InputStream input = new FileInputStream("C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName = browser;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void setProperties() 
	{
		try 
		{
			OutputStream output = new FileOutputStream("C:\\Users\\nihar\\Desktop\\SeleniumTest\\SeleniumFramework\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, null);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
