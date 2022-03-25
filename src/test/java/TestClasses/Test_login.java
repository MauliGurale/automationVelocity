package TestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseClass;
import pomclasses.AngelOneLogin;

public class Test_login {
	WebDriver driver;
	//AngelOneLogin angel=new AngelOneLogin(driver);
	@BeforeMethod
	public void openBrowser()
	{
		BaseClass base=new BaseClass();
		driver=base.C
		Reporter.log("CHrome is Opened");
	}
	@Test
	public void Tc01() throws InterruptedException
	{
		AngelOneLogin angel=new AngelOneLogin(driver);
		angel.enterName(" ");
		angel.enterPass(" ");
		angel.enterButton();
		angel.gettextOne();
		angel.gettextTwo();
		Thread.sleep(2000);
		Reporter.log("Test case one Performed");

		
	}
	@Test
	public void TC02() throws EncryptedDocumentException, IOException
	{
		BaseClass b=new BaseClass();
		AngelOneLogin an=new AngelOneLogin(driver);
		an.enterName(b.SheetSetUp(0,0));
		an.enterPass(b.SheetSetUp(0,1));
		//Thread.sleep(2000);
		an.enterButton();
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
