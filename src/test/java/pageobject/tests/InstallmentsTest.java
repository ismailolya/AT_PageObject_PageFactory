package pageobject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InstallmentsTest extends BaseTest{

    @Test(priority = 1)
    public void checkPossibilityToBuyInInstallments(){
        getHomePage().clickOnCatalogButton();
        getAppleStorePage().clickOnAppleStoreButton();
        getAppleStorePage().clickOnAppleWatchCatalogButton();
        getAppleWatchPage().clickOnAppleWatchButton();
        getAppleWatchPage().clickOnBuyInInstallments();
        getInstallmentsPage().chooseBankForBuyInInstallments();
        getInstallmentsPage().implicitWait(20);
        getInstallmentsPage().appearanceFormOfInstamentsСalculator();
    }
}

