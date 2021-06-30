package pageofactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleWatchPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'prod-cart__top js_ecomm'][contains(@data-ecomm, 'Pink Sand Sport Band (MU682)')]")
    private WebElement appleWatchButton;

    @FindBy(xpath = "//div[@class = 'prod-garantee select-border-installment']")
    private WebElement buyInInstallments;


    public AppleWatchPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleWatchButton(){
        appleWatchButton.click();
    }
    public void clickOnBuyInInstallments(){
        buyInInstallments.click();
    }
}
