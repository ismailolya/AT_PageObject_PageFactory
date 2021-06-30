package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HotMenuPage extends BasePage{

    private static final String PRODUCTS_LIST_IN_HOT_MENU = "//div[@class = 'prod-cart__top js_ecomm']";

    public HotMenuPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getProductsListInHotMenu(){
        return driver.findElements(By.xpath(PRODUCTS_LIST_IN_HOT_MENU));
    }

    public String getTextOfAmountProductsInHotMenu(){
        return driver.findElement(By.xpath(PRODUCTS_LIST_IN_HOT_MENU)).getText();
    }
}
