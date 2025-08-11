package Package2.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import commen.saucedemo.BasePage;
import commen.saucedemo.LoginPage;

public class BaseTest {

    protected WebDriver driver ;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void Setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();

    }


    @AfterClass

    public void Teardown(){

        driver.quit();
    }


}