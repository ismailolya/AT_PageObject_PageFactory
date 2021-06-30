package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private static final String INPUT_NAME_FOR_REQUEST = "//form[@action = 'https://avic.ua/corporate-client']//input[@placeholder = 'Ваше имя']";
    private static final String INPUT_EMAIL_FOR_REQUEST = "//form[@action = 'https://avic.ua/corporate-client']//input[@placeholder = 'Ваш email']";
    private static final String FORM_OF_SUCCESSFUL_REQUEST = "//div[@id='js_addMessage']";
    private static final String CATALOG_BUTTON = "//span[@class='sidebar-item']";
    private static final String HOT_MENU_BUTTON = "//div[@class = 'top-links__left flex-wrap']//a[contains(text(), ' iPhone 12')]";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void fillNameForIndividualPrice(String name) {
       driver.findElement(By.xpath(INPUT_NAME_FOR_REQUEST)).sendKeys(name);
    }

    public void fillEmailForIndividualPrice(final String email) {
        driver.findElement(By.xpath(INPUT_EMAIL_FOR_REQUEST)).sendKeys(email, Keys.ENTER);
    }

    public boolean appearanceFormOfSuccessfulRequest() {
        return driver.findElement(By.xpath(FORM_OF_SUCCESSFUL_REQUEST)).isEnabled();
    }

    public void clickOnCatalogButton(){
        driver.findElement(By.xpath(CATALOG_BUTTON)).click();
    }

    public void clickOnHotMenuButton(){
        driver.findElement(By.xpath(HOT_MENU_BUTTON)).click();
    }

}