package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.Base;

public class LoginPage extends Base {

	@FindBy(xpath="//span[@id='logo']")
	WebElement Logo;
	
	
	
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String ValTitle() {
		return driver.getTitle();
	}

}
