package squad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class webdriver {
	//static String Login = "lesnikov";
	//static String Password = "qoO5QOE9";
	static String LogoPass = "lesnikov:qoO5QOE9@";
	static String LentaURL = "test-squadspace.squadsoft.ru/default.aspx/";
	static String ChromeProfilePath = "/home/dante/.config/google-chrome/SQUAD/";
	static String FFQuantumBinPath = "/home/dante/MEGA/MEGAsync/soft/bin/firefox_quantum/";
	static String FFProfilePath = "/home/dante/.mozilla/firefox/hwjag2ba.QA/";
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	static String linkProfile = "test-squadspace.squadsoft.ru/default.aspx/profile/5";
	public static void Chrome() {
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.35");
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		ChromeOptions ChromeProfile = new ChromeOptions();
		ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
		ChromeProfile.addArguments("disable-popup-blocking");
		WebDriver Cdriver= new ChromeDriver(ChromeProfile);
		Cdriver.manage().window().maximize();
		//driver.get("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/");
		//driver.get("http://test-squadspace.squadsoft.ru/default.aspx/profile/5");
		//WebElement profile = driver.findElement(By.className("profile"));
		//ExpectedConditions.presenceOfElementLocated(By.className("profile"));
		
	}

	public static void FF() {
		System.setProperty("webdriver.firefox.bin", FFQuantumBinPath + "firefox");
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		System.out.println("*******************");
		System.out.println("launching FireFox browser");
		FirefoxOptions FirefoxProfile = new FirefoxOptions();
		//FirefoxProfile.addArguments("apz.popups.enabled", "true");
		FirefoxProfile.addPreference("-apz.popups.enabled", true);
		//FirefoxProfile.addArguments("--safe-mode");
		//FirefoxProfile.addArguments("-profile", FFProfilePath);
		//FirefoxProfile.addArguments("-jsconsole");
		WebDriver FFDriver = new FirefoxDriver(FirefoxProfile);
		FFDriver.manage().window().maximize();
		FFDriver.get("http://" + LogoPass + LentaURL);
		//FFDriver.close();
	} 
}
