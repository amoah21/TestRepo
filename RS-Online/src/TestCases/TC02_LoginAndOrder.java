/*
 * 
 */

package TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjects.Homepage;
import PageObjects.Login;
import PageObjects.Menu;
import PageObjects.Basket;
import PageObjects.Products_BC;
import PageObjects.Products_BCA;
import PageObjects.Products_BCA_Leads;

public class TC02_LoginAndOrder {
	  String driverPath = "F:\\Program Files\\Selenium\\chromedriver.exe";
	  WebDriver driver;
	    
	  Homepage objLoginH;
	  Login objCredentials;
	  Login objLoginL;
	  Menu objSelectItem;
	  Basket objUpdateQTY;
	 
	  Products_BC objSelectItemBC;
	  Products_BCA objSelectItemBCA;
	  Products_BCA_Leads objSelectItemBCA_Leads;
	  Products_BCA_Leads objAddToBasket;
	  Products_BCA_Leads objBasketIcon;
	  
	  @BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.get("https://uk.rs-online.com/web/");
	      driver.manage().window().maximize();		  
	  }
	  
  @Test(priority=0)
  public void AccessLoginPage() {
	  objLoginH = new Homepage(driver);
	  objLoginH.clickLogin();
			  
  }
  
  @Test(priority=1)
  public void InputCredentials() {
	  objCredentials = new Login(driver);  
	  objCredentials.setCredentials("amoah21", "G1vemethej0b");
  }
  
  @Test(priority=2)
  public void Login() {
	  objLoginL = new Login(driver);  
	  objLoginL.clickLogin();
  }
  
  @Test(priority=3)
  public void SelectItemFromMenu() {
	  objSelectItem = new Menu(driver);
	  objSelectItem.selectMenuAllProducts();

  }
  
  @Test(priority=4)
  public void SelectItemFromProductPage_BC() {
	  objSelectItemBC = new Products_BC(driver);
	  objSelectItemBC.selectItemBC();
	  
	  objSelectItemBCA = new Products_BCA(driver);
	  objSelectItemBCA.selectItemBCA();
	  
	  objSelectItemBCA_Leads = new Products_BCA_Leads(driver);
	  objSelectItemBCA_Leads.selectItemBCA_Leads();
  }
  
  @Test(priority=5)
  public void AddItemToBasket() {
	  objAddToBasket = new Products_BCA_Leads(driver);
	  objAddToBasket.addToBasket();

  }
  
  @Test(priority=6)
  public void UpdateQty() {
	  objUpdateQTY = new Basket(driver);
	  objUpdateQTY.inputNewQTY("2");
	  //TODO add compare logic for input field and items in basket

  }
  
  
  
}
