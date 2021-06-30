package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleStorePage extends BasePage{

    private static final String APPLE_STORE_BUTTON = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]";
    private static final String APPLE_WATCH_CATALOG_BUTTON = "//div[@class='brand-box__title']/a[contains(@href,'apple-watch')]";
    private static final String IPHONE_CATALOG_BUTTON = "//div[@class='brand-box__title']/a[contains(@href,'iphone')]";

    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAppleStoreButton(){
        driver.findElement(By.xpath(APPLE_STORE_BUTTON)).click();
    }

    public void clickOnAppleWatchCatalogButton(){
        driver.findElement(By.xpath(APPLE_WATCH_CATALOG_BUTTON)).click();
    }

    public void clickOnIPhoneCatalogButton(){
        driver.findElement(By.xpath(IPHONE_CATALOG_BUTTON)).click();
    }
}
