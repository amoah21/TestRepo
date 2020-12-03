package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_Ladders {
	WebDriver driver;
	By sortByDropDown = By.xpath("//*[@id=\"search-results\"]/div[3]/div/div[2]/div[4]/div[2]/div/div/section[1]/label/div/button");
	By sortByOptions_Price = By.xpath("//*[@id=\"search-results\"]/div[3]/div/div[2]/div[4]/div[2]/div/div/section[1]/label/div/div/ul/li[3]");
	By sortByOptions_Popularity = By.xpath("//*[@id=\"search-results\"]/div[3]/div/div[2]/div[4]/div[2]/div/div/section[1]/label/div/div/ul/li[2]");
	By sortByOptions_Relevance = By.xpath("//*[@id=\"search-results\"]/div[3]/div/div[2]/div[4]/div[2]/div/div/section[1]/label/div/div/ul/li[1]");
	By ladderCategories = By.xpath("//*[@id=\"sidebar\"]/section/div[1]/div/ul/li[1]/a/div/span");
	
	By sortResultsTable_NoOfThreads_Asc = By.xpath("//*[@id=\"results-table-header\"]/thead/tr[2]/th[5]/button[1]");
	By sortResultsTable_NoOfThreads_Desc = By.xpath("//*[@id=\"results-table-header\"]/thead/tr[2]/th[5]/button[2]");
	By sortResultsTable_ClosedLength_Asc = By.xpath("//*[@id=\"results-table-header\"]/thead/tr[2]/th[4]/button[1]");
	By sortResultsTable_ClosedLength_Desc = By.xpath("//*[@id=\"results-table-header\"]/thead/tr[2]/th[4]/button[2]");
	
	
	
    public Products_Ladders(WebDriver driver){
        this.driver = driver;
    }
    
    
    //Click on sort by menu (Price)
    public void sortByPrice() {
            driver.findElement(sortByDropDown).click();
            driver.findElement(sortByOptions_Price).click();

    }
    
    //Click on sort by menu (Popularity)
    public void sortByPopularity() {
            driver.findElement(sortByDropDown).click();
            driver.findElement(sortByOptions_Popularity).click();

    }
    
    //Click on sort by menu (Relevance)
    public void sortByRelevance() {
            driver.findElement(sortByDropDown).click();
            driver.findElement(sortByOptions_Relevance).click();

    }    
    
    
    //Click on Results table sort menu (Number of Threads)
    public void sortByResultsTable_Thread() {
          
            driver.findElement(sortResultsTable_NoOfThreads_Asc).click();
            driver.findElement(sortResultsTable_NoOfThreads_Desc).click();
    }
    
    
    //Click on Results table sort menu (Closed Length)
    public void sortByResultsTable_ClosedLength() {
          
            driver.findElement(sortResultsTable_ClosedLength_Asc).click();
            driver.findElement(sortResultsTable_ClosedLength_Desc).click();
    }
}
