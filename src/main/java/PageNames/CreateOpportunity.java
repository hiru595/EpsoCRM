package PageNames;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;

public class CreateOpportunity extends BasePage{

    public CreateOpportunity (WebDriver driver){
        super(driver);
    }

    By BtnFullForm = By.xpath("//button[@data-name='fullForm']");
    By TextName = By.xpath("//input[@data-name='name']");
    By TextCloseDate = By.xpath("//input[@data-name='closeDate']");
    By TextCurrentMonthYear = By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']");
    By TextCurrentYear = By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']");
    By TextSelectYear = By.xpath("//span[text()='2028']");
    By TextSelectMonth = By.xpath("//span[text()='Aug']");
    By TextSelectDate = By.xpath("//td[text()='5' and @class='day']");
    By PickListLeadSource = By.xpath("//div[@data-name='leadSource' and @class='field']");
    By PickListValueLeadSource = By.xpath("//div[text()='Web Site']");
    By TextDescription = By.xpath("//div[@data-name='description']//textarea");
    By PickListAssignedUser = By.xpath("//input[@data-name='assignedUserName']");
    By PickListAssignedUserValue = By.xpath("//div[text()='Jack Adams']");
    By PickListTeams = By.xpath("//div[@data-name='teams']//div//input[@placeholder='Select']");
    By PickListTeamsValue = By.xpath("//div[text()='Sales']");
    By ButtonAddItem = By.xpath("//button[@data-action='addItem']");
    By ButtonBesideAddItem = By.xpath("//div[@class='btn-group']//button[@type='button']");
    By ButtonAddItems = By.xpath("//a[text()='Add Products']");
    By ButtonSelectMultipleItems = By.xpath("//button[text()='Select']");
    By ProductName1 = By.xpath("//a[text()='Buss Office Telephone']");
    By ProductName2 = By.xpath("//a[text()='Bright FHD Monitor']");
    By TxtSeachBox = By.xpath("//input[@type='search' and @data-name='textFilter']");
    By ButtonSearchIcon = By.xpath("//button[@title='Search']");
    By BtnSave = By.xpath("//button[text()='Save']");
    By BtnCancel = By.xpath("//button[text()='Cancel']");
    By BtnMoreAction = By.xpath("//div[@class='btn-group actions-btn-group']//button[@data-toggle='dropdown']");
    //More action button, three dots beside Cancel Button
    By BtnSaveandContinue = By.xpath("//a[text()='Save & Continue Editing']");
    By BtnSaveandNew = By.xpath("//a[text()='Save & New']");



    public void clickBtnFullForm(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(BtnFullForm)).click();
    }

    public void enterName(String OpportunityName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextName)).sendKeys(OpportunityName);
    }

    public void selectCloseDate(){
        driver.findElement(TextCloseDate).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextCurrentMonthYear)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextCurrentYear)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextSelectYear)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextSelectMonth)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TextSelectDate)).click();
    }

    public void selectLeadSourse(){
        driver.findElement(PickListLeadSource).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(PickListValueLeadSource)).click();
    }

    public void enterOpportunityDescription(String opportunityDescription){
        wait.until(ExpectedConditions.presenceOfElementLocated(TextDescription)).sendKeys(opportunityDescription);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void selectAssignedUserName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(PickListAssignedUser)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(PickListAssignedUserValue)).click();
    }

    public void selectTeamName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(PickListTeams)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(PickListTeamsValue)).click();
    }

    public void selectProductItem1(){
        driver.findElement(ButtonAddItem).click();
        driver.findElement(ButtonAddItem).click();
        List<WebElement> ButtonSelectItemList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@data-action='selectProduct']")));
        ButtonSelectItemList.get(0).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductName1)).click();

    }

    public void enterQtyProduct1(){
        List<WebElement> TxtEnterQty= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@data-name='quantity']")));
        actions.moveToElement(TxtEnterQty.get(0)).doubleClick().sendKeys(Keys.DELETE).perform();
        TxtEnterQty.get(0).sendKeys("3");
    }

    public boolean isProduct1Added(){
        try {
            return driver.findElement(ProductName1).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void selectProductItem2(){
        List<WebElement> ButtonSelectItemList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@data-action='selectProduct']")));
        ButtonSelectItemList.get(1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductName2)).click();
    }

    public void enterQtyProduct2(){
        List<WebElement> TxtEnterQty= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@data-name='quantity']")));
        actions.moveToElement(TxtEnterQty.get(1)).doubleClick().sendKeys(Keys.DELETE).perform();
        TxtEnterQty.get(1).sendKeys("2");
    }

    public boolean isProduct2Added(){
        try {
            return driver.findElement(ProductName2).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void ClickBtnBesideAddItem(){
        driver.findElement(ButtonBesideAddItem).click();
    }

    public void ClickBtnAddProducts(){
        wait.until(ExpectedConditions.presenceOfElementLocated(ButtonAddItems)).click();
    }

    public void AddMultipleProducts(){
        List<WebElement> CheckBoxItemNames = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span//input[@type='checkbox']")));
        CheckBoxItemNames.get(2).click();
        CheckBoxItemNames.get(3).click();
        CheckBoxItemNames.get(9).click();
    }

    public void SearchAndAddProduct(){
        WebElement SearchBox=wait.until(ExpectedConditions.visibilityOfElementLocated(TxtSeachBox));
        SearchBox.sendKeys("Buss Office Telephone");
        driver.findElement(ButtonSearchIcon).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductName1)).click();
    }

    public void ClickSelectMultipleItemsBtn(){
        driver.findElement(ButtonSelectMultipleItems).click();
    }

    public int getProductCount() {
        List<WebElement> productList =
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                        By.xpath("//div[@data-role='product-item-name']//a")
                ));

        return productList.size();
    }

    public void ScrollWindow(){
        js.executeScript("window.scrollBy(0,500);");
    }

    public void clickSaveBtn(){
            driver.findElement(BtnSave).click();
    }

    public void clickCancelBtn(){
        driver.findElement(BtnCancel).click();
    }

    public void clickMoreActionBtn(){
        driver.findElement(BtnMoreAction).click();
    }

    public void clickSaveandContinueBtn(){
        driver.findElement(BtnSaveandContinue).click();
    }

    public void clickSaveandNewBtn(){
        driver.findElement(BtnSaveandNew).click();
    }

}
