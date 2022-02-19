package pageObjects.correspondenceWithTaxpayerPageClasses;

import assertion.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.TestUtils;

public class MessagePage_Taxpayer {
    private WebDriver driver;
    public MessagePage_Taxpayer(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@id='viewMessageRegNumber']/span") private WebElement getExpectedMessageId;
    @FindBy(name = "logOut") private WebElement logOutButton;
    @FindBy(xpath = "//div[@id='viewMessageRegNumber']/span") private WebElement getActualMessageId;

    public void setExpectedMessageId(){
        Assertions.expected_SendMessageFromTaxpayerToTaxpayerTestCase = getExpectedMessageId.getText();
    }
    public void clickLogOutButton(){
        TestUtils.sleep(5000);
        logOutButton.click();
    }
    public void setActualMessageId(){
        Assertions.actual_SendMessageFromTaxpayerToTaxpayerTestCase = getActualMessageId.getText();
    }
    public void messagePageMethods(){
        setExpectedMessageId();
        clickLogOutButton();
    }
}