package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobject.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";


    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public pageofactory.pages.HomePage getHomePage(){
        return new pageofactory.pages.HomePage(getDriver());
    }

    public pageofactory.pages.AppleStorePage getAppleStorePage(){
        return new pageofactory.pages.AppleStorePage(getDriver());
    }

    public pageofactory.pages.AppleWatchPage getAppleWatchPage(){
        return new pageofactory.pages.AppleWatchPage(getDriver());
    }

    public pageofactory.pages.CartPage getCartPage(){
        return new pageofactory.pages.CartPage(getDriver());
    }

    public pageofactory.pages.HotMenuPage getHotMenuPage(){
        return new pageofactory.pages.HotMenuPage(getDriver());
    }

    public pageofactory.pages.InstallmentsPage getInstallmentsPage(){
        return new pageofactory.pages.InstallmentsPage(getDriver());
    }

    public pageofactory.pages.IPhonePage getIPhonePage(){
        return new pageofactory.pages.IPhonePage(getDriver());
    }
}
