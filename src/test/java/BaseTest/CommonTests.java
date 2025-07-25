package BaseTest;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class CommonTests {

    public WebDriver driver;
    public String browser;
    public String os;
    protected Faker faker;

    @BeforeMethod
    public void startBrowser(){
        driver=new ChromeDriver();
        faker=new Faker();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.espocrm.com/demo/");
        driver.findElement(By.xpath("//a[text()='Live Demo']")).click();

        Select userName=new Select(driver.findElement(By.xpath("//select[@name='username']")));
        userName.selectByVisibleText("Administrator");

        Select userLanguage=new Select(driver.findElement(By.xpath("//select[@id='field-language']")));
        userLanguage.selectByValue("en_US");

        driver.findElement(By.xpath("//button[text()='Login']")).click();
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


}
