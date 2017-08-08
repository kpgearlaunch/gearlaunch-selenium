package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import env.Env;

public class GlAdminLoginPage extends BasePage {
	
	public GlAdminLoginPage(WebDriver driver) {
		super(driver);
	}
	
	public static String url = Env.getBaseUrl("sandbox_admin")+"/login";
	public static String title = "GearLaunch - Admin";
	
	@FindBy(how = How.CSS, using = "a.login-btn")
	public static WebElement login_button;
	
	@FindBy(how = How.CSS, using = "div.masthead a")
	public static WebElement contact_us;
	
	@FindBy(how = How.CSS, using = "input#identifierId")
	public static WebElement email_field;
	
	@FindBy(how = How.CSS, using = "input[name='password']")
	public static WebElement password_field;
	
	@FindBy(how = How.CSS, using = "div#identifierNext")
	public static WebElement next_button;
	
	@FindBy(how = How.CSS, using = "div#passwordNext")
	public static WebElement password_next_button;
	
	public static void visitPage(){
		System.out.println(url);
		driver.get(url);
	}
	
	public static String getPageTitle() {
        return driver.getTitle();
    }
	
	
}
