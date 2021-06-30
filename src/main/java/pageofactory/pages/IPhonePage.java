package pageofactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IPhonePage extends BasePage{

    @FindBy(xpath = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart,'64GB Black (MGDX3)')]")
    private WebElement addToCartButton;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopUp;

    public IPhonePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddToCartButton(){
        addToCartButton.click();
    }

    public WebElement getAddToCartPopUp (){
        return addToCartPopUp;
    }
}
