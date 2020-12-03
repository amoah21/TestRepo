package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Homepage;


public class TC01_QuickOrder {

  String driverPath = "F:\\Program Files\\Selenium\\chromedriver.exe";
  WebDriver driver;

  Homepage objQuickOrderRSNo;
  Homepage objQuickOrderQty;
  Homepage objAddToBasket;

  @BeforeTest
  public void setup(){
	System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://uk.rs-online.com/web/");
      driver.manage().window().maximize();

  }
  
  @Test(priority=0)
  public void InputStockNumbers() {
  objQuickOrderRSNo = new Homepage(driver);
  objQuickOrderRSNo.setRSQOstock("1229133", "313965");
  }
  
  @Test(priority=1)
  public void InputQuantity() {
  objQuickOrderQty = new Homepage(driver);	  
  objQuickOrderQty.setRSQOqty("2", "1");
  }
  
  @Test(priority=2)
  public void AddToBasket() {
	  objAddToBasket = new Homepage(driver);
	  objAddToBasket.clickAddToBasket();
  }
}

