package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
	}

	//PageFactory

	@FindBy(xpath="//input[@name='username']")
	WebElement fldUsr;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement fldPwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnLogin;
	
	
	//Action Methods
	public void login(String usr, String pwd) {
		
		fldUsr.sendKeys(usr);
		fldPwd.sendKeys(pwd);
		btnLogin.click();
		
		
	}
	
	public void goTo(String url) {
		
		driver.get(url);
		
	}
	
	

}
