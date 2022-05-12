package com.qa.test;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.page.LoginPage;

public class Test1 extends Base {
LoginPage log;
	public Test1() throws IOException {
		super();
	}
		@BeforeMethod
		public void setup() throws IOException {
		
			init();
			log =new LoginPage();
		}
		
	/*	@Test(priority=-1)
		public void logintitle() {
		String title=log.Valtitle();
			System.out.println(title);
		}*/
		
		public void lognm() {
			//	log.logname(prop.getProperty("username") , prop.getProperty("password"));
				log.logname(prop.getProperty("username"), prop.getProperty("password"));
			//System.out.println(prop.getProperty("username"));
			
			}
		
		
		
	}


