package com.qa.page;

import java.io.IOException;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class LoginPage extends Base {
	
	@FindBy(xpath="//h2[@class='_8eso']")
			WebElement title;

	@FindBy(id="email")
				WebElement email;
	@FindBy(id="pass")
				WebElement password;
				
	@FindBy(xpath="//button[@name='login']")
				WebElement loginpress;
	
					public LoginPage() throws IOException 
			{
					
					PageFactory.initElements(driver, this);
					
					
				}
				public String Valtitle() {
					return driver.getTitle();
				}
				
				public void logname(String un ,String pw) {
					email.sendKeys(un);
					password.sendKeys(pw);
					loginpress.click();
					
				
				}
				
			

	
	
	
	
	
	

}
