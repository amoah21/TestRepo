package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;
    //Login Page Elements
    By loginUserName = By.name("username");
    By loginPassword = By.name("password");
    
    By loginBtn = By.className("button_37Egr");	
    
    public Login(WebDriver driver){
        this.driver = driver;
    }
    
    public void setCredentials(String strUserName, String strPassword) {
    	driver.findElement(loginUserName).sendKeys(strUserName);
    	driver.findElement(loginPassword).sendKeys(strPassword);
    }
    
    //Set user name in textbox
   // public void setUserName1(String strUserName){
    //    driver.findElement(loginUserName).sendKeys(strUserName);
    //}

    //Set password in password textbox
   // public void setPassword1(String strPassword){
    //     driver.findElement(loginPassword).sendKeys(strPassword);
   // }
    

    //Click on login button (Login Page)
    public void clickLogin(){
            driver.findElement(loginBtn).click();
    }


    /*
     * This POM method will be exposed in test case to login in the application
     * @param strUserName
     * @param strPasword
     * @return
     */
     

   //public void setCredentials1(String strUserName,String strPasword){

        //Fill user name

        //this.setUserName1(strUserName);

        //Fill password

        //this.setPassword1(strPasword);

        //Click Login button

        //this.clickLogin();        
    //}
    

}