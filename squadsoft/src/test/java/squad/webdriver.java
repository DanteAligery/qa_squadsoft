package squad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.proxy.auth.AuthType;
import net.lightbody.bmp.core.har.Har;
import org.openqa.selenium.Proxy;
//import squad.virtPROXY;


public class webdriver {
	static String Login = "lesnikov";
	static String Password = "qoO5QOE9";
	static String LentaURL = "http://test-squadspace.squadsoft.ru/default.aspx/";
	static String ProfileURL = "profile/5";
	static String ChromeProfilePath = "/home/dante/.config/google-chrome/SQUAD/";
	static String FFQuantumBinPath = "/home/dante/MEGA/MEGAsync/soft/bin/firefox_quantum/";
	static String FFBinPath = "/usr/lib64/firefox/";
	static String FFProfilePath = "/home/dante/.mozilla/firefox/hwjag2ba.QA/";
	static String OBinPath = "/usr/lib64/opera/";
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	static String linkProfile = "test-squadspace.squadsoft.ru/default.aspx/profile/5";
	static String OSName = System.getProperty("os.name");
	static String OSVer = System.getProperty("os.version");
	static String OSArch = System.getProperty("os.arch");
	static String mPanelXPATH= "/html/body/form/div[5]/app-squadspace/squadspace-header/div";
	static String containerXpath = "/html/body/form/div[5]/app-squadspace/div";
	//public static BrowserMobProxyServer server;
	public WebDriver driver;


	
	public static void Chrome() {
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		//squad.virtPROXY.initProxy();
		//System.setProperty("bmp.allowNativeDnsFallback", "true");
		//BrowserMobProxyServer server = new BrowserMobProxyServer();
		//server.chainedProxyAuthorization(Smoke, Password, AuthType.BASIC);
		//System.out.println(server.newHar("har"));
		//server.start();
		//server.autoAuthorization("squad", Smoke, Password, AuthType.BASIC);
		//System.out.println("proxy start!");
		//System.out.println(server.getServerBindAddress());
		//Proxy proxy = ClientUtil.createSeleniumProxy(server);
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.PROXY, proxy);
	
		//proxy.setHttpProxy("localhost:8888");
		
		ChromeOptions ChromeProfile = new ChromeOptions();
		ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
		ChromeProfile.addArguments("disable-popup-blocking");
		//ChromeProfile.addArguments("--proxy-server=http://localhost:");
		
		//ChromeProfile.addEncodedExtensions("Proxy-Auto-Auth_v2.0.crx");
		//capabilities.setCapability(CapabilityType.PROXY, proxy);
		//capabilities.setCapability(ChromeOptions.CAPABILITY, ChromeProfile);
		//proxy.setSocksUsername(Smoke);
		//proxy.setSocksPassword(Password);
		  
		 
		System.out.println("Запуск браузера");
		WebDriver Cdriver= new ChromeDriver(ChromeProfile);
		Cdriver.manage().window().maximize();
		System.out.println("window run");
		Cdriver.get(LentaURL);
		
		//Alert alert = Cdriver.switchTo().alert();
		//WebDriverWait wait = new WebDriverWait(Cdriver, 5);
		//wait.until(ExpectedConditions.alertIsPresent());
		//alert.authenticateUsing(new UserAndPassword(Smoke, Password));
		
		//System.out.println("catch alert");
		/*	
		try {
				//Cdriver.navigate().to("http://ya.ru");
				Cdriver.get(LentaURL);
				//Cdriver.getWindowHandles();
			
				System.out.println("все-таки это дерьмо грузится!");
				
				//Cdriver.switchTo().alert();
			}
			catch (Exception ex) {
				throw new RuntimeException("home page cannot be opened!");				
			}
		*/
			/*
			try {
				//Cdriver.get(LentaURL);
				System.out.println(Cdriver.getWindowHandle());
				
				WebDriverWait wait = new WebDriverWait(Cdriver, 3);
				wait.until(ExpectedConditions.alertIsPresent());
				Cdriver.findElement(By.id("alert"));
				Alert alert = Cdriver.switchTo().alert();
				System.out.println(alert.getText());
				alert.sendKeys(Smoke);
			}
			catch(NoAlertPresentException noAlert){
				noAlert.getMessage();
			}
			
		System.out.println("go to url");
		//Cdriver.navigate().to(LentaURL);
		*/
		//Cdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Alert alert = Cdriver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.sendKeys(Smoke);
		
		//WebDriverWait wait = new WebDriverWait(Cdriver, 5);
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//WebDriver Cdriver= new ChromeDriver(capabilities);
		
		
		/*
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		Capabilities caps = ((RemoteWebDriver) Cdriver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();
		System.out.println("launching " + browserName + " " + browserVersion);	
		Cdriver.manage().window().maximize();
		Cdriver.get(LentaURL);
		WebDriverWait wait = new WebDriverWait(Cdriver, 3);
		*/  
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		//alert.authenticateUsing(new UserAndPassword(Smoke, Password));
		//Alert alert1 = (new WebDriverWait(Cdriver, 10)).until(ExpectedConditions.alertIsPresent());
		//Cdriver.switchTo().alert();
		//alert.authenticateUsing(LogoPass);
		//Cdriver.switchTo().alert().authenticateUsing(LogoPass);
		//alert1.accept();
		//autentification.authenticateUsing(null);;
		//autentification.authenticateUsing(new UserAndPassword(Smoke, **password**));
		//Alert autentification = (Alert) (new WebDriverWait(Cdriver, 10));
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(mPanelXPATH));
		//ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(containerXpath));
		//Cdriver.close();

	}

	public static void FF_Quantum() {
		System.setProperty("webdriver.firefox.bin", FFQuantumBinPath + "firefox");
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		System.out.println("launching FireFox browser");
		FirefoxOptions FirefoxProfile = new FirefoxOptions();
		FirefoxProfile.addPreference("-apz.popups.enabled", true);
		//FirefoxProfile.addArguments("--safe-mode");
		//FirefoxProfile.addArguments("-profile", FFProfilePath);
		//FirefoxProfile.addArguments("-jsconsole");
		WebDriver FFQDriver = new FirefoxDriver(FirefoxProfile);
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		Capabilities caps = ((RemoteWebDriver) FFQDriver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();
		System.out.println("launching " + browserName + " " + browserVersion);	
		FFQDriver.manage().window().maximize();
		//FFQDriver.get("http://" + LogoPass + LentaURL);
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(mPanelXPATH));
		ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(containerXpath));
		FFQDriver.close();
	} 
	
	public static void FF() {
		System.setProperty("webdriver.firefox.bin", FFBinPath + "firefox");
		System.setProperty("webdriver.gecko.driver", driverPath + "geckodriver");
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		System.out.println("launching FireFox browser");
		FirefoxOptions FirefoxProfile = new FirefoxOptions();
		FirefoxProfile.addPreference("-apz.popups.enabled", true);
		//FirefoxProfile.addArguments("--safe-mode");
		//FirefoxProfile.addArguments("-profile", FFProfilePath);
		//FirefoxProfile.addArguments("-jsconsole");
		WebDriver FFDriver = new FirefoxDriver(FirefoxProfile);
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		Capabilities caps = ((RemoteWebDriver) FFDriver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();
		System.out.println("launching " + browserName + " " + browserVersion);	
		FFDriver.manage().window().maximize();
		//FFDriver.get("http://" + LogoPass + LentaURL);
		FFDriver.close();
	} 
	
	public static void Opera() {
		System.setProperty("webdriver.opera.bin", OBinPath + "opera");
		System.setProperty("webdriver.opera.driver", driverPath + "operadriver");
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		System.out.println("launching Opera browser");
		WebDriver ODriver = new OperaDriver();
		System.out.println("*******************");
		System.out.println("OS:	" + OSName + " " + OSVer + " " + OSArch);
		Capabilities caps = ((RemoteWebDriver) ODriver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getVersion();
		System.out.println("launching " + browserName + " " + browserVersion);	
		ODriver.manage().window().maximize();
		//ODriver.get("http://" + LogoPass + LentaURL);
		ODriver.close();
	}
}
