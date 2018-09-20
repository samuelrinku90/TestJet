import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
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
  private String Url = "";
  @Test
  public void validateCart() {
	
	    Url = "https://jet.com/";
		driver.get(Url);
		
		driver.findElement(By.name("account")).click();
		driver.findElement(By.linkText("Sign In/Register")).click();
		driver.findElement(By.id("login-email")).sendKeys("samuel.rinku90@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Github123");
		driver.findElement(By.xpath("//button[@class='btn-full submit btn-primary-jds py2'][contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement searchEl = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search all of Jet']")));
		searchEl.sendKeys("Ipad pro 10.5"+"\n");
		
		WebElement selectEl = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/div[contains(text(),'Apple 10.5-inch iPad Pro Wi-Fi')]")));
		selectEl.click();
		
		WebElement addToCartEl = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add to Cart')]")));
		addToCartEl.click();
		
		WebElement mapObject = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='svg' and @name='cart']")));
		Actions builder = new Actions(driver);
		builder.click(mapObject).build().perform();
		
		WebElement isCurrentlyInCheckout = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.linkText("Apple 10.5-inch iPad Pro Wi-Fi")));
		Assert.assertEquals("Apple 10.5-inch iPad Pro Wi-Fi", isCurrentlyInCheckout.getText());
		
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", ".\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }

}
