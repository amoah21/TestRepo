package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class Basket {
	
    WebDriver driver;
    
    //Basket Summary Elements
    By updateQTYfield = By.className("inputText costColumn floatLeft");
    

    public Basket(WebDriver driver){
        this.driver = driver;
    }  
    
    //update Qty field with RETURN keyboard key
    public void inputNewQTY(String strQTY){
            driver.findElement(updateQTYfield).click();
        	driver.findElement(updateQTYfield).sendKeys(strQTY);
        	driver.findElement(updateQTYfield).sendKeys(Keys.RETURN);
    }
    


}
