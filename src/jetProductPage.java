import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jetProductPage {
	WebDriver driver;
	By productTab= By.xpath("//span/div[contains(text(),'Apple 10.5-inch iPad Pro Wi-Fi')]");
	
	public jetProductPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickProductTab() {
		driver.findElement(productTab).click();
	}

}
