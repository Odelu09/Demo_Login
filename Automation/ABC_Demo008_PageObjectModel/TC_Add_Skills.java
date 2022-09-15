package ABC_Demo008_PageObjectModel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import Day_029_PageObjectModel.HomePage;
import Day_029_PageObjectModel.LoginPage;

public class TC_Add_Skills {
	WebDriver driver;
	
	
	@BeforeTest
	
	public void TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	}
	
	
	
  @Test
  public void Add_Skills() throws Exception {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login();
		
		SkillsPage S1= new SkillsPage();
		S1.SkillsPage(driver);
		S1.AddSkills();
		
		HomePage H1= new HomePage();
		H1.HomePage(driver);
		H1.Logout();
  }

@AfterTest 
public void  TestCloser()throws Exception {	
	driver.quit();
}



}