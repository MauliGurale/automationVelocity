package TestClasses;

import java.io.IOException;


import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

import BaseClasses.BaseClass;
import BaseClasses.BaseClassOne;

import pomclasses.AngelOneLogin;

public class LoginWithPassword {
	WebDriver driver;
	
	@Test
	public void Tc05() throws IOException
	{
		
		BaseClass b=new BaseClass();
		 driver=b.Cromepath();
		 AngelOneLogin an=new AngelOneLogin(driver);
		 an.enterName(b.parameterisation(0,0));
		an.enterPass(b.parameterisation(0, 1));
		 //an.enterName("Mauli");
	}
}		
