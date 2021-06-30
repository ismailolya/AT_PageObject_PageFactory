package pageofactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HotMenuPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'prod-cart__top js_ecomm']")
    private List<WebElement> productsListInHotMenu;

    public HotMenuPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getProductsListInHotMenu(){
        return productsListInHotMenu;
    }

    public String getTextOfAmountProductsInHotMenu(){
        return productsListInHotMenu.toString();
    }
}
