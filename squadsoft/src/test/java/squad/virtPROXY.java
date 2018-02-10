package squad;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import net.lightbody.bmp.proxy.auth.AuthType;
import net.lightbody.bmp.BrowserMobProxy;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class virtPROXY {
	private static BrowserMobProxyServer server;
	static String LentaURL = "http://test-squadspace.squadsoft.ru";
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	
	public static void initProxy() {
		//System.setProperty("bmp.allowNativeDnsFallback", "true");
		//System.setProperty("Djava.net.preferIPv4Stack", "true");
		BrowserMobProxyServer server = new BrowserMobProxyServer();
		Har har = server.newHar();
	
		server.start();
		System.out.println("Proxy завелся? " + server.isStarted());
		System.out.println("Порт proxy " + server.getPort());
		server.addHeader("WWW-Authenticate", "Basic");
		//server.addHeader("Authorization.Type", "Basic");
		server.addHeader("Authorization", "bGVzbmlrb3Y6cW9PNVFPRTk");

		System.out.println(server.getAllHeaders());
		//server.getAllHeaders();
		//server.autoAuthorization("ru", "squadsoft/lesnikov", "qoO5QOE9", AuthType.BASIC);
		Proxy Proxy = ClientUtil.createSeleniumProxy(server);
		
		try {
			InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		ChromeOptions ChromeProfile = new ChromeOptions();
		//ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
		//ChromeProfile.addArguments("disable-popup-blocking");
		//ChromeProfile.addArguments("--proxy-server=127.0.0.1:" + server.getPort());
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.PROXY, Proxy);
		capabilities.setCapability(ChromeOptions.CAPABILITY, ChromeProfile);
		System.out.println("Запуск браузера");
		WebDriver Cdriver= new ChromeDriver(ChromeProfile);
		//server.enableHarCaptureTypes(CaptureType.REQUEST_CONTENT, CaptureType.RESPONSE_CONTENT);
		Cdriver.manage().window().maximize();
		System.out.println(server.getHar());
		//server.getHar();
		System.out.println("window run");
	
		Cdriver.get(LentaURL);
		//Actions sendK = new Actions (Cdriver); 
		//sendK.sendKeys("lesnikov");
		server.stop();
		
	}
	 public static void stopProxy() {
		 //server.stop();
		 System.out.println("Proxy остановлен");
	 }
}
