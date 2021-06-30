package pageofactory.pages;

//import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//form[@action = 'https://avic.ua/corporate-client']//input[@placeholder = 'Ваше имя']")
    private WebElement inputNameForRequest;

    @FindBy(xpath = "//div[@class='form-field input-field']//input[@placeholder = 'Ваш email']")
    private WebElement inputEmailForRequest;

    @FindBy(xpath = "//div[@id='js_addMessage']")
    private WebElement formForSuccessfulRequest;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement catalogButton;

    @FindBy(xpath = "//div[@class = 'top-links__left flex-wrap']//a[contains(text(), ' iPhone 12')]")
    private WebElement hotMenuButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void fillNameForIndividualPrice(final String name) {
        inputNameForRequest.sendKeys(name);
    }

    public void fillEmailForIndividualPrice(final String email){
        inputEmailForRequest.sendKeys(email, Keys.ENTER);
    }

    public boolean appearanceFormOfSuccessfulRequest() {
        return formForSuccessfulRequest.isEnabled();
    }

    public void clickOnCatalogButton(){
      catalogButton.click();
    }

    public void clickOnHotMenuButton(){
      hotMenuButton.click();
    }
}