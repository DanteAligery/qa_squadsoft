package squad.compose;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import squad.webdriver;
import squad.virtPROXY;

public class lenta {
	
  @BeforeClass
  public static void setup() {
	  squad.virtPROXY.initProxy();
	  //squad.webdriver.Chrome();
	  //squad.webdriver.FF_Quantum();
	  //squad.webdriver.FF();
	  //squad.webdriver.Opera();
	  
  }

  
  
  @Test
  public void f() {
  }
  
  @AfterClass
  public void afterClass() {
  }

}
