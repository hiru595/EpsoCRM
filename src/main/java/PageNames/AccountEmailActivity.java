package PageNames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountEmailActivity extends BasePage{

    public AccountEmailActivity(WebDriver driver){
         super(driver);
    }


    By TxtEmailCC = By.xpath("//input[@autocomplete='espo-cc']");
    By TxtEmailBCC = By.xpath("//input[@autocomplete='espo-bcc']");
    By TxtEmailSubject = By.xpath("//input[@data-name='subject']");
    By TxtEmailBody = By.xpath("//div[@role='textbox']");
    By BtnSendEmail = By.xpath("//button[text()='Send']");



    public void enterTxtEmailCC(String emailCC){
        wait.until(ExpectedConditions.presenceOfElementLocated(TxtEmailCC)).sendKeys(emailCC);
    }

    public void enterTxtEmailBCC(String emailBCC){
        wait.until(ExpectedConditions.presenceOfElementLocated(TxtEmailBCC)).sendKeys(emailBCC);
    }

    public void enterTxtEmailSubject(String emailSubject){
        driver.findElement(TxtEmailSubject).sendKeys(emailSubject);
    }

    public void enterTxtEmailBody(String emailBody){
        driver.findElement(TxtEmailBody).sendKeys(emailBody);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void clickBtnSendEmail(){
        wait.until(ExpectedConditions.presenceOfElementLocated(BtnSendEmail)).click();
    }

}
