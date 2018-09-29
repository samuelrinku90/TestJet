import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jetHomePage {
	WebDriver driver;
	By searchBox= By.xpath("//input[@placeholder='Search']");
	By writeSearchBox= By.xpath("//input[@placeholder='Search all of Jet']");
	By cartButton= By.xpath("//span[contains(text(),'Add to Cart')]");
	By accountButton= By.name("account");
	By signInLink= By.linkText("Sign In/Register");
	
	public jetHomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSearchBox() {
		driver.findElement(searchBox).click();
	}
	
	public void setSearchText(String strBuyItem) {
		driver.findElement(writeSearchBox).sendKeys(strBuyItem);
	}
	
	public void clickCartButton() {
		driver.findElement(cartButton).click();
	}
	
	public void clickAccountButton() {
		driver.findElement(accountButton).click();
	}
	
	public void clickSignInLink() {
		driver.findElement(signInLink).click();
	}
	
	public void goToLoginPage() {
		this.clickAccountButton();
		this.clickSignInLink();
	}
	
	public void searchForItem(String strBuyItem) {
		this.clickSearchBox();
		this.setSearchText(strBuyItem);
	}
}
