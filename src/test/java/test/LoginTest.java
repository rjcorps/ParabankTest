package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.LandingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public static void main(String []args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
		lp.goTo("https://parabank.parasoft.com/");
		lp.login("sadasdA", "asdasd");
	}

}
