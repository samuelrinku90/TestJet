import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Jetprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rinku\\Desktop\\Gecko driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jet.com/");
		//Alert al = driver.switchTo().alert();
		//al.dismiss();
		
		driver.findElement(By.name("account")).click();
		driver.findElement(By.linkText("Sign In/Register")).click();
		driver.findElement(By.id("login-email")).sendKeys("samuel.rinku90@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Github123");
		driver.findElement(By.xpath("//button[@class='btn-full submit btn-primary-jds py2'][contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).click(); //sendKeys("Ipad pro 64gb");
		//driver.findElement(By.xpath("//input[@placeholder='Search all of Jet']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement searchEl = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search all of Jet']")));

		searchEl.sendKeys("Ipad pro 10.5"+"\n");
		
		
		//driver.findElement(By.xpath("//input[@placeholder='Search all of Jet']")).sendKeys("Ipad pro 10.5"+"\n");
		System.out.println("hi i am here 1");
		WebElement selectEl = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/div[contains(text(),'Apple 10.5-inch iPad Pro Wi-Fi')]")));
		//WebElement apple=driver.findElement(By.xpath("//span/div[contains(text(),'Apple 10.5-inch iPad Pro Wi-Fi')]"));
		System.out.println("hi i am here");
		selectEl.click();
		WebElement addToCartEl = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add to Cart')]")));
		addToCartEl.click();
		//WebElement cartSelectEl = wait.until(
			    //ExpectedConditions.visibilityOfElementLocated(By.xpath("//svg[@name='Cart']")));
		//Actions abc= new Actions (driver);
		//WebElement element= driver.findElement(By.xpath("//*[name()='svg' and contains(@name, 'Cart')]"));
		//abc.click(element).build().perform();
		//cartSelectEl.click();
		System.out.println("hi i am here 3");
		//Assert.
		//*[local-name()='svg']
		WebElement mapObject = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[name()='svg' and @name='cart']")));
		Actions builder = new Actions(driver);
		builder.click(mapObject).build().perform();
		//WebElement mapObject = driver.findElement(By.xpath("//*[name()='svg' and @name='cart']"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", mapObject);
		System.out.println("hi i am here 4");
		WebElement isCurrentlyInCheckout = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@contains(text(),'Apple 10.5-inch iPad Pro Wi-Fi']")));
		Assert.assertEquals("Apple 10.5-inch iPad Pro Wi-Fi", isCurrentlyInCheckout.getText());
		System.out.println("hi i am here 5");
		//Actions abc= new Actions (driver);
		//WebElement element= driver.findElement(By.xpath("//*[local-name()='svg' and contains(@name, 'Search')]"));
		//abc.click(element).build().perform();
		//driver.findElement(By.xpath("div.sc-bwzfXH gIGIXE")).click();
		//WebElement mapObject = driver.findElement(By.xpath("//*[local-name()='svg' and contains(@name, 'Search')]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", mapObject);
		//driver.findElement(By.id("login-password")).sendKeys("Github123");
		
		//driver.findElement(By.className("btn-full submit btn-primary-jds py2")).click( 	);
		
	}
	
	

}
	