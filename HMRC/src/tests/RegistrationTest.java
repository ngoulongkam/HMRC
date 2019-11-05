package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.SignInPage;

public class RegistrationTest {
	
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//HomePage homepage = new HomePage(driver);
		//homepage.goToPage();
		//homepage.ClickOnSignInButton();
		SignInPage signInPage = new SignInPage(driver);
		signInPage.goToPage();
		signInPage.inputInValidRegEmailAddressA();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
}
