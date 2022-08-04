package Utily;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_Class {


	
	   public static void screenShot (WebDriver driver,String abc) throws IOException 
		{
			
		   Date currentDate = new Date();
			System.out.println(currentDate);
			String ScreenShotFileName = currentDate.toString().replace(" ", "-").replace(":", "-");
			System.out.println(ScreenShotFileName);
		
			
			
			File sourse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		    File dest = new File ("F:\\SCREENSHOT"+ ScreenShotFileName +".jpg");
		 
		    FileHandler.copy(sourse, dest);	
		}

	   
	    public static String fetchData (int row, int cell) throws EncryptedDocumentException, IOException, InvalidFormatException
	    {
	    	
	       String path = "C:\\Users\\admin\\Desktop\\Book1.xlsx";
	       
	       FileInputStream file = new FileInputStream (path);
	    	
	       Workbook wb = WorkbookFactory.create(file);
	    	
	       Sheet v = wb.getSheet("vishu"); 
	       
	       String Id = v.getRow(row).getCell(cell).getStringCellValue();
	       
	       return Id;
	       
	    }	   

}






