package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.GlAdminLoginModule;
import pageObjects.GlAdminLoginPage;

public class GlAdminLoginSteps {
	
	public WebDriver driver;
	
	
	public GlAdminLoginSteps(){
		driver = BaseHooks.driver;
		PageFactory.initElements(driver, GlAdminLoginPage.class);
	}

	
	
	@Given("^I visit the GL admin login page$")
	public void visit_gl_admin_login_page() throws Throwable {
		GlAdminLoginModule.visitGlAdminLoginPage();
		Assert.assertEquals("GearLaunch - Admin", GlAdminLoginModule.getGlAdminLoginPageTitle());
		
	}
	
	@When("^I login with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void login(String username, String password) throws Throwable{
		GlAdminLoginModule.loginGlAdminPortal(username, password);
	}
	
	@Then("^the login is successful$")
	public void verifyLoginSuccessful(){
		Assert.assertEquals("Admin - Dashboard", GlAdminLoginModule.getGlAdminLoginPageTitle());
	}
	
	@Then("^the login is unsuccessful$")
	public void verifyLoginUnSuccessful(){
		Assert.assertNotEquals("Admin - Dashboard", GlAdminLoginModule.getGlAdminLoginPageTitle());
	}

}
