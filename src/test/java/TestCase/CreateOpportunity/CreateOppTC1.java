package TestCase.CreateOpportunity;

import BaseTest.CommonTests;
import PageNames.CreateAccount;
import PageNames.CreateOpportunity;
import UtilityFiles.TestDataGenerator;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOppTC1 extends CommonTests {

    @Test
    @Description // Create Opportunity On Account
    public void TC1_CreateOpp(){
        CreateAccount createAccount=new CreateAccount(driver);
        CreateOpportunity createOpportunity=new CreateOpportunity(driver);
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

        createAccount.clickIconBtnOpportunity();
        createOpportunity.clickBtnFullForm();
        createOpportunity.enterName(data.getName());
        createOpportunity.selectCloseDate();
        createOpportunity.selectLeadSourse();
        createOpportunity.selectProductItem1();

        Assert.assertEquals(createOpportunity.isProduct1Added(),true,);

        createOpportunity.selectProductItem2();
    }
}
