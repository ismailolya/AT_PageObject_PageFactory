package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.id;

public class IPhonePage extends BasePage{

    private static final String ADD_TO_CART_BUTTON = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart,'64GB Black (MGDX3)')]";
    private static final String ADD_TO_CART_POPUP = "js_cart";

    public IPhonePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton(){
        driver.findElements(By.xpath(ADD_TO_CART_BUTTON)).get(0).click();
    }

    public By getAddToCartPopUp (){
        return id(ADD_TO_CART_POPUP);
    }
}
