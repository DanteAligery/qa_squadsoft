package squad;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FF {
	static WebDriver driver;

	
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "/home/dante/QA/drivers/geckodriver_0.19.1");
	  driver = new FirefoxDriver();
	  driver.get("http://lesnikov:qoO5QOE9@test-squadspace.squadsoft.ru/default.aspx/");
	  //driver.navigate().to("ftghjkl");
  }
}
