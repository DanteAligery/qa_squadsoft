package squad.compose;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class main_menu {
	static String driverPath = "/home/dante/QA/drivers/";
	public WebDriver Cdriver;
	//static String PageWidth;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver_2.34");
		System.out.println("*******************");
		System.out.println("Запуск Chrome");
		Cdriver = new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.get ("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/profile/5");
		
		//WebElement PageSize = Cdriver.findElement(By.xpath("//*[@id=\"DeltaPlaceHolderMain\"]"));
		//System.out.println("Высота страницы:	" + PageSize.getCssValue("height"));
		//System.out.println("Ширина страницы:	" + PageSize.getCssValue("width"));
		//String PageHeight = PageSize.getCssValue("height");
		//String PageWidth = PageSize.getCssValue("width");
	}
	
	@Test(groups = "Верстка. Шапка")
	public void title() {
		System.out.println("resolution" + Cdriver.manage().window().getSize());
		if (Cdriver.getTitle().equalsIgnoreCase("Главная страница"))
		{	
			System.out.println("Заголовок страницы:	" + Cdriver.getTitle());	
		}
		else
		{
			throw new RuntimeException ("Заголовок страницы  " + Cdriver.getTitle() + " Главная страница");
		}
		
	}
	
	
	@Test(groups = "Верстка. Шапка")
	public void header_H() {
		//ждем прогрузку шапки
		WebElement header = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div"));
		ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div"));
		if (header.getCssValue("height").equalsIgnoreCase("50px"))
		{	
			System.out.println("Высота шапки :		" + header.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота шапки " + header.getCssValue("height") + " не соответствует 50px");
		}
	}
	@Test(groups = "Верстка. Шапка")
	public void header_W() {
		//ждем прогрузку шапки
		WebElement PageSize = Cdriver.findElement(By.xpath("//*[@id=\"DeltaPlaceHolderMain\"]"));
		String PageWidth = PageSize.getCssValue("width");
		WebElement header = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div"));
		//ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div"));
		if (header.getCssValue("width").equalsIgnoreCase(PageWidth))
		{	
			System.out.println("Ширина шапки :		" + PageWidth);	
		}
		else
		{
			throw new RuntimeException ("Ширина шапки " + header.getCssValue("width") + " не соответствует " + PageWidth);
		}
	}	
	
	@Test(groups = "Верстка. Шапка")
	public void container_W() {
		//ждем прогрузку шапки
		//WebElement PageSize = Cdriver.findElement(By.xpath("//*[@id=\"DeltaPlaceHolderMain\"]"));
		//String PageWidth = PageSize.getCssValue("width");
		WebElement container = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div/div"));
		//ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div"));
		if (container.getCssValue("width").equalsIgnoreCase("1000px"))
		{	
			System.out.println("Ширина контейнера :		" + container.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина контейнера " + container.getCssValue("width") + " не соответствует 1000px");
		}
	}	
		
		/*
		//жмем кнопку меню
		WebElement main_menu_btn = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div/div/div[1]/div"));
		Actions ActivateMainMenu = new Actions(Cdriver);
		ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div/div/div[1]/div"));
		//ActivateMainMenu.moveToElement(main_menu_btn).build().perform();
		ActivateMainMenu.click(main_menu_btn);
		
		WebElement groups_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/squadspace-header/div/div/div[1]/div/div"));
		if (groups_title.getCssValue("height").equalsIgnoreCase("1024px"))
		{	
			System.out.println("Высота главного меню:		" + groups_title.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота главного меню " + groups_title.getCssValue("height") + " не соответствует 1024px");
		}
		
	}
	*/
	
	@AfterClass
	public void tearDown() {
		Cdriver.quit();
	}
	
}
