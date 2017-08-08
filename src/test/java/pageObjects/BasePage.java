package pageObjects;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.GlAdminLoginPage;

public class BasePage {

	public static WebDriver driver;
	private static String old_win = null;
	private static String lastWinHandle;
	private static int windowCount;

	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}

	/** Method to switch to new window */
	public static void switchToNewWindow() throws Exception {
		old_win = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles())
			lastWinHandle = winHandle;
		driver.switchTo().window(lastWinHandle);
	}

	/* Method to switch to old window */
	public static void switchToOldWindow() throws Exception {
		driver.switchTo().window(old_win);
	}

	/* Method to wait for a specific amount of time */
	public static void wait(int time) throws NumberFormatException, InterruptedException {
		// sleep method takes parameter in milliseconds
		Thread.sleep(time * 1000);
	}

	/* Method to wait for an element to display */
	public static void waitForElementToDisplay(WebElement element, int duration) throws Exception {
		WebDriverWait wait = (new WebDriverWait(driver, duration * 1000));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/* Method to wait for an element to be clicked */
	public static void waitForElementToClick(WebElement element, int duration) throws Exception {
		WebDriverWait wait = (new WebDriverWait(driver, duration * 1000));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/* Method for page refresh */
	public static void refresh() throws Exception {
		driver.navigate().refresh();
	}

	/* Method to switch to window by title */
	public static void switchToWindowByTitle(String windowTitle) throws Exception {
		old_win = driver.getWindowHandle();
		boolean winFound = false;
		for (String winHandle : driver.getWindowHandles()) {
			String str = driver.switchTo().window(winHandle).getTitle();

			if (str.equals(windowTitle)) {
				winFound = true;
				break;
			}
		}
		if (!winFound)
			throw new Exception("Window having title " + windowTitle + " not found");
	}

	/* Method to wait for a page to load */
	public static void waitForPageLoad(int duration) {
		WebDriverWait wait = (new WebDriverWait(driver, duration * 1000));
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
	}

	/* Method to wait until an element is not present */
	public static void waitForElementNotPresent(WebElement element, int duration) throws Exception {
		WebDriverWait wait = (new WebDriverWait(driver, duration * 1000));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	/* Method to wait for a window to close */
	public static void waitForWindowToClose(int duration) {
		windowCount = driver.getWindowHandles().size();
		WebDriverWait wait = (new WebDriverWait(driver, duration * 1000));
		wait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver input) {
				return input.getWindowHandles().size() < windowCount;
			}
		});
	}
}
