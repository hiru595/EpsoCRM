package TestCase.CreateAccount;

import BaseTest.CommonTests;
import PageNames.CreateAccount;
import UtilityFiles.propertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTC2 extends CommonTests {
    @Test
    public void TC2_CreateAccount(){
        CreateAccount createAccount=new CreateAccount(driver);
        createAccount.ClickCreatePlusIcon();
        createAccount.ClickCreateAccount();
        createAccount.ClickFullFormBtn();
        createAccount.ClickSaveBtn();

        String MandatoryAccountNameError=createAccount.getMandatoryAccNameErrMsg();
        Assert.assertEquals(propertiesReader.readKey("AccountmandatoryErrorMsg"),MandatoryAccountNameError);
    }
}
