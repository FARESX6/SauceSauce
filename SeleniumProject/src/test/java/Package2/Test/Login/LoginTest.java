package Package2.Test.Login;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package2.Base.BaseTest;
//import commen.LoginPage;

public class LoginTest extends BaseTest {

    @Test

    public void testLoginErrorMessage(){

        loginPage.setUsername("standard_user");
        loginPage.setPassword("xsfd111");
        loginPage.clickLoginButton();
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }

}
