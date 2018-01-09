package squad.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.Color;


public class elements {
	static String driverPath = "/home/dante/QA/drivers/";
	public WebDriver Cdriver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.34");
		System.out.println("*******************");
		System.out.println("Запуск Chrome");
		Cdriver = new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.get ("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/profile/5");
		
	}

	@Test (groups = "Верстка. Профиль")
	public void profile_card_W() {
		//карточка профиля
		WebElement profile_card = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[2]/app-profile-feed-view/app-user-card/div"));
		ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[2]/app-profile-feed-view/app-user-card/div"));
		//определяем размеры
		if (profile_card.getCssValue("width").equalsIgnoreCase("644px"))
		{	
			System.out.println("Ширина карточки профиля:		" + profile_card.getCssValue("width"));	
		}
		else
		{
			throw new SkipException ("Ширина карточки профиля " + profile_card.getCssValue("width") + " не соответствует 644px");
		}
			
	}
	@Test(groups = "Верстка. Профиль")
	public void profile_card_H() {
		//карточка профиля
		WebElement profile_card = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[2]/app-profile-feed-view/app-user-card/div"));
		ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[2]/app-profile-feed-view/app-user-card/div"));
		//определяем размеры
		if (profile_card.getCssValue("height").equalsIgnoreCase("332px"))
		{	
			System.out.println("Высота карточки профиля:		" + profile_card.getCssValue("height"));	
		}
		else
		{
			throw new SkipException ("Высота карточки профиля " + profile_card.getCssValue("height") + " не соответствует 332px");
		}
	}
	@Test (groups = "Верстка. Профиль") //фото профиля. Ширина
	public void profile_photo_W() {
		WebElement profile_photo = Cdriver.findElement(By.className("profile-photo"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile-photo"));
		System.out.println("****************************************************************************");
		if (profile_photo.getCssValue("width").equalsIgnoreCase("164px"))
		{	
			System.out.println("Ширина фото профиля:		" + profile_photo.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина фото профиля " + profile_photo.getCssValue("width") + " не соответствует 164px");
		}
	}	
			
	@Test(groups = "Верстка. Профиль") //фото профиля. Высота
	public void profile_photo_H() {
		WebElement profile_photo = Cdriver.findElement(By.className("profile-photo"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile-photo"));
		System.out.println("****************************************************************************");
		if (profile_photo.getCssValue("height").equalsIgnoreCase("164px"))
		{	
			System.out.println("Высота фото профиля:		" + profile_photo.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота фото профиля " + profile_photo.getCssValue("height") + " не соответствует 164px");
		}
		
	}
	@Test (groups = "Верстка. Профиль") //фото профиля. радиус скругления
		public void profile_photo_BR() {
			WebElement profile_photo = Cdriver.findElement(By.className("profile-photo"));
			ExpectedConditions.presenceOfElementLocated(By.className("profile-photo"));
			System.out.println("****************************************************************************");
			
			if (profile_photo.getCssValue("border-radius").equalsIgnoreCase("50%"))
			{	
				System.out.println("Радиус скругления фото профиля:	" + profile_photo.getCssValue("border-radius"));	
			}
			else
			{
				throw new RuntimeException ("Радиус скругления фото профиля" + profile_photo.getCssValue("border-radius") + "не соответствует 50%");
			}
	}
	/*
		WebElement photo_edit = Cdriver.findElement(By.className("profile-photo__edit"));
		Actions ActivatePhoto = new Actions(Cdriver);
		ActivatePhoto.moveToElement(photo_edit).build().perform();
		
		WebElement h = Cdriver.findElement(By.className("profile-photo__edit:hover"));
		WebElement h1 = Cdriver.findElement(By.className("profile__photo:hover"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile-photo__edit:hover"));
		
		System.out.println( "opacity:			" + h1.getCssValue("opacity"));
		System.out.println( "background-color:		" + h.getCssValue("background-color"));
		System.out.println( "border-color:			" + h.getCssValue("border-color"));	
		System.out.println( "border-top-color:		" + h.getCssValue("border-top-color"));
		System.out.println( "border-right-color:		" + h.getCssValue("border-right-color"));
		System.out.println( "border-bottom-color:		" + h.getCssValue("border-bottom-color"));
		System.out.println( "border-left-color:		" + h.getCssValue("border-left-color"));
  }
	*/
	@Test(groups = "Верстка. Профиль")
	public void profile_contacts_cellphone_W() {
		WebElement cellphone = Cdriver.findElement(By.className("profile__info"));
		if (cellphone.getCssValue("width").equalsIgnoreCase("281px"))
		{	
			System.out.println("Ширина поля мобильного телефона:		"		+ cellphone.getCssValue("width"));	
		}
		else
		{
			throw new SkipException ("Ширина поля мобильного телефона " + cellphone.getCssValue("width") + " не соответствует значению 281px");
		}
	}
	
	@Test(groups = "Верстка. Профиль")
	public void profile_contacts_cellphone_H() {
		WebElement cellphone = Cdriver.findElement(By.className("profile__info"));
		if (cellphone.getCssValue("height").equalsIgnoreCase("16px"))
		{	
			System.out.println("Высота поля мобильного телефона:		"		+ cellphone.getCssValue("height"));	
		}
		else
		{
			throw new SkipException ("Высота поля мобильного телефона " + cellphone.getCssValue("height") + " не соответствует значению 16px");
		}	
	}
	
	@AfterClass
	public void tearDown() {
		Cdriver.quit();
	}
}
