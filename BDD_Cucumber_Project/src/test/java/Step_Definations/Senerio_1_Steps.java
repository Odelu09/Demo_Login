package Step_Definations;



import org.openqa.selenium.WebDriver;

import Page_Objects.Home_Page;
import Page_Objects.Login_Page;
import Page_Objects.Logout_Page;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class Senerio_1_Steps {

	WebDriver driver;
	
	
	Login_Page Login_Steps = new Login_Page();
	Home_Page Home_Steps  = new Home_Page();
	Logout_Page Logout_Steps = new Logout_Page();
	
	
	@Given("User lunch Chrome browser")
	public void openbrowser() throws Exception
	{
			Home_Steps.OpenChromeBrowser();
	}
	
	@When("User Open URL {string}")
	public void user_open_url(String string) throws Exception {
		Home_Steps.OpenURL();
		
	}
	
	@When("User enters UserName as {string}")
	public void user_enters_email_id_as(String string) throws Exception {
		Login_Steps.Login();
		
	}
	
	@When("User enters Password as {string}")
	public void user_enters_password_as(String string) throws Exception {
		Login_Steps.Login();
		
	}
	@Given ("Click on Login") 
	public void clicklogin() throws Exception {
		Login_Steps.Login();
	}
	
	
	@When 	("User Click on Log Out link")
	public void clicklogout() throws Exception {
		Logout_Steps.LogOut();
		}
	
	@Given ("Close Browser")
	public void closebrowser() throws Exception {
		Logout_Steps.Close_Browsre();
	}
	
	}
