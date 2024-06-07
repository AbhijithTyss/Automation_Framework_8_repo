package books;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_010_Test extends BaseClass {
	@Test
	public void clickOnBooks() {
		hp=new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
		Reporter.log("Books page is displayed",true);
		WebDriverUtility wLib=new WebDriverUtility(driver);
		wLib.moveByOffset( 670, 570);
	}
}
