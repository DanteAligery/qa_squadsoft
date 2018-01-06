package squad;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import squad.webdrv.*;

public class chrome {
	/*
	static String driverPath = "/home/dante/QA/";
	public WebDriver driver;
	*/
	static String ChromeProfilePath = "/home/dante/.config/google-chrome/SQUAD/";
	static String driverPath = "/home/dante/QA/";
	//static ChromeDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.34");
		System.out.println("*******************");
		System.out.println("launching chrome browser");
		/*
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		ChromeOptions ChromeProfile = new ChromeOptions();
		String ChromeProfilePath = "/home/dante/.config/google-chrome/SQUAD/";
		ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
		ChromeProfile.addArguments("user-Data-Dir=" + ChromeProfilePath);
		driver = new ChromeDriver(ChromeProfile);
		driver.manage().window().maximize();
		*/
		ChromeOptions ChromeProfile = new ChromeOptions();
		ChromeProfile.addArguments("chrome.switches", "--disable-extensions");
		//ChromeProfile.addArguments("user-Data-Dir="+ChromeProfilePath);
		ChromeProfile.addArguments("disable-popup-blocking");
		
		
		WebDriver driver= new ChromeDriver(ChromeProfile);
		driver.manage().window().maximize();
		driver.get("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/");
		/*		
		
		//ищем элементы
		//input лента
		WebElement news_input = driver.findElement(By.className("input-comment")); 		
		ExpectedConditions.presenceOfElementLocated(By.className("input-comment"));
		
		
		
		//публикуем каммент
		news_input.sendKeys("test");
		//кнопка опубликовать
		WebElement news_publucate = driver.findElement(By.xpath("html/body/form/div[5]/app-squadspace/div/app-profile-view/div[2]/app-user-feed/app-post-new/div/div/div[2]/div/button[2]"));
		ExpectedConditions.presenceOfElementLocated(By.className("news_publucate"));
		news_publucate.click();
		
		*/
		//идем в профиль
		driver.get("http://test-squadspace.squadsoft.ru/default.aspx/profile/5");
		WebElement profile = driver.findElement(By.className("profile"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile"));
		
		WebElement profile__name = driver.findElement(By.className("profile__name"));
		//WebElement profile__name = driver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[2]/app-profile-feed-view/app-user-card/div/div/div[2]"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile__name"));
		
		
		System.out.println("	- Семейство шрифта"		+ profile__name.getCssValue("font-family"));
		System.out.println("	- Размер шрифта "		+ profile__name.getCssValue("font-size"));
		//System.out.println("	- Насыщенность шрифта"	+ profile__name.getCssValue("font-weight"));
		
	}
	


  
  @Test
public void test() {
	  
	  
	  
	  //squad.webdrv.driver.get("ya.ru");
	
	  	
		//driver.navigate().to("http://www.google.com");
		//String strPageTitle = webdrv.driver.getTitle();
		//System.out.println("Page title: - "+strPageTitle);
		//Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
		
  }
  
	@AfterClass
	public void tearDown() {
		if(webdrv.driver!=null) {
			System.out.println("Closing chrome browser");
			webdrv.driver.quit();
		}
	}
	
}
