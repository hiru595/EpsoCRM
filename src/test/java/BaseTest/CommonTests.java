package BaseTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class CommonTests {

    public WebDriver driver;
    public String browser;
    public String os;
    protected Faker faker;

    @BeforeMethod
    public void startBrowser(){
        ChromeOptions options = new ChromeOptions();


        // Disable Chrome autofill/address save popups
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("autofill.profile_enabled", false);
        prefs.put("autofill.credit_card_enabled", false);
        prefs.put("profile.autofill_profile_enabled", false);
        prefs.put("profile.autofill_credit_card_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-autofill-keyboard-accessory-view");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");


        driver=new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        faker=new Faker();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://demo.us.espocrm.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        Select userName = new Select(driver.findElement(By.name("username")));
        userName.selectByVisibleText("Administrator");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("field-language")));
        Select userLanguage = new Select(driver.findElement(By.id("field-language")));
        userLanguage.selectByValue("en_US");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']"))).click();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(15000);
        if (driver != null) {
            driver.quit();
        }
    }

    public String getName(){
        return faker.name().name();
    }

    public String getWebsite(){
        return faker.internet().url();
    }

    public String getEmail(){
        return faker.internet().emailAddress();
    }


    public String getPhoneNumber(){
        return faker.phoneNumber().phoneNumber();
    }

    public String getStreetAddress(){
        return faker.address().streetAddress();
    }

    public String getCityName(){
        return faker.address().cityName();
    }

    public String getStateName(){
       return faker.address().state();
    }

    public String getPostalCode(){
        return faker.address().zipCode();
    }

    public String getCountryName(){
        return faker.address().country();
    }

}
