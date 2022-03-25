package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;




public class AngelOneLogin {
	@FindBy(xpath="//input[@id='txtUserID']")private WebElement Uname;
	@FindBy(xpath="//input[@id='txtTradingPassword']")private WebElement Pass;
	@FindBy(xpath="//a[@id='loginBtn']")private WebElement login;
	@FindBy(xpath="//div[contains(text(),'User')]")private WebElement txt1;
	@FindBy(xpath="//div[contains(text(),'Trading')]")private WebElement txt2;
	
	public AngelOneLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterName(String name)
	{
		Uname.sendKeys(name);
	}
	public void enterPass(String pass)
	{
		Pass.sendKeys(pass);
	}
	public void enterButton()
	{
		login.click();
	}
	public void gettextOne()
	{
		String ActualText = txt1.getText();
		String ExpectedText="User ID is required.";
		Assert.assertEquals(ActualText,ExpectedText);
		
	}
	public void gettextTwo()
	{
		String ActualText1 = txt2.getText();
		String ExpectedText1="Trading Password is required.";
		Assert.assertEquals(ActualText1,ExpectedText1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
