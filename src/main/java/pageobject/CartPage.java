package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private static final String BUTTON_PLUS_FOR_INCREASE_ITEMS_IN_CART = "//span[@class='js_plus btn-count btn-count--plus ']";
    private static final String AMOUNT_OF_THE_SAME_ITEM = "//div[@class='quantity-cart js_quantity']//input[@class='js-changeAmount count']";
    private static final String ATTRIBUTE = "value";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void increaseNumberOfItemInCart(){
        driver.findElement(By.xpath(BUTTON_PLUS_FOR_INCREASE_ITEMS_IN_CART)).click();
    }

    public String  getAmountOfSameItemInCart(){
        return driver.findElement(By.xpath(AMOUNT_OF_THE_SAME_ITEM)).getAttribute(ATTRIBUTE);
    }
}
