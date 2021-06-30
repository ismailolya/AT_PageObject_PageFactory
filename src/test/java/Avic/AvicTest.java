package Avic;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AvicTest{

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }


    @BeforeMethod
    public void testsSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
    }

    @Test(priority = 4)
    public void sendRequestForIndividualPrice(){
        driver.findElement(By.xpath("//form[@action = 'https://avic.ua/corporate-client']"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//form[@action = 'https://avic.ua/corporate-client']//input[@placeholder = 'Ваше имя']")).sendKeys("Olga");
        driver.findElement(By.xpath("//form[@action = 'https://avic.ua/corporate-client']//input[@placeholder = 'Ваш email']")).sendKeys("test@gmail.com", Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='js_addMessage']")).isEnabled());
    }

    @Test(priority = 1)
    public void checkPossibilityToBuyInInstallments(){
        driver.findElement(By.xpath("//span[@class='sidebar-item']")).click();
        driver.findElement(By.xpath("//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")).click();
        driver.findElement(By.xpath("//div[@class='brand-box__title']/a[contains(@href,'apple-watch')]")).click();
        new WebDriverWait(driver, 30).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.findElement(By.xpath("//div[@class = 'prod-cart__top js_ecomm'][contains(@data-ecomm, 'Pink Sand Sport Band (MU682)')]")).click();
        driver.findElement(By.xpath("//div[@class = 'prod-garantee select-border-installment']")).click();
        driver.findElement(By.xpath("//span[@class = 'select2-selection select2-selection--single' ][contains(@aria-activedescendant, 'Форвард банк')]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElement(By.xpath("//script[@src='//iforms.forward-bank.com/itrade/data/files/new_design/brs-functions.js']")).isEnabled());
    }

    @Test(priority = 2)
    public void increaseNumberOfItemInCart(){
        driver.findElement(By.xpath("//span[@class='sidebar-item']")).click();
        driver.findElement(By.xpath("//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")).click();
        driver.findElement(By.xpath("//div[@class='brand-box__title']/a[contains(@href,'iphone')]")).click();
        new WebDriverWait(driver, 30).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.findElement(By.xpath("//a[@class='prod-cart__buy'][contains(@data-ecomm-cart,'64GB Black (MGDX3)')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_cart")));
        driver.findElement(By.xpath("//span[@class='js_plus btn-count btn-count--plus ']")).click();
        WebElement actualProductsCountInCart =
                driver.findElement(By.xpath("//div[@class='quantity-cart js_quantity']//input[@class='js-changeAmount count']"));
        Assert.assertEquals(actualProductsCountInCart.getAttribute("value"), "2");
    }

    @Test(priority = 3)
    public void checkHotMenuContainsProperItemsInside(){
        driver.findElement(By.xpath("//div[@class = 'top-links__left flex-wrap']//a[contains(text(), ' iPhone 12')]")).click();
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class = 'prod-cart__top js_ecomm']"));
        for (WebElement webElement : elementList) {
            Assert.assertTrue(webElement.getText().contains("iPhone 12"));
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
