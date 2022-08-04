package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {



public static WebDriver driver;

public static void launchBrowser()
{

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\SOFTWAREs FOR TESTING\\Chrome Driver New\\chromedriver_win32\\chromedriver.exe");
	    
		
		driver = new ChromeDriver();
	     
		driver.manage().window().maximize();
		
		driver.get("https://groww.in/");
}




}
