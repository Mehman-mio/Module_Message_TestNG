package pageObjects.correspondenceWithTaxAuthorityPageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMessagesPage_TaxAuthority {
    private WebDriver driver;
    public AllMessagesPage_TaxAuthority(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "newMessageButton") private WebElement newMessageButton;
    @FindBy(xpath = "//div/button[@class='mr-3 btn btn-btn btn-outline-primary']") private WebElement cancelButton;
    @FindBy(id = "messagesTabMenuOutbox") private WebElement outBoxButton;
//    @FindBy(id = "messagesSortToolbar-asc") private WebElement sortButton; //Sort by date the list of messages for choosing last sent message
    @FindBy(xpath = "//div[@id='messagesTable']/div[1]/div[@class='table-content']") private WebElement messageLinkbox;

    public void clickNewMessageButton_TaxAuthority(){
        newMessageButton.click();
    }
    public void clickCancelButton(){ // for modal window
        cancelButton.click();
    }
    public void clickOutBoxButton(){
        outBoxButton.click();
    }
//    public void clickSortButton(){
//        sortButton.click();
//    }
    public void clickMessageLinkOutBox(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(messageLinkbox)).click();
    }
    public void allMessagesPageMethods_TaxAuthority(){
        clickCancelButton();
        clickOutBoxButton();
//        clickSortButton();
        clickMessageLinkOutBox();
    }
}