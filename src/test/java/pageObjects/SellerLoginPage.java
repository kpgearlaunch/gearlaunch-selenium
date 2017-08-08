package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import env.Env;

public class SellerLoginPage extends BasePage {
	
	public SellerLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public static String url = Env.getBaseUrl("sandbox_seller")+"/login";
	public static String title = "GearLaunch - Sellers";
	
	@FindBy(how = How.CSS, using = "a.login-btn")
	public static WebElement login_button;
	
	@FindBy(how = How.CSS, using = "div.masthead img")
	public static WebElement gearlaunch_logo;
	
	@FindBy(how = How.CSS, using = "div.masthead a")
	public static WebElement contact_us;
	
	public void visitPage(){
		driver.get(url);
	}
	
	public boolean isOnPage() {
        return driver.getTitle() == title;
    }
	
	public static SellerLoginPage visitPage(WebDriver driver) {
		SellerLoginPage page = new SellerLoginPage(driver);
        page.visitPage();
        return page;
    }
}

	