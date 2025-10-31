package PageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccount extends BasePage{

    public CreateAccount(WebDriver driver){
        super(driver);
    }

    By BtnCreateIcon = By.xpath("//i[@class='fas fa-plus icon']");
    By LinkCreateAccount = By.xpath("//a[text()='Account']");
    By BtnFullForm = By.xpath("//button[@data-name='fullForm']");
    By TxtName = By.xpath("//input[@data-name='name']");
    By TxtWebsite = By.xpath("//input[@data-name='website']");
    By TxtEmail = By.xpath("//input[@type='email']");
    By TxtPhone = By.xpath("//input[@autocomplete='espo-phoneNumber']");
    By TxtBillingStreet = By.xpath("//textarea[@data-name='billingAddressStreet']");
    By TxtBillingCity = By.xpath("//input[@data-name='billingAddressCity']");
    By TxtBillingState = By.xpath("//input[@data-name='billingAddressState']");
    By TxtBillingPostalCode = By.xpath("//input[@data-name='billingAddressPostalCode']");
    By TxtBillingCountry = By.xpath("//input[@data-name='billingAddressCountry']");
    By TxtShippingStreet = By.xpath("//textarea[@data-name='shippingAddressStreet']");
    By TxtShippingCity = By.xpath("//input[@data-name='shippingAddressCity']");
    By TxtShippingState = By.xpath("//input[@data-name='shippingAddressState']");
    By TxtShippingPostalCode = By.xpath("//input[@data-name='shippingAddressPostalCode']");
    By TxtShippingCountry = By.xpath("//input[@data-name='shippingAddressCountry']");
    By PickListType = By.xpath("//div[@data-name='type']//div[contains(@class,'selectize-input')]");
    By PickListTypeOption = By.xpath("//div[@data-value='Partner']");
    By PickListIndustry = By.xpath("//div[@data-name='industry']//div[contains(@class,'selectize-input')]");
    By PickListIndustryOption = By.xpath("//div[text()='Banking']");
    By PickListAssignedUser = By.xpath("//div[@data-name='assignedUser']//button[@title='Select']");
    By PickListAssignedUserOption = By.xpath("//a[text()='Jack Adams']");
    By PickListTeams = By.xpath("//div[@data-name='teams']//button[@title='Select']");
    By CheckboxSales = By.xpath("//td//input[@type='checkbox']");
    By BtnSelectTeams = By.xpath("//button[text()='Select']");
    By BtnSave = By.xpath("//button[text()='Save']");
    By BtnCancel = By.xpath("//button[text()='Cancel']");
    By BtnMoreOptions = By.xpath("//button[@type='button' and @data-toggle='dropdown']"); //Toggle/dropdown button beside "Cancel" button.
    By BtnSaveAndNew = By.xpath("//a[text()='Save & New']");
    By BtnSaveAndContinueEdit = By.xpath("//a[text()='Save & Continue Editing']");
    By IconBtnComposeEmail = By.xpath("//button[@title='Compose Email']");
    By IconBtnCreateContact = By.xpath("//button[@data-panel='contacts']");
    By IconBtnCreateOpportunity = By.xpath("//button[@data-link='opportunities']");


    public void clickCreateBtnIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(BtnCreateIcon)).click();
    }

    public void clickCreateAccountLink(){
        wait.until(ExpectedConditions.elementToBeClickable(LinkCreateAccount)).click();
    }

    public void clickButtonFullForm(){
        wait.until(ExpectedConditions.elementToBeClickable(BtnFullForm)).click();
    }

    public void enterName(String name){
        wait.until(ExpectedConditions.presenceOfElementLocated(TxtName)).sendKeys(name);
    }

    public void enterWebsite(String website){
         driver.findElement(TxtWebsite).sendKeys(website);
    }

    public void enterEmail(String email){
        driver.findElement(TxtEmail).sendKeys(email);
    }

    public void enterPhone(String phone){
        driver.findElement(TxtPhone).sendKeys(phone);
    }

    public void enterBillingStreet(String BillingStreet){
        driver.findElement(TxtBillingStreet).sendKeys(BillingStreet);
    }

    public void enterBillingCity(String BillingCity){
        driver.findElement(TxtBillingCity).sendKeys(BillingCity);
    }

    public void enterBillingState(String BillingState){
        driver.findElement(TxtBillingState).sendKeys(BillingState);
    }

    public void enterBillingPostalCode(String BillingPostalCode){
        driver.findElement(TxtBillingPostalCode).sendKeys(BillingPostalCode);
    }

    public void enterBillingCountry(String BillingCountry){
        driver.findElement(TxtBillingCountry).sendKeys(BillingCountry);
    }

    public void enterShippingStreet(String ShippingStreet){
        driver.findElement(TxtShippingStreet).sendKeys(ShippingStreet);
    }

    public void enterShippingCity(String ShippingCity){
        driver.findElement(TxtShippingCity).sendKeys(ShippingCity);
    }

    public void enterShippingState(String ShippingState){
        driver.findElement(TxtShippingState).sendKeys(ShippingState);
    }

    public void enterShippingPostalCode(String ShippingPostalCode){
        driver.findElement(TxtShippingPostalCode).sendKeys(ShippingPostalCode);
    }

    public void enterShippingCountry(String ShippingCountry){
        driver.findElement(TxtShippingCountry).sendKeys(ShippingCountry);
    }

    public void selectPickListType(){
        wait.until(ExpectedConditions.elementToBeClickable(PickListType)).click();
        wait.until(ExpectedConditions.elementToBeClickable(PickListTypeOption)).click();
    }

    public void selectPickListIndustry(){
        wait.until(ExpectedConditions.elementToBeClickable(PickListIndustry)).click();
        wait.until(ExpectedConditions.elementToBeClickable(PickListIndustryOption)).click();
    }

    public void selectPicklistAssignedUser(){
        driver.findElement(PickListAssignedUser).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(PickListAssignedUserOption)).click();
    }

    public void selectPickListTeam(){
        driver.findElement(PickListTeams).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(CheckboxSales)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnSelectTeams)).click();
    }

    public void clickSaveBtn(){
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnSave)).click();
    }

    public void clickCancelBtn(){
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnCancel)).click();
    }

    public void clickSaveandNewBtn(){
        driver.findElement(BtnMoreOptions).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnSaveAndNew)).click();
    }

    public void clickSaveandContinueEditBtn(){
        driver.findElement(BtnMoreOptions).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnSaveAndContinueEdit)).click();
    }

    public void clickIconBtnComposeEmail(){
        wait.until(ExpectedConditions.presenceOfElementLocated(IconBtnComposeEmail)).click();
    }

    public void clickIconBtnContact(){
        wait.until(ExpectedConditions.presenceOfElementLocated(IconBtnCreateContact)).click();
    }

    public void clickIconBtnOpportunity(){
        wait.until(ExpectedConditions.presenceOfElementLocated(IconBtnCreateOpportunity)).click();
    }
}
