package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import page.LandingPage;

public class Basetest {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		LandingPage lp = new LandingPage(driver);
	}
}
