package PageNames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccount extends BasePage{

    public CreateAccount (WebDriver driver){
        super(driver);
    }

    @FindBy (xpath = "//a[@title='Create']//i")
    WebElement CreateMenuIcon;

    @FindBy (xpath = "//li//a[text()='Account']")
    WebElement Btn_CreateAccount;

    @FindBy (xpath = "//button[text()='Full Form']")
    WebElement Btn_FullForm;

    @FindBy (xpath = "//input[@data-name='name']")
    WebElement Txt_AccountName;

    @FindBy (xpath = "//input[@data-name='website']")
    WebElement Txt_Website;

    @FindBy (xpath = "//input[@type='email']")
    WebElement Txt_Email;

    @FindBy (xpath = "//input[@autocomplete='espo-phoneNumber']")
    WebElement Txt_OfficeMobileNumber;

    @FindBy (xpath = "//textarea[@data-name='billingAddressStreet']")
    WebElement Txt_BillingStreet;

    @FindBy (xpath = "//input[@data-name='billingAddressCity']")
    WebElement Txt_BillingCity;

    @FindBy (xpath = "//input[@data-name='billingAddressState']")
    WebElement Txt_BillingState;

    @FindBy (xpath = "//input[@data-name='billingAddressPostalCode']")
    WebElement Txt_BillingPostalCode;

    @FindBy (xpath = "//input[@data-name='billingAddressCountry']")
    WebElement Txt_BillingCountry;

    @FindBy (xpath = "//textarea[@data-name='shippingAddressStreet']")
    WebElement Txt_ShippingStreet;

    @FindBy (xpath = "//input[@data-name='shippingAddressCity']")
    WebElement Txt_ShippingCity;

    @FindBy (xpath = "//input[@data-name='shippingAddressState']")
    WebElement Txt_ShippingState;

    @FindBy (xpath = "//input[@data-name='shippingAddressPostalCode']")
    WebElement Txt_ShippingPostalCode;

    @FindBy (xpath = "//input[@data-name='shippingAddressCountry']")
    WebElement Txt_ShippingCountry;

    public void ClickCreatePlusIcon(){
        wait.until(ExpectedConditions.visibilityOf(CreateMenuIcon));
        CreateMenuIcon.click();
    }

    public void ClickCreateAccount(){
        wait.until(ExpectedConditions.visibilityOf(Btn_CreateAccount));
        Btn_CreateAccount.click();
    }

    public void ClickFullFormBtn(){
        wait.until(ExpectedConditions.visibilityOf(Btn_FullForm));
        Btn_FullForm.click();
    }

    public void EnterAccountName(String accountName){
        Txt_AccountName.sendKeys(accountName);
    }

    public void EnterWebsiteUrl(String website){
        Txt_Website.sendKeys(website);
    }

    public void EnterEmail(String email){
        Txt_Email.sendKeys(email);
    }

    public void EnterOfficeNumber(String officePhone){
        Txt_OfficeMobileNumber.sendKeys(officePhone);
    }

    public void EnterBillingStreetAddress(String billingStreet){
        Txt_BillingStreet.sendKeys(billingStreet);
    }

    public void EnterBillingCity(String billingCity){
        Txt_BillingCity.sendKeys(billingCity);
    }

    public void EnterBillingState(String billingState){
        Txt_BillingState.sendKeys(billingState);
    }

    public void EnterBillingPostalCode(String billingPostalCode){
        Txt_BillingPostalCode.sendKeys(billingPostalCode);
    }

    public void EnterBillingCountry(String billingCountry){
        Txt_BillingCountry.sendKeys(billingCountry);
    }

    public void EnterShippingStreetAddress(String shippingStreet){
        Txt_ShippingStreet.sendKeys(shippingStreet);
    }

    public void EnterShippingCity(String shippingCity){
        Txt_ShippingCity.sendKeys(shippingCity);
    }

    public void EnterShippingState(String shippingState){
        Txt_ShippingState.sendKeys(shippingState);
    }

    public void EnterShippingPostalCode(String shippingPostalCode){
        Txt_ShippingPostalCode.sendKeys(shippingPostalCode);
    }

    public void EnterShippingCountry(String shippingCountry){
        Txt_ShippingCountry.sendKeys(shippingCountry);
    }


}
