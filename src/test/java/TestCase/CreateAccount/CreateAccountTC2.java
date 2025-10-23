package TestCase.CreateAccount;

import BaseTest.CommonTests;
import PageNames.CreateAccount;
import UtilityFiles.TestDataGenerator;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class CreateAccountTC2 extends CommonTests {

    @Test
    @Description //Cancel Create Account
    public void TC2_CreateAccount(){
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
        createAccount.clickCancelBtn();
      }
}
