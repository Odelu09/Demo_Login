package Page_Objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class Logout_Page {
	
WebDriver driver;
	
	public void LogoutPage(WebDriver driver)
{
this.driver = driver;
}

	
	



public void LogOut() throws Exception {
	
	driver.findElement(By.xpath("//a[@href='/logout']")).click();
	
}

public void Close_Browsre() throws Exception {
	
	driver.close();
}



	
}



