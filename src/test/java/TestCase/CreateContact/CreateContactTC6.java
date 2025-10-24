package TestCase.CreateContact;

import BaseTest.CommonTests;
import PageNames.CreateAccount;
import PageNames.CreateContact;
import UtilityFiles.TestDataGenerator;
import UtilityFiles.propertiesReader;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTC6 extends CommonTests {

    @Test
    @Description //Invalid Email Format Testing
    public void TC6_CreateContact(){
        CreateAccount createAccount=new CreateAccount(driver);
        CreateContact createContact=new CreateContact(driver);
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

        createAccount.clickIconBtnContact();
        createContact.clickBtnFullForm();
        createContact.enterTxtName();
        createContact.enterFirstName(data.getFirstName());
        createContact.enterLastName(data.getLastName());

        createContact.enterEmail(propertiesReader.readKey("ContactInvalidEmail2"));
        createContact.clickSaveBtn();
        Assert.assertEquals(propertiesReader.readKey("MsgContactInvalidEmail"),createContact.getMsgInvalidEmail());

        createContact.enterEmail(propertiesReader.readKey("ContactInvalidEmail3"));
        createContact.clickSaveBtn();
        Assert.assertEquals(propertiesReader.readKey("MsgContactInvalidEmail"),createContact.getMsgInvalidEmail());

        createContact.enterEmail(propertiesReader.readKey("ContactInvalidEmail4"));
        createContact.clickSaveBtn();
        Assert.assertEquals(propertiesReader.readKey("MsgContactInvalidEmail"),createContact.getMsgInvalidEmail());
    }
}
