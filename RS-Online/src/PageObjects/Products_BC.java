package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_BC {
    WebDriver driver;
    //Product Elements (Batteries and Chargers)
    By itemInBC = By.xpath("//*[@id=\"categories-grid\"]/div[1]/div/a");
    //controlled
  //*[@id="categories-grid"]/div[1]/div/a
    
    //normal
  //*[@id="__next"]/div/div/div[2]/div/div/div[1]/div/a
    
    public Products_BC(WebDriver driver){
        this.driver = driver;
    }    
    
    
    //Click on item in Batteries and Chargers page
    public void selectItemBC(){
            driver.findElement(itemInBC).click();
    }

}
