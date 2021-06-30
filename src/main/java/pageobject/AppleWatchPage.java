package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleWatchPage extends BasePage{

    private static final String BUY_IN_INSTALLMENTS = "//div[@class = 'prod-garantee select-border-installment']";
    private static final String APPLE_WATCH_BUTTON = "//div[@class = 'prod-cart__top js_ecomm'][contains(@data-ecomm, 'Pink Sand Sport Band (MU682)')]";

    public AppleWatchPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleWatchButton(){
        driver.findElement(By.xpath(APPLE_WATCH_BUTTON)).click();
    }
    public void clickOnBuyInInstallments(){
        driver.findElement(By.xpath(BUY_IN_INSTALLMENTS)).click();
    }
}
