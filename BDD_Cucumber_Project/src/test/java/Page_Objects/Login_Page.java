package Page_Objects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_Page {
	
	public static WebDriver driver;
	
	
	public void LoginPage(WebDriver driver)
	{
		Login_Page.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
 	@FindBy(xpath="//input[@name='username']")
    WebElement UserName1;  


    @FindBy(xpath="//input[@name='password']")
    WebElement Password1;  
         
    @FindBy(id="btnLogin")
    WebElement SignInButton1; 

    
	
	public void Login() throws Exception {
		
		
		
		UserName1.sendKeys("Admin");
	
		Password1.sendKeys("admin123");
		SignInButton1.click();
	}
	
	
	
	
	
	
	
}

