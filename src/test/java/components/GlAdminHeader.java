package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BasePage;

public class GlAdminHeader extends BasePage {
	
	public GlAdminHeader(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "header.main-header a span:nth-child(2)")
	public static WebElement gl_admin_logo;
	
	@FindBy(how = How.CSS, using = "a.sidebar-toggle")
	public static WebElement gl_admin_side_bar_toggle;
	
	@FindBy(how = How.CSS, using = "li.user-menu")
	public static WebElement gl_admin_user_menu;
	
	@FindBy(how = How.CSS, using = "li.user-footer a")
	public static WebElement gl_admin_user_menu_logout_button;

}
