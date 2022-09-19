package Page_Objects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_Page {
	
	
		
	
WebDriver driver;


	
	public void LoginPage(WebDriver driver)
{
this.driver = driver;
}

	
		

public void OpenChromeBrowser() throws Exception 
{
  
  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
  if (driver == null) {
	  driver = new ChromeDriver();
  }
 
  driver.manage().window().maximize();
   
  
}


public void OpenURL() throws Exception 
{
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
}


}
