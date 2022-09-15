package ABC_Demo008_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkillsPage {
	
	WebDriver driver = null;
	
	public void SkillsPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void AddSkills() throws Exception {
		
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys("Java30");
		findElement(By.id("skill_description")).sendKeys("Java30Desc");
		findElement(By.id("btnSave")).click();
	}
		
		
		
		public   WebElement findElement(By by) throws Exception 
		{

			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
  }
}
