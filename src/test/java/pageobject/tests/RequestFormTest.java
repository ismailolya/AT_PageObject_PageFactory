package pageobject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RequestFormTest extends BaseTest{

private static final String NAME_FOR_REQUEST = "Olga";
private static final String EMAIL_FOR_REQUEST = "test@gmail.com";

    @Test(priority = 4)
    public void sendRequestForIndividualPrice(){
        getHomePage().fillNameForIndividualPrice(NAME_FOR_REQUEST);
        getHomePage().fillEmailForIndividualPrice(EMAIL_FOR_REQUEST);
        getHomePage().implicitWait(20);
        Assert.assertTrue(getHomePage().appearanceFormOfSuccessfulRequest());
    }
}
