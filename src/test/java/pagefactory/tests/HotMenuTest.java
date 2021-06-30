package pagefactory.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotMenuTest extends BaseTest {
    private static final String HOT_MENU_KEYWORD = "iPhone 12";

    @Test(priority = 3)
    public void checkHotMenuContainsProperItemsInside(){
        getHomePage().clickOnHotMenuButton();

        for (WebElement webElement : getHotMenuPage().getProductsListInHotMenu()) {
            Assert.assertTrue(webElement.getText().contains(HOT_MENU_KEYWORD));
        }
    }
}
