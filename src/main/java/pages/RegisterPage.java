package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    By genderRadioButtonCssSelector = By.cssSelector("input[type='radio'][value='M']");

    By firstNamexpath = By.xpath("//input[@name='FirstName']");
    By lastNamexpath = By.xpath("//input[@name='LastName']");
    By emailxPath = By.xpath("//input[@name='Email']");
    By passwordxPath = By.xpath("//input[@name='Password']");
    By confirmPasswordxPath = By.xpath("//input[@name='ConfirmPassword']");

    By dateOfBirthxPath = By.xpath("//select[@name='DateOfBirthDay']");
    By dayXpath = By.xpath("//option[@value='8']");
    By submitRgisterxpath = By.xpath("//button[@name='register-button']");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkGenderType() {
        driver.findElement(genderRadioButtonCssSelector).click();
    }

    public void inputField(By locator, String inputKeys) {
        driver.findElement(locator).sendKeys(inputKeys);

    }

    public void inputTextInFieldsRequireText(String userFirstName, String userLastName, String userEmail, String userPassword,
                                             String confirmUserPassword) {
        inputField(firstNamexpath, userFirstName);
        inputField(lastNamexpath, userLastName);
        inputField(emailxPath, userEmail);
        inputField(passwordxPath, userPassword);
        inputField(confirmPasswordxPath, confirmUserPassword);

    }

    public void selectDateOfBirth() {
        driver.findElement(dateOfBirthxPath).click();
        driver.findElement(dayXpath).click();
    }

    public void clickRegister() {
        driver.findElement(submitRgisterxpath).click();

    }


}
