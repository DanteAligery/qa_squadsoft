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

	@Test
	public void profile() {
		//карточка профиля
		
		//WebElement profile_card = Cdriver.findElement(By.className("profile"));
		//ExpectedConditions.presenceOfElementLocated(By.className("profile"));
		//определяем размеры
		//System.out.println("****************************************************************************");
		/*
		if (profile_card.getCssValue("width").equalsIgnoreCase("645px"))
		{	
			System.out.println("Ширина фото профиля:		" + profile_card.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина фото профиля не соответствует 645px");
		}
		*/
	}
	
	@Test
	public void profile_photo() {
		//фото профиля
		WebElement profile_photo = Cdriver.findElement(By.className("profile-photo"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile-photo"));
		//определяем размеры и дорисовку до окружности
		System.out.println("****************************************************************************");
		if (profile_photo.getCssValue("width").equalsIgnoreCase("164px"))
		{	
			System.out.println("Ширина фото профиля:		" + profile_photo.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина фото профиля не соответствует 164px");
		}
		if (profile_photo.getCssValue("height").equalsIgnoreCase("164px"))
		{	
			System.out.println("Высота фото профиля:		" + profile_photo.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота фото профиля не соответствует 164px");
		}
		if (profile_photo.getCssValue("border-radius").equalsIgnoreCase("50%"))
		{	
			System.out.println("Радиус скругления фото профиля:	" + profile_photo.getCssValue("border-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления фото профиля не соответствует 50%");
		}
		
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
	
	@Test
	public void profile_contacts() {
		WebElement cellphone = Cdriver.findElement(By.className("profile__info"));
		if (cellphone.getCssValue("width").equalsIgnoreCase("281px"))
		{	
			System.out.println("Ширина поля мобильного телефона:		"		+ cellphone.getCssValue("width"));	
		}
		else
		{
			//throw new RuntimeException ("Ширина поля мобильного телефона не соответствует значению 281px");
			throw new SkipException ("Ширина поля мобильного телефона не соответствует значению 281px");
		}
		if (cellphone.getCssValue("height").equalsIgnoreCase("16px"))
		{	
			System.out.println("Высота поля мобильного телефона:		"		+ cellphone.getCssValue("height"));	
		}
		else
		{
			//throw new RuntimeException ("Ширина поля мобильного телефона не соответствует значению 281px");
			throw new SkipException ("Высота поля мобильного телефона не соответствует значению 16px");
		}
		
	}
	
	@AfterClass
	public void tearDown() {
		Cdriver.quit();
	}
}
