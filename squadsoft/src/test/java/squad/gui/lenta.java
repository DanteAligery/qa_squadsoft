package squad.gui;

import org.testng.annotations.Test;
import squad.webdriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;

public class lenta {
	
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	public static WebDriver Cdriver;
	static String comment_block = "/html/body/form/div[5]/app-intry/div/app-profile-view/div[2]";
	
  @BeforeClass
  public static void setup() throws Exception{
	  //squad.webdriver.Chrome();
	  //squad.virtPROXY.proxy();;
	  //squad.webdriver.Chrome();
	  //squad.webdriver.FF_Quantum();.
	  //squad.webdriver.FF();
	  //squad.webdriver.Opera();
	  System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
	  System.out.println("*******************");
	  System.out.println("Запуск Chrome");
	  Cdriver = new ChromeDriver();
	  Cdriver.manage().window().maximize();
	  Cdriver.get ("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/");
  }
  ///html/body/form/div[5]/app-intry/div/app-profile-view/div[2] - блок комментариев
  ///html/body/form/div[5]/app-intry/div/app-profile-view/div[2]/app-user-feed/app-post-new/div/div/div[1]/app-editor/div/div[1] - инпут комментария
  
  @Test // наличие блока комментариев
  public void exist_comment_block() {
	  if (ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(comment_block)) != null)
		{	
			System.out.println("Блок комментариев присутствует");	
		}
		else
		{
			throw new RuntimeException ("Блок комментариев присутствует");
		}
  }
  @Test
  public void exist_comment_block_photo() {
	  WebElement profile_card = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-intry/div/app-profile-view/div[2]/app-user-feed/app-post-new/div/div/div[1]/app-editor/div/div[1]")); 
  }
  
  @AfterClass
  public void afterClass() {
	  Cdriver.quit();
  }

}
