package squad;
//import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
import java.lang.String;


public class webdrv {
	static String ChromeProfilePath = "/home/dante/.config/google-chrome/SQUAD/";
	
	static ChromeDriver driver;
	static String driverPath = "/home/dante/QA/drivers/";
	public WebDriver Cdriver;
	
	public void Chromedrv(){
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.34");
		System.out.println("*******************");
		System.out.println("Запуск Chrome");
		Cdriver = new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.get ("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/profile/5");
	}	
}
