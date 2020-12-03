package PageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Products_Drills {
	
	WebDriver driver;
	By filterBrand = By.xpath("//*[@id=\"filters\"]/div/div/rs-facets/a[1]/span");
	By filterBrandBosch = By.xpath("//*[@id=\"labelwidth_4294966925\"]");
	By applyFilter = By.xpath("//*[@id=\"filters\"]/div/div/rs-facets/div/div[2]/div/div[6]/rs-apply-button/button");
	By applyFilter1 = By.xpath("//*[@id=\"bread-box\"]/div[1]/div[2]/span/rs-apply-button/button");
	By filterBatteryCapacity = By.xpath("//*[@id=\"filters\"]/div/div/rs-facets/a[8]/span");
	By filterBatteryCapacity_5ah = By.xpath("//*[@id=\"4293602942\"]");
	By removeAllFilters = By.xpath("//*[@id=\"bread-box\"]/div[2]/rs-bread-box/div[1]/div/a");
	
	
    public Products_Drills(WebDriver driver){
        this.driver = driver;
    }
    
    //Click on filter (Brand)
    public void filterByBrand() {
            driver.findElement(filterBrand).click();
            driver.findElement(filterBrandBosch).click();
            driver.findElement(applyFilter).click();
    }
	
    //Click on filter (BatteryCapacity)
    public void filterByBatteryCapacity() throws Exception {
            driver.findElement(filterBatteryCapacity).click();
            driver.findElement(filterBatteryCapacity_5ah).click();
            driver.findElement(applyFilter1).click();
            Thread.sleep(5000);
    }
    
    public void removeAllFilters(){
        driver.findElement(removeAllFilters).click();
    }
}
