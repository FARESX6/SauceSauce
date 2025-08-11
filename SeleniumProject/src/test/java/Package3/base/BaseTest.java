package Package3.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import commen.demoqa.HomePage;
import commen.saucedemo.BasePage;
//import commen.saucedemo.LoginPage;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String demoqa_url = "https://qademo.com/";

    @BeforeClass
    public void Setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    
    @BeforeMethod
    public void loadApplication(){

        driver.get(demoqa_url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        homePage = new HomePage();
    }

    @AfterClass

    public void Teardown(){

        driver.quit();
    }

}
