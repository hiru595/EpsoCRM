package TestCase.AccountActivities;

import BaseTest.CommonTests;
import PageNames.AccountEmailActivity;
import PageNames.CreateAccount;
import UtilityFiles.TestDataGenerator;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class EmailActivityTC1 extends CommonTests {

    @Test
    @Description // Send Email Functionality
    public void TC1_EmailActivity(){

        CreateAccount createAccount=new CreateAccount(driver);
        AccountEmailActivity accountEmailActivity=new AccountEmailActivity(driver);
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
        createAccount.clickSaveBtn();
        createAccount.clickIconBtnComposeEmail();

        accountEmailActivity.enterTxtEmailCC(data.getEmail());
        accountEmailActivity.enterTxtEmailBCC(data.getEmail());
        accountEmailActivity.enterTxtEmailSubject(propertiesReader.readKey("EmailSubject1"));
        accountEmailActivity.enterTxtEmailBody(propertiesReader.readKey("EmailBodyLine1"));
        accountEmailActivity.enterTxtEmailBody(propertiesReader.readKey("EmailBodyLine2"));
        accountEmailActivity.enterTxtEmailBody(propertiesReader.readKey("EmailBodyLine3"));
        accountEmailActivity.enterTxtEmailBody(propertiesReader.readKey("EmailBodyLine4"));
        accountEmailActivity.clickBtnSendEmail();
    }
}
