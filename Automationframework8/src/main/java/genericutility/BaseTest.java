package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.HomePage;
import objectrepository.WelcomePage;

public class BaseTest {
	public static WebDriver driver;
	
	public FileUtility fLib;
	
	public WelcomePage wp;
	public HomePage hp;
	@BeforeClass
	public void launchBrowser() throws IOException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 String URL = fLib.getDataFromProperty("url");
		 driver.get(URL);	 
	}
	@BeforeMethod
	public void login() {
		 wp=new WelcomePage(driver);
		 wp.getLoginLink().click();
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		hp.getLogoutLink().click();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
