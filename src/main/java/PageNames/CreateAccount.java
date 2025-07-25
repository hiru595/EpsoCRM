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

    public void EnterBillingCity(String cityName){
        Txt_BillingCity.sendKeys(cityName);
    }
}
