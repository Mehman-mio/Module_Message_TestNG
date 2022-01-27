package pageObjects;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//div/a[@id='loginTabsAsan']") private WebElement asanImzaTab;
    @FindBy(xpath = "//div/input[@name='phone']") private WebElement phoneField;
    @FindBy(xpath = "//div/input[@name='userId']") private WebElement idField;
    @FindBy(xpath = "//span[@aria-disabled='false']") private WebElement mockToggleButton;
    @FindBy(xpath = "//div/button[@id='loginPageSignInButton']") private WebElement loginButton;

    public void clickAsanImzaTab() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(asanImzaTab));
        asanImzaTab.click();
    }
    public void inputPhone(String phone) throws IOException{
        phoneField.sendKeys(phone);
    }
    public void inputId(String id) throws IOException {
        idField.sendKeys(id);
    }
    public void setMockToggleButton(){
        Actions action = new Actions(driver); // This object was created for using .doubleClick() method
        action.doubleClick(mockToggleButton).perform();
    }
    public void clickLoginButton() {
        loginButton.click();
    }
    public void loginPageMethodsSender() throws IOException{
        clickAsanImzaTab();
        inputPhone(Config.getPhoneSender());
        inputId((Config.getIdSender()));
        setMockToggleButton();
        clickLoginButton();
    }
    public void loginPageMethodsReciever() throws IOException{
        clickAsanImzaTab();
        inputPhone(Config.getPhoneReceiver());
        inputId(Config.getIdReceiver());
        setMockToggleButton();
        clickLoginButton();
    }
}