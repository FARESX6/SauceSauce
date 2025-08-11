package commen.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    public static WebDriver driver;
// setting webdriver to be used by all classes    
    public void setDriver (WebDriver driver){
        BasePage.driver = driver;
    }
// setting methode find to findelement to be used bu class object    
    protected WebElement find(By locator){

        return driver.findElement(locator);
    }
// setting methode to sendkeys to be used by class object
    protected void set(By locator,String text){
        find(locator).clear();
        find(locator).sendKeys(text);

    }
// setting methode to click anything and to be used by class object
    protected void click(By locator) {

        find(locator).click();

    }

}
