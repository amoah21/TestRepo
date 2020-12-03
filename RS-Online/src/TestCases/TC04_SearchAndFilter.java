/*
 * 
 */


package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.Products_Drills;

public class TC04_SearchAndFilter {
	  String driverPath = "F:\\Program Files\\Selenium\\chromedriver.exe";
	  WebDriver driver;
	  
	  Products_Drills objFilterBrand;
	  
	  @BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://uk.rs-online.com/web/c/power-tools-soldering-welding/power-tools/drills/");
	      driver.manage().window().maximize();		  
	  }
	  
	  
	  
	  @Test(priority=0)
	  public void FilterItems1() {
		  objFilterBrand = new Products_Drills(driver);
		  objFilterBrand.filterByBrand();


  }
	  
	  @Test(priority=1)
	  public void FilterItems2() throws Exception {
		  objFilterBrand = new Products_Drills(driver);
		  objFilterBrand.filterByBatteryCapacity();
		  
  }
	  
	  
	  @Test(priority=2)
	  public void RemoveFilter() {
		  objFilterBrand = new Products_Drills(driver);
		  objFilterBrand.removeAllFilters();

  }
}
