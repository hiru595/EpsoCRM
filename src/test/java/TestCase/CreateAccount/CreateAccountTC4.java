package TestCase.CreateAccount;

import BaseTest.CommonTests;
import PageNames.CreateAccount;
import UtilityFiles.TestDataGenerator;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateAccountTC4 extends CommonTests {

    @Test
    @Description ////Create Account Save and ContinueEdit Button

    public void TC4_CreateAccount(){
        CreateAccount createAccount=new CreateAccount(driver);
        TestDataGenerator data = new TestDataGenerator();

        createAccount.clickCreateBtnIcon();
        createAccount.clickCreateAccountLink();
        createAccount.clickButtonFullForm();
        createAccount.enterName(data.getName());
        createAccount.enterWebsite(data.getWebsite());
        createAccount.enterEmail(data.getEmail());
        createAccount.enterPhone(data.getPhoneNumber());
        createAccount.enterBillingStreet(data.getStreetAddress());
        createAccount.enterBillingCity(data.getCityName());
        createAccount.enterBillingState(data.getStateName());
        createAccount.enterBillingPostalCode(data.getPostalCode());
        createAccount.enterBillingCountry(data.getCountryName());
        createAccount.enterShippingStreet(data.getStreetAddress());
        createAccount.enterShippingCity(data.getCityName());
        createAccount.enterShippingState(data.getStateName());
        createAccount.enterShippingPostalCode(data.getPostalCode());
        createAccount.enterShippingCountry(data.getCountryName());
        createAccount.selectPickListType();
        createAccount.selectPickListIndustry();
        createAccount.selectPicklistAssignedUser();
        createAccount.selectPickListTeam();
        createAccount.clickSaveandContinueEditBtn();
    }
}
