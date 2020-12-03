/*
 * AS a customer
 * I WANT to use keywords to search for and sort a list of items 
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

public class TC03_SearchAndSort {
	  String driverPath = "F:\\Program Files\\Selenium\\chromedriver.exe";
	  WebDriver driver;
	  
	  SearchBar objItem;
	  Products_Ladders objSortBy;
	  Products_Ladders objSortBy1;
	  Products_Ladders objSortBy2;	  
	  
	  @BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://uk.rs-online.com/web/");
	      driver.manage().window().maximize();		  
	  }
	  
	  

	  
  @Test(priority=0)
  public void InputItem() {
	 objItem = new SearchBar(driver);
	 objItem.inputSearchItem("ladder");
	 objItem.clickSearchBtn();

  }
  
  @Test(priority=1)
  public void SortItemsByPrice() {
	 objSortBy = new Products_Ladders(driver);
	 objSortBy.sortByPrice();

  }
  
  @Test(priority=2)
  public void SortItemsByPopularity() {
	 objSortBy1 = new Products_Ladders(driver);
	 objSortBy1.sortByPopularity();

  }
  
  @Test(priority=3)
  public void SortItemsByRelevance() {
	 objSortBy2 = new Products_Ladders(driver);
	 objSortBy2.sortByRelevance();
	 
  }
  
  
  

  

}
