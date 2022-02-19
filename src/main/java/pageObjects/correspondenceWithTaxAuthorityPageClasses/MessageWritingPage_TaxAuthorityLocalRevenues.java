package pageObjects.correspondenceWithTaxAuthorityPageClasses;

import assertion.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MessageWritingPage_TaxAuthorityLocalRevenues {
    private WebDriver driver;

    public MessageWritingPage_TaxAuthorityLocalRevenues(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "newMessageTaxAuthorityTo") private WebElement receiverField;
    @FindBy(id = "newMessageTaxAuthority-15") private WebElement localRevenues;
    @FindBy(id = "newMessageType") private WebElement typeOfMessageField;
    @FindBy(id = "messageType-leter") private WebElement typeLetter;
    @FindBy(id = "messageType-request") private WebElement typeRequest;
    @FindBy(id = "messageType-complaint") private WebElement typeComplaint;
    @FindBy(id = "messageType-sentence") private WebElement typeSentence;
    @FindBy(id = "messageType-thanks") private WebElement typeThanks;
    @FindBy(id = "newMessageSubject") private WebElement newMessageSubjectField;
    @FindBy(id = "newMessageContent") private WebElement newMessageContentField;
    @FindBy(id = "newMessageManagerName") private WebElement newMessageManagerNameField; //temporarily
    @FindBy(id = "newMessagePosition") private WebElement newMessagePositionField;
    @FindBy(id = "newMessageSendButton") private WebElement newMessageSendButton;

    public void selectReceiver() {
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        receiverField.click();
        TestUtils.sleep(4000);
        localRevenues.click();
    }
    public void selectTypeOfMessageLetter() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(typeOfMessageField)).click();
        TestUtils.sleep(4000);
        typeLetter.click();
    }
    public void selectTypeOfMessageRequest() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(typeOfMessageField)).click();
        TestUtils.sleep(4000);
        typeRequest.click();
    }
    public void selectTypeOfMessageComplaint() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(typeOfMessageField)).click();
        TestUtils.sleep(4000);
        typeComplaint.click();
    }
    public void selectTypeOfMessageSentence() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(typeOfMessageField)).click();
        TestUtils.sleep(4000);
        typeSentence.click();
    }
    public void selectTypeOfMessageThanks() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(typeOfMessageField)).click();
        TestUtils.sleep(4000);
        typeThanks.click();
    }
    public void inputSubject(){
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        newMessageSubjectField.sendKeys("Subject field for test");
    }
    public void inputContent(){ //This method randomly generates ID for expected result in body when sending message. Then it will be used as an actual result in outbox message.
        String uuid = UUID.randomUUID().toString();
        newMessageContentField.sendKeys(uuid);
        TestUtils.sleep(1000);
        Assertions.expected_SendLetterToLocalRevenuesTestCase = newMessageContentField.getText();
        System.out.println(Assertions.expected_SendLetterToLocalRevenuesTestCase);
        TestUtils.sleep(1000);
    }
    public void inputManagerName(){
        newMessageManagerNameField.sendKeys("Huseynov Murad"); //temporarily
    }
    public void inputPosition(){
        newMessagePositionField.sendKeys("Direktor");
    }
    public void clickSendButton(){ newMessageSendButton.click(); }

    public void letterWritingPageMethods_TaxAuthority(){
        selectReceiver();
        selectTypeOfMessageLetter();
        inputSubject();
        inputContent();
        inputManagerName(); //temporarily
        inputPosition();
        clickSendButton();
    }
    public void requestWritingPageMethods_TaxAuthority(){
        selectReceiver();
        selectTypeOfMessageRequest();
        inputSubject();
        inputContent();
        inputManagerName(); //temporarily
        inputPosition();
        clickSendButton();
    }
    public void complaintWritingPageMethods_TaxAuthority(){
        selectReceiver();
        selectTypeOfMessageComplaint();
        inputSubject();
        inputContent();
        inputManagerName(); //temporarily
        inputPosition();
        clickSendButton();
    }
    public void sentenceWritingPageMethods_TaxAuthority(){
        selectReceiver();
        selectTypeOfMessageSentence();
        inputSubject();
        inputContent();
        inputManagerName(); //temporarily
        inputPosition();
        clickSendButton();
    }
    public void thanksWritingPageMethods_TaxAuthority(){
        selectReceiver();
        selectTypeOfMessageThanks();
        inputSubject();
        inputContent();
        inputManagerName(); //temporarily
        inputPosition();
        clickSendButton();
    }
}