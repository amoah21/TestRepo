package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBar {
    
	WebDriver driver;
    //SearchBar Elements
    By searchBar = By.id("searchTerm");
    By searchBtn = By.id("btnSearch");
    By RSOnlineHome = By.className("rslogo");
    
    public SearchBar(WebDriver driver){
        this.driver = driver;
    }    

    public void selectSearchBar(){
        driver.findElement(searchBar).click();
    }
    
    public void inputSearchItem(String strSearchItem) {
    	driver.findElement(searchBar).sendKeys(strSearchItem);
    }
    
    public void inputSearchPartNo(String strSearchPartNo) {
    	driver.findElement(searchBar).sendKeys(strSearchPartNo);
    }
    
    public void inputSearchRSNo(String strSearchRSNo) {
    	driver.findElement(searchBar).sendKeys(strSearchRSNo);
    }
    
    public void clickSearchBtn(){
        driver.findElement(searchBtn).click();
    }
    
    public void clickRSLogo(){
        driver.findElement(RSOnlineHome).click();
    }

}
