package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testnum1 {
  WebDriver driver;

  @BeforeClass
    public void setUp() {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
  @AfterClass
    public void Teardown() {
  //    driver.quit();
  }

  @Test

    public void TestLoggingIntoApp() throws InterruptedException {
      Thread.sleep(5000);
      WebElement username = driver.findElement(By.name("username"));
      var password =driver.findElement(By.name("password"));
      username.sendKeys("Admin");
      password.sendKeys("admin123");
      driver.findElement(By.tagName("button")).click();
      Thread.sleep(2000); // thread.sleep is a java sleeping methode not a selenium , so is not recemonded because it's a hard stop
      String Actualresult =  driver.findElement(By.tagName("h6")).getText();
      String Expectedresult = "Dashboard" ; 
      Assert.assertEquals(Actualresult, Expectedresult);



  }
}
