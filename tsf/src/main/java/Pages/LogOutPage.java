package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends PageBase {

	public LogOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Logout")
	WebElement logoutLink;
	
	@FindBy(xpath  = "/html/body/div[2]/header/div[1]/div/div/div[2]/div/ul/li[3]/div")
	WebElement logoutDropDown;
	

	@FindBy(css ="div.col-md-6")
	public WebElement logoutSuccessMessage ; 
	public void openLogoutPage() {
		
		clickButton(logoutDropDown);
		clickButton(logoutLink);
		
	}
}
