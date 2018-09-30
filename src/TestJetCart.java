import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class TestJetCart {
	
  WebDriver driver;
  jetHomePage objHomePage;
  jetLoginPage objLoginPage;
  jetProductPage objProductPage;
  jetDetailedProductPage objDetailedProductPage;
  jetCartPage objCartPage;
  
  private String Url = "";
  @Test
  public void validateCart() {
	  
	  objHomePage= new jetHomePage(driver);
	  objHomePage.goToLoginPage();
	  
	  objLoginPage= new jetLoginPage(driver);
	  objLoginPage.loginToJet("samuel.rinku90@gmail.com", "Github123");
	  
	  objHomePage.searchForItem("Ipad pro 10.5"+"\n");
	  
	  objProductPage= new jetProductPage(driver);
	  objProductPage.clickProductTab();
	  
	  objDetailedProductPage= new jetDetailedProductPage(driver);
	  objDetailedProductPage.clickAddToCartButton();
	  
	  objHomePage.clickCartButton();
	  
	  objCartPage= new jetCartPage(driver);
	  String checkoutItem= objCartPage.getTextCheckout();
	  Assert.assertEquals("Apple 10.5-inch iPad Pro Wi-Fi", checkoutItem);
		
  }
  @BeforeClass
  public void beforeClass() {
		try {
			System.setProperty("webdriver.gecko.driver", new File("..//TestJet//libs/geckodriver").getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Url = "https://jet.com/";
		driver.get(Url);
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }

}
