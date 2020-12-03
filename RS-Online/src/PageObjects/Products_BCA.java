package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_BCA {
	
    WebDriver driver;
    //Product Elements (Batteries, Chargers & Accessories)
    By itemInBCA = By.xpath("//*[@id=\"categories-grid\"]/div[1]/div/a");
    
    public Products_BCA(WebDriver driver){
        this.driver = driver;
    }    
    
    //Click on item in Batteries, Chargers & Accessories page
    public void selectItemBCA(){
            driver.findElement(itemInBCA).click();
    }

}
