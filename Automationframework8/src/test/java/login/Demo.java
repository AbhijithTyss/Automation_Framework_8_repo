package login;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericutility.ExcelUtility;
import genericutility.FileUtility;

public class Demo {
	@Test
	public void test() throws IOException {
//		FileUtility fLib=new FileUtility();
//		String URL = fLib.getDataFromProperty("url");
//		System.out.println(URL);
//		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get(URL);
//		WebElement element = driver.findElement(By.id(""));
		
		ExcelUtility eLib=new ExcelUtility();
		String date = eLib.getStringDataFromExcel("Register", 2, 0);
		System.out.println(date);
	}
}
