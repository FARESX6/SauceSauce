package Package2.Test.Products;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package2.Base.BaseTest;
import commen.saucedemo.ProductPage;

public class ProductsPage extends BaseTest {


    @Test
    public void testProductsHeaderIsDisplayed(){

        ProductPage productPage =   loginPage.logIntoApp("standard_user", "secret_sauce");

        Assert.assertTrue(productPage.isProductsHeaderDisplayed(),"\n Products Header is not Displayed \n");

    }

}
