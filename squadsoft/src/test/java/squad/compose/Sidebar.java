package squad.compose;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Sidebar {
	static String driverPath = "/home/dante/QA/squadsoft/driver/";
	public WebDriver Cdriver;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		System.out.println("*******************");
		System.out.println("Запуск Chrome");
		Cdriver = new ChromeDriver();
		Cdriver.manage().window().maximize();
		Cdriver.get ("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/profile/5");
	}
	

	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_H() {
		WebElement collegues = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div"));
		if (collegues.getCssValue("height").equalsIgnoreCase("110px"))
		{	
			System.out.println("Высота блока 'Коллеги':		"		+ collegues.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота блока 'Коллеги' " + collegues.getCssValue("height") + " не соответствует значению 110px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_W() {
		WebElement collegues = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div"));
		if (collegues.getCssValue("width").equalsIgnoreCase("340px"))
		{	
			System.out.println("Ширина блока 'Коллеги':		"		+ collegues.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина блока 'Коллеги' " + collegues.getCssValue("width") + " не соответствует значению 340px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_H() {
		WebElement collegues_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]"));
		if (collegues_title.getCssValue("height").equalsIgnoreCase("50px"))
		{	
			System.out.println("Высота заголовка блока 'Коллеги':		"		+ collegues_title.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота заголовка блока 'Коллеги' " + collegues_title.getCssValue("height") + " не соответствует значению 50px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_W() {
		WebElement collegues_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]"));
		if (collegues_title.getCssValue("width").equalsIgnoreCase("310px"))
		{	
			System.out.println("Ширина заголовка блока 'Коллеги':		"		+ collegues_title.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина заголовка блока 'Коллеги' " + collegues_title.getCssValue("width") + " не соответствует значению 310px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_name_H() {
		WebElement collegues_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/a"));
		if (collegues_title_name.getCssValue("height").equalsIgnoreCase("auto"))
		{	
			System.out.println("Высота поля названия заголовка блока 'Коллеги':		"		+ collegues_title_name.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота поля названия заголовка блока 'Коллеги' " + collegues_title_name.getCssValue("height") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_name_W() {
		WebElement collegues_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/a"));
		if (collegues_title_name.getCssValue("width").equalsIgnoreCase("auto"))
		{	
			System.out.println("Ширина поля названия заголовка блока 'Коллеги':		"		+ collegues_title_name.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина поля названия заголовка блока 'Коллеги' " + collegues_title_name.getCssValue("width") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_name_fontfamily() {
		WebElement collegues_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/a"));
		if (collegues_title_name.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("Семейство шрифта в поле названия заголовка блока 'Коллеги':		"		+ collegues_title_name.getCssValue("font-family"));	
		}
		else
		{
			throw new RuntimeException ("Семейство шрифта в поле названия заголовка блока 'Коллеги' " + collegues_title_name.getCssValue("font-family") + " не соответствует значению 'Open Sans, sans-serif'");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_name_fontsize() {
		WebElement collegues_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/a"));
		if (collegues_title_name.getCssValue("font-size").equalsIgnoreCase("12px"))
		{	
			System.out.println("Размер шрифта в поле названия заголовка блока 'Коллеги':		"		+ collegues_title_name.getCssValue("font-size"));	
		}
		else
		{
			throw new RuntimeException ("Размер шрифта в поле названия заголовка блока 'Коллеги' " + collegues_title_name.getCssValue("font-size") + " не соответствует значению 12px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_name_fontweight() {
		WebElement collegues_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/a"));
		if (collegues_title_name.getCssValue("font-weight").equalsIgnoreCase("700"))
		{	
			System.out.println("Толщина шрифта в поле названия заголовка блока 'Коллеги':		"		+ collegues_title_name.getCssValue("font-weight"));	
		}
		else
		{
			throw new RuntimeException ("Толщина шрифта в поле названия заголовка блока 'Коллеги' " + collegues_title_name.getCssValue("font-weight") + " не соответствует значению 700");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_count_H() {
		WebElement collegues_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/span"));
		if (collegues_title_count.getCssValue("height").equalsIgnoreCase("auto"))
		{	
			System.out.println("Высота поля счетчика коллег в заголовке блока 'Коллеги':		"		+ collegues_title_count.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота поля счетчика коллег в заголовке блока 'Коллеги' " + collegues_title_count.getCssValue("height") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_count_W() {
		WebElement collegues_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/span"));
		if (collegues_title_count.getCssValue("width").equalsIgnoreCase("auto"))
		{	
			System.out.println("Ширина поля счетчика коллег в заголовке блока 'Коллеги':		"		+ collegues_title_count.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина поля счетчика коллег в заголовке блока 'Коллеги' " + collegues_title_count.getCssValue("width") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_count_fontfamily() {
		WebElement collegues_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/span"));
		if (collegues_title_count.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("Семейство шрифта счетчика коллег в заголовке блока 'Коллеги':		"		+ collegues_title_count.getCssValue("font-family"));	
		}
		else
		{
			throw new RuntimeException ("Семейство шрифта счетчика коллег в заголовке блока 'Коллеги' " + collegues_title_count.getCssValue("font-family") + " не соответствует значению 'Open Sans, sans-serif'");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_count_fontsize() {
		WebElement collegues_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/span"));
		if (collegues_title_count.getCssValue("font-size").equalsIgnoreCase("12px"))
		{	
			System.out.println("Размер шрифта счетчика коллег в заголовке блока 'Коллеги':		"		+ collegues_title_count.getCssValue("font-size"));	
		}
		else
		{
			throw new RuntimeException ("Размер шрифта счетчика коллег в заголовке блока 'Коллеги' " + collegues_title_count.getCssValue("font-size") + " не соответствует значению 12px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_title_count_fontweight() {
		WebElement collegues_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/div/span"));
		if (collegues_title_count.getCssValue("font-weight").equalsIgnoreCase("400"))
		{	
			System.out.println("Толщина шрифта счетчика коллег в заголовке блока 'Коллеги':		"		+ collegues_title_count.getCssValue("font-weight"));	
		}
		else
		{
			throw new RuntimeException ("Толщина шрифта счетчика коллег в заголовке блока 'Коллеги' " + collegues_title_count.getCssValue("font-weight") + " не соответствует значению 700");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_H() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("height").equalsIgnoreCase("28px"))
		{	
			System.out.println("Высота кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("height") + " не соответствует значению '28px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_W() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("width").equalsIgnoreCase("28px"))
		{	
			System.out.println("Ширина кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("width") + " не соответствует значению '28px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BRTL() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-top-left-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления левого верхнего угла кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-top-left-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления левого верхнего угла кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-top-left-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BRTR() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-top-right-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления правого верхнего угла кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-top-right-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления правого верхнего угла кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-top-right-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BRBL() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-bottom-left-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления левого нижнего угла кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-bottom-left-radius"));	
		}
		else
		{
			throw new RuntimeException ("адиус скругления левого нижнего угла кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-bottom-left-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BRBR() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-bottom-right-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления правого нижнего угла кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-bottom-right-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления правого нижнего угла кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-bottom-right-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BLC() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-left-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет левого края кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-left-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет левого края кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-left-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BRC() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-right-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет правого края кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-right-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет правого края кнопки '+' в заголовке блока 'Коллеги'	" + collegues_plusBTN.getCssValue("border-right-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BTC() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-top-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет верхнего края кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-top-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет верхнего края кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-top-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_BBC() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("border-bottom-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет нижнего края кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("border-bottom-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет нижнеого края кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("border-bottom-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_bgcolor() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("background-color").equalsIgnoreCase("rgba(255, 255, 255, 1)"))
		{	
			System.out.println("Цвет заливки кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("background-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет заливки кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("background-color") + " не соответствует значению 'rgba(255, 255, 255, 1)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_collegues_plusBTN_shadow() {
		WebElement collegues_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/colleagues/div/div[1]/a"));
		if (collegues_plusBTN.getCssValue("box-shadow").equalsIgnoreCase("rgba(70, 165, 237, 0.27) 0px 2px 6px 0px"))
		{	
			System.out.println("Отрисовка тени кнопки '+' в заголовке блока 'Коллеги':		"		+ collegues_plusBTN.getCssValue("box-shadow"));	
		}
		else
		{
			throw new RuntimeException ("Отрисовка тени кнопки '+' в заголовке блока 'Коллеги' " + collegues_plusBTN.getCssValue("box-shadow") + " не соответствует значению 'rgba(70, 165, 237, 0.27) 0px 2px 6px 0px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_W() {
		//карточка профиля
		WebElement groups = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div"));
		//определяем размеры
		if (groups.getCssValue("width").equalsIgnoreCase("340px"))
		{	
			System.out.println("Ширина блока 'Группы':		" + groups.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина блока 'Группы' " + groups.getCssValue("width") + " не соответствует 340px");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_H() {
		//карточка профиля
		WebElement groups = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div"));
		//определяем размеры
		if (groups.getCssValue("height").equalsIgnoreCase("176px"))
		{	
			System.out.println("Высота блока 'Группы':		" + groups.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота блока 'Группы' " + groups.getCssValue("height") + " не соответствует 176px");
		}
	}
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_W() {
		//карточка профиля
		WebElement groups_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]"));
		//определяем размеры
		if (groups_title.getCssValue("width").equalsIgnoreCase("310px"))
		{	
			System.out.println("Ширина заголовка блока 'Группы':		" + groups_title.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина заголовка блока 'Группы' " + groups_title.getCssValue("width") + " не соответствует 310px");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_H() {
		//карточка профиля
		WebElement groups_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]"));
		//определяем размеры
		if (groups_title.getCssValue("height").equalsIgnoreCase("50px"))
		{	
			System.out.println("Высота заголовка блока 'Группы':		" + groups_title.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота заголовка блока 'Группы' " + groups_title.getCssValue("height") + " не соответствует 50px");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_name_H() {
		WebElement groups_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/a"));
		if (groups_title_name.getCssValue("height").equalsIgnoreCase("auto"))
		{	
			System.out.println("Высота поля названия заголовка блока 'Группы':		"		+ groups_title_name.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота поля названия заголовка блока 'Группы' " + groups_title_name.getCssValue("height") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_name_W() {
		WebElement groups_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/a"));
		if (groups_title_name.getCssValue("width").equalsIgnoreCase("auto"))
		{	
			System.out.println("Ширина поля названия заголовка блока 'Группы':		"		+ groups_title_name.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина поля названия заголовка блока 'Группы' " + groups_title_name.getCssValue("width") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_name_fontfamily() {
		WebElement groups_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/a"));
		if (groups_title_name.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("Семейство шрифта в поле названия заголовка блока 'Группы':		"		+ groups_title_name.getCssValue("font-family"));	
		}
		else
		{
			throw new RuntimeException ("Семейство шрифта в поле названия заголовка блока 'Группы' " + groups_title_name.getCssValue("font-family") + " не соответствует значению 'Open Sans, sans-serif'");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_name_fontsize() {
		WebElement groups_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/a"));
		if (groups_title_name.getCssValue("font-size").equalsIgnoreCase("12px"))
		{	
			System.out.println("Размер шрифта в поле названия заголовка блока 'Группы':		"		+ groups_title_name.getCssValue("font-size"));	
		}
		else
		{
			throw new RuntimeException ("Размер шрифта в поле названия заголовка блока 'Группы' " + groups_title_name.getCssValue("font-size") + " не соответствует значению 12px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_name_fontweight() {
		WebElement groups_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/a"));
		if (groups_title_name.getCssValue("font-weight").equalsIgnoreCase("700"))
		{	
			System.out.println("Толщина шрифта в поле названия заголовка блока 'Группы':		"		+ groups_title_name.getCssValue("font-weight"));	
		}
		else
		{
			throw new RuntimeException ("Толщина шрифта в поле названия заголовка блока 'Группы' " + groups_title_name.getCssValue("font-weight") + " не соответствует значению 700");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_count_H() {
		WebElement groups_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/span"));
		if (groups_title_count.getCssValue("height").equalsIgnoreCase("auto"))
		{	
			System.out.println("Высота поля счетчика коллег в заголовке блока 'Группы':		"		+ groups_title_count.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота поля счетчика коллег в заголовке блока 'Группы' " + groups_title_count.getCssValue("height") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_count_W() {
		WebElement groups_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/span"));
		if (groups_title_count.getCssValue("width").equalsIgnoreCase("auto"))
		{	
			System.out.println("Ширина поля счетчика коллег в заголовке блока 'Группы':		"		+ groups_title_count.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина поля счетчика коллег в заголовке блока 'Группы' " + groups_title_count.getCssValue("width") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_count_fontfamily() {
		WebElement groups_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/span"));
		if (groups_title_count.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("Семейство шрифта счетчика коллег в заголовке блока 'Группы':		"		+ groups_title_count.getCssValue("font-family"));	
		}
		else
		{
			throw new RuntimeException ("Семейство шрифта счетчика коллег в заголовке блока 'Группы' " + groups_title_count.getCssValue("font-family") + " не соответствует значению 'Open Sans, sans-serif'");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_count_fontsize() {
		WebElement groups_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/span"));
		if (groups_title_count.getCssValue("font-size").equalsIgnoreCase("12px"))
		{	
			System.out.println("Размер шрифта счетчика коллег в заголовке блока 'Группы':		"		+ groups_title_count.getCssValue("font-size"));	
		}
		else
		{
			throw new RuntimeException ("Размер шрифта счетчика коллег в заголовке блока 'Группы' " + groups_title_count.getCssValue("font-size") + " не соответствует значению 12px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_title_count_fontweight() {
		WebElement groups_title_count = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/div/span"));
		if (groups_title_count.getCssValue("font-weight").equalsIgnoreCase("400"))
		{	
			System.out.println("Толщина шрифта счетчика коллег в заголовке блока 'Группы':		"		+ groups_title_count.getCssValue("font-weight"));	
		}
		else
		{
			throw new RuntimeException ("Толщина шрифта счетчика коллег в заголовке блока 'Группы' " + groups_title_count.getCssValue("font-weight") + " не соответствует значению 700");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_H() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("height").equalsIgnoreCase("28px"))
		{	
			System.out.println("Высота кнопки '+' в заголовке блока 'Коллеги':		"		+ groups_plusBTN.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота кнопки '+' в заголовке блока 'Коллеги' " + groups_plusBTN.getCssValue("height") + " не соответствует значению '28px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_W() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("width").equalsIgnoreCase("28px"))
		{	
			System.out.println("Ширина кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("width") + " не соответствует значению '28px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BRTL() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-top-left-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления левого верхнего угла кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-top-left-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления левого верхнего угла кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-top-left-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BRTR() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-top-right-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления правого верхнего угла кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-top-right-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления правого верхнего угла кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-top-right-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BRBL() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-bottom-left-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления левого нижнего угла кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-bottom-left-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления левого нижнего угла кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-bottom-left-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BRBR() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-bottom-right-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления правого нижнего угла кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-bottom-right-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления правого нижнего угла кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-bottom-right-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BLC() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-left-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет левого края кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-left-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет левого края кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-left-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BRC() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-right-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет правого края кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-right-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет правого края кнопки '+' в заголовке блока 'Группы'	" + groups_plusBTN.getCssValue("border-right-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BTC() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-top-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет верхнего края кнопки '+' в заголовке блока 'Группы':		"		+ groups_plusBTN.getCssValue("border-top-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет верхнего края кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-top-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_BBC() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("border-bottom-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет нижнего края кнопки '+' в заголовке блока 'Группы':		" + groups_plusBTN.getCssValue("border-bottom-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет нижнеого края кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("border-bottom-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_bgcolor() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("background-color").equalsIgnoreCase("rgba(255, 255, 255, 1)"))
		{	
			System.out.println("Цвет заливки кнопки '+' в заголовке блока 'Группы':		" + groups_plusBTN.getCssValue("background-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет заливки кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("background-color") + " не соответствует значению 'rgba(255, 255, 255, 1)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_groups_plusBTN_shadow() {
		WebElement groups_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/groups/div/div[1]/a"));
		if (groups_plusBTN.getCssValue("box-shadow").equalsIgnoreCase("rgba(70, 165, 237, 0.27) 0px 2px 6px 0px"))
		{	
			System.out.println("Отрисовка тени кнопки '+' в заголовке блока 'Группы':		" + groups_plusBTN.getCssValue("box-shadow"));	
		}
		else
		{
			throw new RuntimeException ("Отрисовка тени кнопки '+' в заголовке блока 'Группы' " + groups_plusBTN.getCssValue("box-shadow") + " не соответствует значению 'rgba(70, 165, 237, 0.27) 0px 2px 6px 0px'");
		}
	}
	
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_UserFiles_W() {
		//карточка профиля
		WebElement files = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div"));
		//определяем размеры
		if (files.getCssValue("width").equalsIgnoreCase("340px"))
		{	
			System.out.println("Ширина блока 'Файлы':		" + files.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина блока 'Файлы' " + files.getCssValue("width") + " не соответствует 340px");
		}
	}
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_UserFiles_H() {
		//карточка профиля
		WebElement files = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div"));
		//определяем размеры
		if (files.getCssValue("height").equalsIgnoreCase("208px"))
		{	
			System.out.println("Высота блока 'Файлы':		" + files.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота блока 'Файлы' " + files.getCssValue("height") + " не соответствует 208px");
		}
	}
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_UserFiles_title_W() {
		//карточка профиля
		WebElement files_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]"));
		//определяем размеры
		if (files_title.getCssValue("width").equalsIgnoreCase("310px"))
		{	
			System.out.println("Ширина заголовка блока 'Файлы':		" + files_title.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина заголовка блока 'Файлы' " + files_title.getCssValue("width") + " не соответствует 310px");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_UserFiles_title_H() {
		//карточка профиля
		WebElement files_title = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]"));
		//определяем размеры
		if (files_title.getCssValue("height").equalsIgnoreCase("50px"))
		{	
			System.out.println("Высота заголовка блока 'Файлы':		" + files_title.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота заголовка блока 'Файлы' " + files_title.getCssValue("height") + " не соответствует 50px");
		}
	}
	
	public void sidebar_files_title_name_H() {
		WebElement files_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[2]/a"));
		if (files_title_name.getCssValue("height").equalsIgnoreCase("auto"))
		{	
			System.out.println("Высота поля названия заголовка блока 'Файлы':		"		+ files_title_name.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота поля названия заголовка блока 'Файлы' " + files_title_name.getCssValue("height") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_title_name_W() {
		WebElement files_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[2]/a"));
		if (files_title_name.getCssValue("width").equalsIgnoreCase("auto"))
		{	
			System.out.println("Ширина поля названия заголовка блока 'Файлы':		"		+ files_title_name.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина поля названия заголовка блока 'Файлы' " + files_title_name.getCssValue("width") + " не соответствует значению auto");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_title_name_fontfamily() {
		WebElement files_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[2]/a"));
		if (files_title_name.getCssValue("font-family").equalsIgnoreCase("\"Open Sans\", sans-serif"))
		{	
			System.out.println("Семейство шрифта в поле названия заголовка блока 'Файлы':		"		+ files_title_name.getCssValue("font-family"));	
		}
		else
		{
			throw new RuntimeException ("Семейство шрифта в поле названия заголовка блока 'Файлы' " + files_title_name.getCssValue("font-family") + " не соответствует значению 'Open Sans, sans-serif'");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_title_name_fontsize() {
		WebElement files_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[2]/a"));
		if (files_title_name.getCssValue("font-size").equalsIgnoreCase("12px"))
		{	
			System.out.println("Размер шрифта в поле названия заголовка блока 'Файлы':		"		+ files_title_name.getCssValue("font-size"));	
		}
		else
		{
			throw new RuntimeException ("Размер шрифта в поле названия заголовка блока 'Файлы' " + files_title_name.getCssValue("font-size") + " не соответствует значению 12px");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_title_name_fontweight() {
		WebElement files_title_name = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[2]/a"));
		if (files_title_name.getCssValue("font-weight").equalsIgnoreCase("700"))
		{	
			System.out.println("Толщина шрифта в поле названия заголовка блока 'Файлы':		"		+ files_title_name.getCssValue("font-weight"));	
		}
		else
		{
			throw new RuntimeException ("Толщина шрифта в поле названия заголовка блока 'Файлы' " + files_title_name.getCssValue("font-weight") + " не соответствует значению 700");
		}	
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_H() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("height").equalsIgnoreCase("28px"))
		{	
			System.out.println("Высота кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("height"));	
		}
		else
		{
			throw new RuntimeException ("Высота кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("height") + " не соответствует значению '28px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_W() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("width").equalsIgnoreCase("28px"))
		{	
			System.out.println("Ширина кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("width"));	
		}
		else
		{
			throw new RuntimeException ("Ширина кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("width") + " не соответствует значению '28px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_BRTL() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-top-left-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления левого верхнего угла кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-top-left-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления левого верхнего угла кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-top-left-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_BRTR() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-top-right-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления правого верхнего угла кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-top-right-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления правого верхнего угла кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-top-right-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_BRBL() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-bottom-left-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления левого нижнего угла кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-bottom-left-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления левого нижнего угла кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-bottom-left-radius") + " не соответствует значению '3px'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_BRBR() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-bottom-right-radius").equalsIgnoreCase("3px"))
		{	
			System.out.println("Радиус скругления правого нижнего угла кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-bottom-right-radius"));	
		}
		else
		{
			throw new RuntimeException ("Радиус скругления правого нижнего угла кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-bottom-right-radius") + " не соответствует значению '3px'");
		}
	}
	
	public void sidebar_files_plusBTN_BLC() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-left-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет левого края кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-left-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет левого края кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-left-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_BRC() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-right-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет правого края кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-right-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет правого края кнопки '+' в заголовке блока 'Файлы'	" + files_plusBTN.getCssValue("border-right-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_files_plusBTN_BTC() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-top-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет верхнего края кнопки '+' в заголовке блока 'Файлы':		"		+ files_plusBTN.getCssValue("border-top-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет верхнего края кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-top-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_filesplusBTN_BBC() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("border-bottom-color").equalsIgnoreCase("rgba(70, 165, 237, 0.23)"))
		{	
			System.out.println("Цвет нижнего края кнопки '+' в заголовке блока 'Группы':		" + files_plusBTN.getCssValue("border-bottom-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет нижнеого края кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("border-bottom-color") + " не соответствует значению 'rgba(70, 165, 237, 0.23)'");
		}
	}
	
	@Test(groups = "Верстка. Sidebar")
	public void sidebar_filesplusBTN_bgcolor() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("background-color").equalsIgnoreCase("rgba(255, 255, 255, 1)"))
		{	
			System.out.println("Цвет заливки кнопки '+' в заголовке блока 'Группы':		" + files_plusBTN.getCssValue("background-color"));	
		}
		else
		{
			throw new RuntimeException ("Цвет заливки кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("background-color") + " не соответствует значению 'rgba(255, 255, 255, 1)'");
		}
	}
	
		
	public void sidebar_filesplusBTN_shadow() {
		WebElement files_plusBTN = Cdriver.findElement(By.xpath("/html/body/form/div[5]/app-squadspace/div/app-profile-view/div[1]/user-files/div/div[1]/div[1]/app-files-menu/div"));
		if (files_plusBTN.getCssValue("box-shadow").equalsIgnoreCase("rgba(70, 165, 237, 0.27) 0px 2px 6px 0px"))
		{	
			System.out.println("Отрисовка тени кнопки '+' в заголовке блока 'Группы':		" + files_plusBTN.getCssValue("box-shadow"));	
		}
		else
		{
			throw new RuntimeException ("Отрисовка тени кнопки '+' в заголовке блока 'Файлы' " + files_plusBTN.getCssValue("box-shadow") + " не соответствует значению 'rgba(70, 165, 237, 0.27) 0px 2px 6px 0px'");
		}
	}
	
	
	
	@AfterClass
	public void tearDown() {
		Cdriver.quit();
	}

}
