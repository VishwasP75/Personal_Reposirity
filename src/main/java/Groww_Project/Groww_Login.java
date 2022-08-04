package Groww_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Groww_Login {


	@FindBy(xpath = "(//div[text()='Stocks'])[1]")
	 private WebElement LoginClickButton;

	
	 @FindBy(xpath = "(//input[@type='text'])[1]")
	 private WebElement UserID;

	
	 @FindBy(xpath = "(//span[@class='absolute-center'])[1]")
	 private WebElement ContinueButton;
	 
     

	 @FindBy(xpath = "//input[@id='login_password1']")
	 private WebElement PWD;

     
	 @FindBy(xpath = "//span[text()='Submit']")
	 private WebElement SubmitButton;

     
	
	 @FindBy(xpath = "(//input[@type='number'])[1]")
	 private WebElement Pin1;
	 
	 
	 @FindBy(xpath = "(//input[@type='number'])[2]")
	 private WebElement Pin2;

     
	 @FindBy(xpath = "(//input[@type='number'])[3]")
	 private WebElement Pin3;

     
	 @FindBy(xpath = "(//input[@type='number'])[4]")
	 private WebElement Pin4;

     
	 public Groww_Login (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

    
public void LoginButtonClick()
	 
	 {
	LoginClickButton.click();
	 }
	 
	 
	  
	 public void enterUserName (String UserID)
	 
	 {
		 this.UserID.sendKeys("vishwaspati58@gmail.com");
	 }


    

public void clickContinueButton()
	 
	 {
	ContinueButton.click();
	 }


public void enterPassword (String PWD )

{
	 this.PWD.sendKeys("@Vishu7959###");
}


public void clickOnSubmitButton ()

{
	SubmitButton.click(); 
	
}



public void enterPIN1 (String Pin1)

{
	 this.Pin1.sendKeys(Pin1);
}



public void enterPIN2 (String Pin2)

{
	 this.Pin2.sendKeys(Pin2);
}




public void enterPIN3 (String Pin3)

{
	 this.Pin3.sendKeys(Pin3);
}



public void enterPIN4 (String Pin4)

{
	 this.Pin4.sendKeys(Pin4);
}









}
