package squad.compose;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;
import org.openqa.selenium.interactions.Actions;

public class profile_fonts {
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	public WebDriver Cdriver;
	@BeforeClass
	
	public void setup(){
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.35");
		System.out.println("*******************");
		System.out.println("Запуск Chrome");
		Cdriver = new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.get ("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/profile/5");
	}
	
	@Test
	public void name_fontfamily() {
		WebElement profile__name = Cdriver.findElement(By.className("profile__name"));
		ExpectedConditions.presenceOfElementLocated(By.className("profile__name"));
		//String fontfamily = profile__name.getCssValue("font-family");
		if (profile__name.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("	- Имя профиля. Семейство шрифта"		+ profile__name.getCssValue("font-family"));	
		}
		else
		{
			//throw new SkipException("");
			throw new RuntimeException ("Семейство шрифта в имени профиля не соответствует Open Sans, sans-serif");
		}
		}
	
	@Test
	public void name_fontsize(){
		WebElement profile__name = Cdriver.findElement(By.className("profile__name"));
		//System.out.println("	- Размер шрифта "		+ profile__name.getCssValue("font-size"));
		if (profile__name.getCssValue("font-size").equalsIgnoreCase("25px"))
		{	
			System.out.println("	- Имя профиля. Размер шрифта "		+ profile__name.getCssValue("font-size"));	
		}
		else
		{
			//throw new SkipException("");
			throw new RuntimeException ("Размер шрифтав имени профиля не соответствует значению 25px");
		}
	}
	
	@Test
	public void name_fontweight(){
		WebElement profile__name = Cdriver.findElement(By.className("profile__name"));
		//System.out.println("	- Размер шрифта "		+ profile__name.getCssValue("font-weight")); 
		if (profile__name.getCssValue("font-weight").equalsIgnoreCase("600"))
		{	
			System.out.println("	- Имя профиля. Толщина шрифта "		+ profile__name.getCssValue("font-weight"));	
		}
		else
		{
			//throw new SkipException("");
			throw new RuntimeException ("Толщина шрифта в имени профиля не соответствует значению 600");
		}
	}
	
	@Test
	public void photo_change_fontfamily(){
		//эмулируем наведение курсора
		WebElement photo_edit = Cdriver.findElement(By.className("profile-photo__edit")); 
		Actions ActivatePhoto = new Actions(Cdriver);
		ActivatePhoto.moveToElement(photo_edit).build().perform();
		
		WebElement photo_change = Cdriver.findElement(By.className("profile-photo__input-wrap"));
		
		if (photo_change.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("	- Изменение фото профиля. Семейство шрифта "		+ photo_change.getCssValue("font-family"));	
		}
		else
		{
			//throw new SkipException("");
			throw new RuntimeException ("Семейство шрифта в изменении фото профиля не соответствует Open Sans, sans-serif");
		}
		
	}
	
	@Test
	public void photo_change_fontsize(){
		WebElement photo_change = Cdriver.findElement(By.className("profile-photo__input-wrap"));
		
		if (photo_change.getCssValue("font-size").equalsIgnoreCase("14px"))
		{	
			System.out.println("	- Изменение фото профиля. Размер шрифта "		+ photo_change.getCssValue("font-size"));	
		}
		else
		{
			//throw new SkipException("");
			throw new RuntimeException ("Размер шрифтав в изменении фото профиля не соответствует значению 14px");
		}
	}
	
	@Test
	public void photo_change_fontweight(){
		WebElement photo_change = Cdriver.findElement(By.className("profile-photo__input-wrap"));
		//System.out.println("	- Размер шрифта "		+ profile__name.getCssValue("font-weight")); 
		if (photo_change.getCssValue("font-weight").equalsIgnoreCase("400"))
		{	
			System.out.println("	- Изменение фото профиля. Толщина шрифта "		+ photo_change.getCssValue("font-weight"));	
		}
		else
		{
			//throw new SkipException("");
			throw new RuntimeException ("Толщина шрифта в изменении фото профиля не соответствует значению 400");
		}
	}
	
	@Test
	public void photo_del_fontfamily(){
	WebElement photo_del = Cdriver.findElement(By.className("profile-photo__remove"));
	
	if (photo_del.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
	{	
		System.out.println("	- Удаление фото профиля. Семейство шрифта "		+ photo_del.getCssValue("font-family"));	
	}
	else
	{
		//throw new SkipException("");
		throw new RuntimeException ("Семейство шрифта в удалении фото профиля не соответствует Open Sans, sans-serif");
	}
	
}

@Test
public void photo_del_fontsize(){
	WebElement photo_del = Cdriver.findElement(By.className("profile-photo__remove"));
	
	if (photo_del.getCssValue("font-size").equalsIgnoreCase("14px"))
	{	
		System.out.println("	- Удаление фото профиля. Размер шрифта "		+ photo_del.getCssValue("font-size"));	
	}
	else
	{
		//throw new SkipException("");
		throw new RuntimeException ("Размер шрифтав в удалении фото профиля не соответствует значению 14px");
	}
}

@Test
public void photo_del_fontweight(){
	WebElement photo_del = Cdriver.findElement(By.className("profile-photo__remove"));
	//System.out.println("	- Размер шрифта "		+ profile__name.getCssValue("font-weight")); 
	if (photo_del.getCssValue("font-weight").equalsIgnoreCase("400"))
	{	
		System.out.println("	- Удаление фото профиля. Толщина шрифта "		+ photo_del.getCssValue("font-weight"));	
	}
	else
	{
		//throw new SkipException("");
		throw new RuntimeException ("Толщина шрифта в удалении фото профиля не соответствует значению 400");
	}
}
	
	@AfterClass
	public void tearDown() {
		Cdriver.quit();
	}
  
}

