package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTestNg_Prog1 {


  @BeforeClass
 
public void LaunchA()
{
	  System.out.println("Before Class");
}

  @BeforeMethod
  
  public void BeforeM()
  {
  	  System.out.println("Before Method");
  }

  
  @Test
  
  public void TC01()
  {
  	  System.out.println("TC01");
  }



  @Test
  
  public void TC02()
  {
  	  System.out.println("TC02");
  }


  @AfterMethod
  
  public void AfterM()
  {
  	  System.out.println("After Mehod");
  }


  @AfterClass
  
  public void AfterC()
  {
  	  System.out.println("After Class");
  }





}
