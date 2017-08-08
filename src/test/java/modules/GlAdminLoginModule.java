package modules;

import pageObjects.GlAdminLoginPage;
import pageObjects.GoogleSignInPage;

import org.junit.Assert;

import components.GlAdminHeader;
import pageObjects.BasePage;
import pageObjects.GlAdminDashboardPage;

public class GlAdminLoginModule {

	public static void visitGlAdminLoginPage() throws Throwable {
		GlAdminLoginPage.visitPage();
		GlAdminLoginPage.waitForElementToDisplay(GlAdminLoginPage.login_button, 5);

		System.out.println("Visited the login page");

	}

	public static String getGlAdminLoginPageTitle() {
		return GlAdminLoginPage.getPageTitle();
	}

	public static void loginGlAdminPortal(String username, String password) throws Throwable {
		GlAdminLoginPage.login_button.click();

		BasePage.wait(3);
		BasePage.switchToNewWindow();

		Assert.assertEquals("Sign in - Google Accounts", GoogleSignInPage.getPageTitle());
		System.out.println(GoogleSignInPage.getPageTitle());
		GlAdminLoginPage.email_field.click();
		System.out.println("email clicked");
		GlAdminLoginPage.email_field.sendKeys(username);
		GlAdminLoginPage.next_button.click();
		BasePage.waitForElementToDisplay(GlAdminLoginPage.password_field, 2);
		GlAdminLoginPage.password_field.sendKeys(password);
		GlAdminLoginPage.password_next_button.click();
		GlAdminLoginPage.wait(5);
		GlAdminLoginPage.switchToOldWindow();

		Assert.assertEquals("Admin - Dashboard", GlAdminDashboardPage.getPageTitle());

	}

	public static boolean isLoginSuccessful() {

		return (GlAdminDashboardPage.getPageTitle() == "Admin - Dashboard");

	}

}
