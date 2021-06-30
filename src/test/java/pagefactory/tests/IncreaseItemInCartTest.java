package pagefactory.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IncreaseItemInCartTest extends BaseTest {

    @Test(priority = 2)
    public void increaseNumberOfItemInCart(){
        getHomePage().clickOnCatalogButton();
        getAppleStorePage().clickOnAppleStoreButton();
        getAppleStorePage().clickOnIPhoneCatalogButton();
        getIPhonePage().waitForPageLoadingComplete(30);
        getIPhonePage().clickOnAddToCartButton();
        getIPhonePage().implicitWait(20);
        getCartPage().increaseNumberOfItemInCart();
        getCartPage().getAmountOfSameItemInCart();
        Assert.assertEquals(getCartPage().getAmountOfSameItemInCart() , "2");
    }
}
