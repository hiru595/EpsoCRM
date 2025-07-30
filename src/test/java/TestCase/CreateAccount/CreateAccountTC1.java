package TestCase.CreateAccount;

import BaseTest.CommonTests;
import PageNames.CreateAccount;
import UtilityFiles.propertiesReader;
import org.testng.annotations.Test;

public class CreateAccountTC1 extends CommonTests {

    @Test
    public void TC1_CreateAccount(){
        CreateAccount createAccount=new CreateAccount(driver);
        createAccount.ClickCreatePlusIcon();
        createAccount.ClickCreateAccount();
        createAccount.ClickFullFormBtn();
        createAccount.EnterAccountName(getName());
        createAccount.EnterWebsiteUrl(getWebsite());
        createAccount.EnterEmail(getEmail());
        createAccount.EnterOfficeNumber(getPhoneNumber());
        createAccount.EnterBillingStreetAddress(getStreetAddress());
        createAccount.EnterBillingCity(getCityName());
        createAccount.EnterBillingState(getStateName());
        createAccount.EnterBillingPostalCode(getPostalCode());
        createAccount.EnterBillingCountry(getCountryName());
        createAccount.EnterShippingStreetAddress(getStreetAddress());
        createAccount.EnterShippingCity(getCityName());
        createAccount.EnterShippingState(getStateName());
        createAccount.EnterShippingPostalCode(getPostalCode());
        createAccount.EnterShippingCountry(getCountryName());
        createAccount.SelectAccountType();
        createAccount.SelectIndustryType();
        createAccount.EnterDescription(propertiesReader.readKey("AccountDescription"));
    }
}
