import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jetLoginPage {
	WebDriver driver;
	By emailAddress= By.id("login-email");
	By password= By.id("login-password");
	By logInButton= By.xpath("//button[@class='btn-full submit btn-primary-jds py2'][contains(text(),'Log In')]");
	
	public jetLoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void setEmailAddress(String strEmailAddress) {
		driver.findElement(emailAddress).sendKeys(strEmailAddress);
	}
	
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	
	public void clickLogInButton() {
		driver.findElement(logInButton).click();
	}
	
	public void loginToJet(String strEmailAddress,String strPassword) {
		this.setEmailAddress(strEmailAddress);
		this.setPassword(strPassword);
		this.clickLogInButton();
	}
}
