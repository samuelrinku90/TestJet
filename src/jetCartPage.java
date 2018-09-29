import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jetCartPage {
	WebDriver driver;
	By checkout= By.linkText("Apple 10.5-inch iPad Pro Wi-Fi");
	
	public jetCartPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public String getTextCheckout() {
		return driver.findElement(checkout).getText();
	}

}
