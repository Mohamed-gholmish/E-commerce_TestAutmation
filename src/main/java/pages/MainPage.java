package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;

    By registerXpath = By.xpath("//a[contains(text(),'Register')]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void click_on_register_to_open_register_page() {
        driver.findElement(registerXpath).click();
    }
}
