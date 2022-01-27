package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "menuMessages") private WebElement menuMessageButton;

    public void clickMessageButton() {
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        menuMessageButton.click();
    }
}