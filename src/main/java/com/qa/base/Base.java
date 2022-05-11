package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
public static WebDriver driver;
	static Properties prop;
	



public Base() throws IOException {
		prop=new Properties ();
		FileInputStream fis=new FileInputStream("C:\\Users\\91991\\eclipse-workspace\\PracticeDemo\\src\\main\\java\\com\\qa\\config\\config.file");
		
		prop.load(fis);
		
	}
	

@SuppressWarnings("deprecation")
public static void init() {
	
	String browsername= prop.getProperty("browser");
	if(browsername.equals("chrome")) {
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}else {
		if(browsername.equals("Firefox")) {
			System.setProperty( "webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
	}
driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));


	}}}

