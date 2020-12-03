package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;

    //Quick Order Elements
    By homePageStockNumber1 = By.id("stocknum-1");
    By homePageStockNumber2 = By.id("stocknum-2");
    By homePageStockQuantity1 = By.id("quantity-1");
    By homePageStockQuantity2 = By.id("quantity-2");
    
    By homePageAddBasketBtn = By.className("RSQO-button");
    By homePageLoginBtn = By.id("js-logInOut");	
    
    //TODO
    //By.id("fsrInvite"); //this is the popup that comes after login
    
    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    
    //input stock number 1 and 2
    public void setRSQOstock(String strRSQOinput1, String strRSQOinput2){
        driver.findElement(homePageStockNumber1).sendKeys(strRSQOinput1);
        driver.findElement(homePageStockNumber2).sendKeys(strRSQOinput2);

    }

    
     
    //input quantity
    public void setRSQOqty(String strRSQOqty1, String strRSQOqty2){
        driver.findElement(homePageStockQuantity1).sendKeys(strRSQOqty1);
        driver.findElement(homePageStockQuantity2).sendKeys(strRSQOqty2);
    }    
    
    //Click on Add to Basket button
    public void clickAddToBasket(){
            driver.findElement(homePageAddBasketBtn).click();
    }
    
    //Click on login button (HomePage)
    public void clickLogin(){
            driver.findElement(homePageLoginBtn).click();
    }
    
    //add waits
    //add comparison/calculation of price
    //order two of the same item - should show items updated in basket icon but doesnt!! - FAIL
    
}