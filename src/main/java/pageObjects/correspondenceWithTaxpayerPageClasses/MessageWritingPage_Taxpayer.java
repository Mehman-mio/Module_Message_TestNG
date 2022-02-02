package pageObjects.correspondenceWithTaxpayerPageClasses;

import config.Config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.TestUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MessageWritingPage_Taxpayer {
    private WebDriver driver;
    public MessageWritingPage_Taxpayer(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//input[starts-with(@id,'react-select-')]") private WebElement voenField;
    @FindBy(id = "newMessageSubject") private WebElement newMessageSubjectField;
    @FindBy(id = "newMessageContent") private WebElement newMessageContentField;
    @FindBy(id = "newMessageManagerName") private WebElement newMessageManagerNameField; //temporarily
    @FindBy(id = "newMessagePosition") private WebElement newMessagePositionField;
    @FindBy(id = "newMessageSendButton") private WebElement newMessageSendButton;

    public void inputVoen() throws IOException {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        voenField.sendKeys(Config.getVoenOfReceiver());
        TestUtils.sleep(4000);
        voenField.sendKeys(Keys.ENTER);
    }
    public void inputSubject(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        newMessageSubjectField.sendKeys("Test");
    }
    public void inputContent(){
        newMessageContentField.sendKeys("Salam Anar!");
    }
    public void inputManagerName(){
        newMessageManagerNameField.sendKeys("Huseynov Murad"); //temporarily
    }
    public void inputPosition(){
        newMessagePositionField.sendKeys("Direktor");
    }
    public void clickSendButton(){
        newMessageSendButton.click();
    }
    public void messageWritingPageMethods() throws IOException{
        inputVoen();
        inputSubject();
        inputContent();
        inputManagerName(); //temporarily
        inputPosition();
        clickSendButton();
    }
}