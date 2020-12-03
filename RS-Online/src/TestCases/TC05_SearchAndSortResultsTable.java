/*
 * AS a customer
 * I WANT sort my narrowed product search by specific product related criteria 
 * SO that I can make an informed decision about my purchase 
 * 
 */

package TestCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.SearchBar;
import PageObjects.Products_Ladders;

public class TC05_SearchAndSortResultsTable {
	  String driverPath = "F:\\Program Files\\Selenium\\chromedriver.exe";
	  WebDriver driver;
	  
	  SearchBar objItem;
	  Products_Ladders objSortBy;

	  
	  
	  @BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://uk.rs-online.com/web/c/access-storage-material-handling"
	      		+ "/ladders-steps/extension-ladders/");
	      driver.manage().window().maximize();	

	  }
	  
  @Test(priority=0)
  public void SortResultsTablesThread() {
	 objSortBy = new Products_Ladders(driver);
	 objSortBy.sortByResultsTable_Thread();

  }
  
  
  @Test(priority=2)
  public void SortResultsTablesClosedLength() {
	 objSortBy = new Products_Ladders(driver);
	 objSortBy.sortByResultsTable_ClosedLength();

  }
  

}
