package BaseClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassOne {
	
	public WebDriver ChromeChaluKrtoy()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AI Admin\\Desktop\\POI\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://trade.angelbroking.com/Login");
		return driver;
	}
	public String ReadKrtoy(int r,int c) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\AI Admin\\eclipse-workspace\\investmentBanking\\src\\test\\resources\\TestData\\TC.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = sh.getRow(r).getCell(c).getStringCellValue();
		System.out.println(data);
		return data;
	}

}
