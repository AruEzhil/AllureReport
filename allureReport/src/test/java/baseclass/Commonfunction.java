package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonfunction {
	
	public  static Properties properties=null;
	public static WebDriver driver=null;
	
	public Properties propertyfile() throws IOException {
		FileInputStream file=new FileInputStream("config.properties");
		 properties=new Properties();
		properties.load(file);
		return properties;
		
	}
	@BeforeSuite
	public void launchbrowser() throws IOException {
		propertyfile();
		String Browser=properties.getProperty("browser");
		String URL=properties.getProperty("url");
		
		if(Browser.equalsIgnoreCase("chrome")) 
		{
			
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   
		}else if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			   driver=new FirefoxDriver();
			   
		}
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	@AfterSuite
	public void teardown() {
		
	}

}
