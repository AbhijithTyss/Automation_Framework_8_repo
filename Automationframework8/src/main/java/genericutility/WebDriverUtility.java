package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	public Actions act;
	
	public WebDriverUtility(WebDriver driver) {
		act=new Actions(driver);
	}
	
	public void doubleClick(WebElement element) {
		act.doubleClick(element).perform();
	}
	
	public void moveByOffset(int x,int y) {
		act.moveByOffset(x, y).perform();
	}
	
	public WebDriver switchToFrame(WebDriver driver,int index) {
		return driver.switchTo().frame(index);
	}
}
