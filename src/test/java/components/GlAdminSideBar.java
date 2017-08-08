package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import pageObjects.BasePage;

public class GlAdminSideBar extends BasePage {
	
	public GlAdminSideBar(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.dashboard']")
	public static WebElement dashboard_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.payouts']")
	public static WebElement payouts_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.stores']")
	public static WebElement stores_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.orders']")
	public static WebElement orders_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.arts']")
	public static WebElement artwork_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.launches']")
	public static WebElement launches_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.supportTools']")
	public static WebElement support_tools_sidebar_menu;
	
	@FindBy(how = How.CSS, using = "a[ui-sref='auth.base.development']")
	public static WebElement development_sidebar_menu;

}
