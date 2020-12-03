package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class Products_BCA_Leads {
	
    WebDriver driver;
    //Product Elements (Batteries & Charger & Accessories)
    By itemInBCA_Leads = By.xpath("//*[@id=\"results-table\"]/tbody/tr[1]/td[2]/div[1]/a");
    By addToBasket = By.xpath("//*[@id=\"price-break-container\"]/div/div[2]/div/div[3]/div/button");
    By basketIcon = By.xpath("//*[@id=\"pageHeader\"]/div/div[3]/a");
    
    public Products_BCA_Leads(WebDriver driver){
        this.driver = driver;
    }    
    
    //Click on item in Batteries & Charger Accessories page > Leads
    public void selectItemBCA_Leads(){
            driver.findElement(itemInBCA_Leads).click();
    }
    
    public void addToBasket() {
            driver.findElement(itemInBCA_Leads).click();
            driver.findElement(basketIcon).click(); 
          //  driver.findElement(basketIcon).getText();
          //  System.out.println("title of page is: " + driver.getTitle());        
    }

}
