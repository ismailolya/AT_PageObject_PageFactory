package pageofactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage{

     WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitForPageLoadingComplete (long timeToWait){
        new WebDriverWait(driver, 30).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void waitForVisibilityOfElement (long timeToWait, By locator){
        WebDriverWait wait = new WebDriverWait(driver, 30);//ждем пока не отобразится попап с товаром добавленным в корзину
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_cart")));
    }

    public void implicitWait(long timeToWait){
        driver.manage().timeouts().implicitlyWait(timeToWait, TimeUnit.SECONDS);
    }
}
