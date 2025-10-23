package PageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateContact extends BasePage{

    public CreateContact(WebDriver driver){
        super(driver);
    }

    By BtnFullForm = By.xpath("//button[text()='Full Form']");
    By pickListName = By.xpath("//div[@class='selectize-input items full has-options has-items']");
    By pickListNameOptions = By.xpath("//div[text()='Mrs.']");
    By txtFirstName= By.xpath("//input[@data-name='firstName']");
    By txtLastName = By.xpath("//input[@data-name='lastName']");
    By txtEmail = By.xpath("//input[@type='email']");
    By txtPhone = By.xpath("//input[@autocomplete='espo-phoneNumber']");
    By uploadFile = By.xpath("//input[@type='file']");
    By txtBirthDate = By.xpath("//input[@data-name='birthday']");
    By txtCurrentMonthYear = By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']");
    By txtCurrentYear = By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']");
    By btnPreviousYearRange = By.xpath("//div[@class='datepicker-years']//th[@class='prev']");
    By selectYear = By.xpath("//span[text()='1995']");
    By selectMonth = By.xpath("//span[text()='Jul']");
    By selectDate = By.xpath("//td[text()='18']");
    By selectAssignedUser = By.xpath("//input[@data-name='assignedUserName']");
    By selectAssignedUservalue = By.xpath("//div[text()='Jack Adams']");
    By selectTeam = By.xpath("//div[@data-name='teams']//input");
    By selectTeamValue = By.xpath("//div[text()='Sales']");
    By btnSave = By.xpath("//button[text()='Save']");
    By txtDescription = By.xpath("//textarea[@data-name='description']");

    public void clickBtnFullForm(){
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnFullForm)).click();
    }

    public void enterTxtName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(pickListName)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(pickListNameOptions)).click();
    }

    public void enterFirstName(String contactFirstName){
        driver.findElement(txtFirstName).sendKeys(contactFirstName);
    }

    public void enterLastName(String contactLastName){
        driver.findElement(txtLastName).sendKeys(contactLastName);
    }

    public void enterEmail(String contactEmail){
        driver.findElement(txtEmail).sendKeys(contactEmail);
    }

    public void enterPhone(String contactPhone){
        driver.findElement(txtPhone).sendKeys(contactPhone);
    }

    public void uploadPhotoFile(){
        wait.until(ExpectedConditions.presenceOfElementLocated(uploadFile)).sendKeys("C:\\Users\\Hiren\\OneDrive - logicrain.com\\Documents\\Dummy files for testing and upload\\1mb-jpg-example-file.jpg");
    }

    public void enterBirthDate(){
        driver.findElement(txtBirthDate).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(txtCurrentMonthYear)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(txtCurrentYear)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(btnPreviousYearRange)).click(); //Year Range 2010-2019
        wait.until(ExpectedConditions.presenceOfElementLocated(btnPreviousYearRange)).click(); //Year Range 2000-2009
        wait.until(ExpectedConditions.presenceOfElementLocated(btnPreviousYearRange)).click();//Year Range 1990-1999
        wait.until(ExpectedConditions.presenceOfElementLocated(selectYear)).click(); //Year 1995
        wait.until(ExpectedConditions.presenceOfElementLocated(selectMonth)).click(); //Month Jul
        wait.until(ExpectedConditions.presenceOfElementLocated(selectDate)).click(); //Date 18
    }

    public void selectAssignedUserName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(selectAssignedUser)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(selectAssignedUservalue)).click();
    }

    public void setSelectTeamName(){
        wait.until(ExpectedConditions.presenceOfElementLocated(selectTeam)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(selectTeamValue)).click();
    }

    public void enterContactDescription(String contactDescription){
       wait.until(ExpectedConditions.presenceOfElementLocated(txtDescription)).sendKeys(contactDescription);
       actions.sendKeys(Keys.ENTER).perform();
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
