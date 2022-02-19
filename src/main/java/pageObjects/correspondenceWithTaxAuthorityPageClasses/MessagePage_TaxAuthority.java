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
        Assertions.actual_SendLetterToNationalRevenuesTestCase = getActualMessageId.getText();
        System.out.println(Assertions.actual_SendLetterToNationalRevenuesTestCase);
    }
}