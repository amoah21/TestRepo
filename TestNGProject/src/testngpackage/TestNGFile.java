//
/*
 * TestNG does not require you to have a main() method.
 * Methods need not be static.
 * We used the @Test annotation. @Test is used to tell that the method under it is a test case. In this case, 
 * we have set the verifyHomepageTitle() method to be our test case, so we placed an '@Test' annotation above it.
 * Since we use annotations in TestNG, we needed to import the package org.testng.annotations.*.
 * We used the Assert class. The Assert class is used to conduct verification operations in TestNG. To use it, 
 * we need to import the org.testng.Assert package.
 */




package testngpackage;

//import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGFile {
    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "F:\\Program Files\\Selenium\\chromedriver.exe";
    public WebDriver driver ; 
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}



  

