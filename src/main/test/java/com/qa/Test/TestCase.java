


import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.Base;
import com.qa.pages.LoginPage;

public class TestCase extends Base{
LoginPage log;
	
	public TestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException {
		init();
	 log=new LoginPage();
		
	}
	@Test
public void logintitle() {
		String title=log.valtitle();
System.out.println(title);}
	
	@Test
public void lognm() {
		log.logname(prop.getProperty("username") , prop.getProperty("password"));
	//System.out.println(prop.getProperty("username"));
	
	}
	

}



