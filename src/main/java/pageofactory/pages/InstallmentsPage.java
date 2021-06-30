package pageofactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstallmentsPage extends BasePage {

    @FindBy(xpath = "//span[@class = 'installment-select2-item']/img[@src='https://avic.ua/assets/cache/banks/forwardbank-bank_md.png']")
    private WebElement forwardBankButton;

    @FindBy(xpath = "//script[@src='//iforms.forward-bank.com/itrade/data/files/new_design/brs-functions.js']")
    private WebElement installmentsCalculatorPage;

    public InstallmentsPage(WebDriver driver) {
        super(driver);
    }

    public void chooseBankForBuyInInstallments(){
        forwardBankButton.click();
    }

       public boolean appearanceFormOfInstamentsСalculator(){
         return installmentsCalculatorPage.isEnabled();
    }
}
