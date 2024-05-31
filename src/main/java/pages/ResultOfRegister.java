package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultOfRegister {
    WebDriver driver;
    By creationResultxpath = By.xpath("//div[@class='result']");

    public ResultOfRegister(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatusOfregister(){
        return driver.findElement(creationResultxpath).getText();
    }
}
