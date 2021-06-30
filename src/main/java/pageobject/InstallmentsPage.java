package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.id;

public class InstallmentsPage extends BasePage{

    private static final String FORWARD_BANK_BUTTON = "//span[@class = 'installment-select2-item']/img[@src='https://avic.ua/assets/cache/banks/forwardbank-bank_md.png']";
    private static final String INSTALLMENTS_CALCULATOR_PAGE = "//script[@src='//iforms.forward-bank.com/itrade/data/files/new_design/brs-functions.js']";
    //private static final String NEW_WINDOW_OPEN = "https://iforms.forward-bank.com/itrade/data/files/new_design/index.php?Company_Fouder=&Company_Name=Avic.ua&Company_URL=https://avic.ua&Company_E_mail=rassrochka_new@avic.ua,%20ky-romanov@forward-bank.com&prArr[]=p15,p25,p275,p3,gr3,gr4,gr5,gr6,gr7,gr8,gr10,gr12,gr15,gr18,gr24&EntP=187774945&cost=10452&name=Apple%20Watch%20Series%204%20(GPS)%2040mm%20Gold%20Aluminum%20Case%20with%20Pink%20Sand%20Sport%20Band%20(MU682)";

    public InstallmentsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseBankForBuyInInstallments(){
        driver.findElement(By.xpath(FORWARD_BANK_BUTTON)).click();
    }

       public boolean appearanceFormOfInstamentsСalculator(){
        // driver.switchTo().window(NEW_WINDOW_OPEN);
        return driver.findElement(By.xpath(INSTALLMENTS_CALCULATOR_PAGE)).isEnabled();
    }
}
