package env;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Env {

	public static WebDriver driver = null;
	public static String browserName = null;
	public static String currentPath = System.getProperty("user.dir");
	public static Properties prop = new Properties();
	public static String base_url;

	public static String getBrowserName() {

		try {

			InputStream input = new FileInputStream(currentPath + "/src/main/java/configs/browserConfigs.properties");
			prop.load(input);
			browserName = prop.getProperty("browser");
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		return browserName;
	}

	public static WebDriver createWebDriver(String browser) {

		System.out.println("Browser: " + browser);

		switch (browser.toLowerCase()) {
		case "ff":
		case "firefox":

			driver = new FirefoxDriver();
			break;

		case "ch":
		case "chrome":
			/*
			 * BrowserMobProxy proxy = new BrowserMobProxyServer();
			 * proxy.setTrustAllServers(true); proxy.start(0);
			 * proxy.autoAuthorization("", "knock", "open", AuthType.BASIC);
			 * Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
			 * DesiredCapabilities capabilities = new DesiredCapabilities();
			 * 
			 * addProxyCapabilities(capabilities, "127.0.0.1","", "");
			 * capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,
			 * true); capabilities.setCapability(CapabilityType.PROXY, proxy);
			 */
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
			driver = new ChromeDriver(options);

			break;
		default:
			System.out.println("Invalid browser name " + browser);
			System.exit(0);
			break;
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	public static String getBaseUrl(String env) {
		try {

			InputStream input = new FileInputStream(currentPath + "/src/main/java/configs/envConfigs.properties");
			prop.load(input);
			base_url = prop.getProperty(env + "_base_url");
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

		return base_url;

	}
}
