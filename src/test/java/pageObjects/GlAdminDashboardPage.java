package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BasePage;
import env.Env;



public class GlAdminDashboardPage extends BasePage {
	
	public GlAdminDashboardPage(WebDriver driver) {
		super(driver);
	}

	public static String url = Env.getBaseUrl("sandbox_admin")+"/?period=TODAY";
	public static String title = "Admin - Dashboard";
	
	@FindBy(how = How.CSS, using = "div.home-page ol li i")
	public static WebElement dashboard_icon;
	
	@FindBy(how = How.CSS, using = "div.info-box span.bg-aqua")
	public static WebElement purchases_info_box;
	
	@FindBy(how = How.CSS, using = "div.info-box span.bg-green")
	public static WebElement sales_info_box;
	
	@FindBy(how = How.CSS, using = "div.info-box span.bg-yellow")
	public static WebElement visits_info_box;
	
	@FindBy(how = How.CSS, using = "div.info-box span.bg-purple")
	public static WebElement conversion_rate_info_box;
	
	
	public static String getPageTitle() {
        return driver.getTitle();
    }
	
	
}
