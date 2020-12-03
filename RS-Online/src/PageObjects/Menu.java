package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
	
    WebDriver driver;
    //Menu Elements
    By menuAllProducts = By.xpath("//html/body/div[4]/div/ul/li[1]/a");
    By menuAllProducts_Book0 = By.xpath("//html/body/div[4]/div/ul/li[1]/ul/li[2]/a");
    			//By menuAllProducts_Book0_Accessories = By.xpath("//html/body/div[4]/div/ul/li[1]/ul/li[2]/div/ul[1]/li[1]/a");
    			//By menuOurBrands = ;
    //By menuNewProducts = ;
    //By menuMyAccount = ;
    //By menuOurServices = ;
    
    public Menu(WebDriver driver){
        this.driver = driver;
    }    
    
    
    //Click on Menu button (All Products)
    public void selectMenuAllProducts(){
            driver.findElement(menuAllProducts).click();
            driver.findElement(menuAllProducts_Book0).click();
           // driver.findElement(menuAllProducts_Book0_Accessories).click();
    }
}
