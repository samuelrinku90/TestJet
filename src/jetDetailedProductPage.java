import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jetDetailedProductPage {
	WebDriver driver;
	By addToCartButton= By.xpath("//*[name()='svg' and @name='check']");
	
	public jetDetailedProductPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickAddToCartButton(){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement mapObject = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(addToCartButton));
	
		//WebElement mapObject= driver.findElement(addToCartButton);
		Actions builder = new Actions(driver);
		builder.click(mapObject).build().perform();
	}

}
