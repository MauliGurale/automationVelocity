package BaseClasses;




import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import Configurations.PathConfig;

public class BaseClass 
{
	WebDriver driver;
	public WebDriver Cromepath() {
		
		System.setProperty("webdriver.chrome.driver",PathConfig.PathDriver);
           WebDriver driver=new ChromeDriver();
           driver.get("https://trade.angelbroking.com/Login");
           driver.manage().window().maximize();
           return driver;
        }
	
	public String parameterisation(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream(PathConfig.PathSheet);
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	String data = sh.getRow(row).getCell(cell).getStringCellValue();
	
	System.out.println(data);
	return data;
	
	}
	
	public void Screenshot(WebDriver driver) throws IOException 
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		Date date=new Date();
		String filename = date.toString().replace(":","_");
		File dest=new File("C:\\Users\\AI Admin\\eclipse-workspace\\investmentBanking\\target\\Screenshot"+filename+".jpg");
		FileHandler.copy(src, dest);

		
		
	}
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	