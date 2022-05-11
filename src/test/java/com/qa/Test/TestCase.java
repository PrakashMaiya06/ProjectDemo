package com.qa.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterTest;

import com.qa.base.Base;
import com.qa.pages.LoginPage;

public class TestCase extends Base{
LoginPage log;
	
	public TestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@AfterTest
	public void setup() throws IOException {
		init();
	 log=new LoginPage();
		
	}
	@Test
	public void logintitle() {
		String title=log.ValTitle();
System.out.println(title);
	}
}




