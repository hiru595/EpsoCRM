package UtilityFiles;
import com.github.javafaker.Faker;

public class TestDataGenerator {
    private final Faker faker;

    public TestDataGenerator() {
        this.faker = new Faker();
    }

    public String getName() {
        return faker.name().fullName();
    }

    public String getFirstName(){
        return faker.name().firstName();
    }

    public String getLastName(){
        return faker.name().lastName();
    }

    public String getWebsite() {
        return faker.internet().url();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getPhoneNumber() {
        return faker.phoneNumber().cellPhone();
    }

    public String getStreetAddress() {
        return faker.address().streetAddress();
    }

    public String getCityName() {
        return faker.address().cityName();
    }

    public String getStateName() {
        return faker.address().state();
    }

    public String getPostalCode() {
        return faker.address().zipCode();
    }

    public String getCountryName() {
        return faker.address().country();
    }
}
