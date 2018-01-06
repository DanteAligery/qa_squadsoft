package squad;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import java.lang.String;


public class webdrv {
	static String ChromeProfilePath = "/home/dante/.config/google-chrome/SQUAD/";
	static String driverPath = "/home/dante/QA/";
	static ChromeDriver driver;
	
	
	public void Chromedrv(){
	System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.34");
	ChromeOptions ChromeProfile = new ChromeOptions();
	ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
	//ChromeProfile.addArguments("user-Data-Dir="+ChromeProfilePath);
	ChromeProfile.addArguments("disable-popup-blocking");
	//WebDriver Cdrv = new ChromeDriver(ChromeProfile);
	
	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	
	
	//WebDriver driver =new ChromeDriver(ChromeProfile);	
	//driver.manage().window().maximize();*/
	}
	/*
	static void ChromeProfile() {
		ChromeOptions ChromeProfile = new ChromeOptions();
		ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
		ChromeProfile.addArguments("user-Data-Dir=" + ChromeProfilePath);
		ChromeProfile.addArguments("disable-popup-blocking");
		}
		*/
		
}
