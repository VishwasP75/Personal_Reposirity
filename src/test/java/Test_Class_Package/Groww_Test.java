package Test_Class_Package;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import Groww_Project.Groww_Login;
import Utily.Utility_Class;

public class Groww_Test extends BaseClass{


	Groww_Login Growwlogin;
	
	
	
	
	
@BeforeClass 


	public void openbrowser()
	{	
	
	launchBrowser();
	Growwlogin = new Groww_Login(driver);
	}



@BeforeMethod

public void LoginGrowwApp() throws EncryptedDocumentException, IOException, InterruptedException, InvalidFormatException

{
	
	Growwlogin.LoginButtonClick();
	
	 ArrayList<String> id= new ArrayList<String>(driver.getWindowHandles());
	    String str= id.get(1);
	    driver.switchTo().window(str);
	    Thread.sleep(2000);
	
	Growwlogin.enterUserName(Utility_Class.fetchData(0, 0));
	
	Growwlogin.clickContinueButton();
	
	Growwlogin.enterPassword(Utility_Class.fetchData(0, 1));
	
	Growwlogin.clickOnSubmitButton();
	
	String str3= id.get(1);
    driver.switchTo().window(str3);
    Thread.sleep(2000);

	
	Growwlogin.enterPIN1(Utility_Class.fetchData(0, 2));
	
	Growwlogin.enterPIN2(Utility_Class.fetchData(0, 3));
	
	Growwlogin.enterPIN3(Utility_Class.fetchData(0, 4));
	
	Growwlogin.enterPIN4(Utility_Class.fetchData(0, 5));
	
	
}

   @Test(invocationCount = 2)
   
   public void TC01()
   {
	   Reporter.log("TC01");
   }
   

 @Test
   
   public void TC02()
   {
	   Reporter.log("TC02");
   }
   

 @Test
 
 public void TC03()
 {
	   Reporter.log("TC03");
 }
 


@AfterMethod

public void logout() throws IOException
{
	Reporter.log("logout");
	Utility_Class.screenShot(driver, "xyz");
}

@AfterClass

public void closebrowser()
{
	driver.quit();
}


}
