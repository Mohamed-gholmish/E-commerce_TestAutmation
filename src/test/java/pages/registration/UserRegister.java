package pages.registration;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.RegisterPage;
import pages.ResultOfRegister;

import java.time.Duration;

public class UserRegister {
    WebDriver driver;

    MainPage mainWebsitepage;
    RegisterPage registerPageFields;
    ResultOfRegister resultOfRegister;

    @Description("Given the browser is open, When navigate to E-commerce website url, and click in register button then navigate to Rgister page" +
            "And input all registeration data fields, then click in registerr to navigate to  account page")
    @Test(description = "Automate user registration process")
    public void registerAndCheckIfUserCreated() {

        mainWebsitepage.click_on_register_to_open_register_page();


        registerPageFields.checkGenderType();

        registerPageFields.inputTextInFieldsRequireText("Mohammed", "Gamal",
                "mo@gmail.com", "mo123456", "mo123456");

        registerPageFields.selectDateOfBirth();

        registerPageFields.clickRegister();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(resultOfRegister.getStatusOfregister(), "Your registration completed", "User not created");


    }

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");

        mainWebsitepage = new MainPage(driver);
        registerPageFields = new RegisterPage(driver);
        resultOfRegister = new ResultOfRegister(driver);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
