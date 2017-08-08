package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSignInPage extends BasePage {
	
	public GoogleSignInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.CSS, using = "input#identifierId")
	public static WebElement email_field;
	
	@FindBy(how = How.CSS, using = "input[name='password']")
	public static WebElement password_field;
	
	@FindBy(how = How.CSS, using = "div#identifierNext")
	public static WebElement next_button;
	
	public static String getPageTitle() {
        return driver.getTitle();
    }

}
