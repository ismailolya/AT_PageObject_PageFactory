package pageofactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(xpath = "//span[contains(@class,'js_plus btn-count btn-count--plus ')]")
    private WebElement plusButtonForIncreaseItemsInCart;

    @FindBy(xpath = "//div[@class='quantity-cart js_quantity']//input[@class='js-changeAmount count']")
    private WebElement amountOfTheSameItem;

    private static final String ATTRIBUTE = "value";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void increaseNumberOfItemInCart(){
        plusButtonForIncreaseItemsInCart.click();
    }

    public String  getAmountOfSameItemInCart(){
        return amountOfTheSameItem.getAttribute(ATTRIBUTE);
    }
}
