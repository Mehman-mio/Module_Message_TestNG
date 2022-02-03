package pageObjects.correspondenceWithTaxAuthorityPageClasses;

import assertion.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage_TaxAuthority {
    private WebDriver driver;
    public MessagePage_TaxAuthority(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "viewMessageContent") private WebElement getActualMessageId;

    public void setActualMessageId(){
        Assertions.actualResult = getActualMessageId.getText();
        System.out.println(Assertions.actualResult);
    }
}