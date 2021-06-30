package pageofactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends BasePage {

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement appleStoreButton;

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'apple-watch')]")
    private WebElement appleWatchCatalogButton;

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'iphone')]")
    private WebElement iPhoneCatalogButton;

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleStoreButton(){
        appleStoreButton.click();
    }

    public void clickOnAppleWatchCatalogButton(){
        appleWatchCatalogButton.click();
    }

    public void clickOnIPhoneCatalogButton(){
        iPhoneCatalogButton.click();
    }
}
