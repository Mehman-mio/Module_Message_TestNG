package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMessagesPage {
    private WebDriver driver;
    public AllMessagesPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "messagesMenuTaxPayer") private WebElement corrWithTaxPayerButton;
    @FindBy(id = "newMessageButton") private WebElement newMessageButton;
    @FindBy(xpath = "//div/button[@class='mr-3 btn btn-btn btn-outline-primary']") private WebElement cancelButton;
    @FindBy(id = "messagesTabMenuOutbox") private WebElement outBoxButton;
    @FindBy(xpath = "//div[@id='messagesTable']/div[1]/div[@class='table-content']") private WebElement messageLinkbox;

    public void clickCorrWithTaxPayerButton(){
        corrWithTaxPayerButton.click();
    }
    public void clickNewMessageButton(){
        newMessageButton.click();
    }
    public void allMessagesPageMethods(){
        clickCorrWithTaxPayerButton();
        clickNewMessageButton();
    }
    public void clickCancelButton(){ // for modal window
        cancelButton.click();
    }
    public void clickOutBoxButton(){
        outBoxButton.click();
    }
    public void clickMessageLinkOutBox(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(messageLinkbox)).click();
    }
    public void clickMessageLinkInBox(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(messageLinkbox)).click();
    }
    public void clickToOutBoxMethods(){
        clickCancelButton();
        clickOutBoxButton();
        clickMessageLinkOutBox();
    }
    public void allMessagesForReceiver(){
        clickCorrWithTaxPayerButton();
        clickMessageLinkInBox();
    }
}