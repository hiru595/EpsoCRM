package PageNames;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    By ProductName1 = By.xpath("//a[text()='Buss Office Telephone']");
    By ProductName2 = By.xpath("//a[text()='Bright FHD Monitor']");
    By btnSave = By.xpath("//button[text()='Save']");


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

    public void clickSaveBtn(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(btnSave).click();
    }

}
