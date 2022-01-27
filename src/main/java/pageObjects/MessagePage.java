package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.TestUtils;

public class MessagePage {
    private WebDriver driver;
    public MessagePage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "//div[@id='viewMessageRegNumber']/span") private WebElement getExpectedMessageId;
    @FindBy(name = "logOut") private WebElement logOutButton;
    @FindBy(xpath = "//div[@id='viewMessageRegNumber']/span") private WebElement getActualMessageId;

    public String setExpectedMessageId(){
        String expectedMessageId = getExpectedMessageId.getText();
        return expectedMessageId;
    }
    public void clickLogOutButton(){
        TestUtils.sleep(5000);
        logOutButton.click();
    }
    public String setActualMessageId(){
        String actualMessageId = getActualMessageId.getText();
        return actualMessageId;
    }
    public void assertValues(String expected, String actual){
        System.out.println(expected + " " + actual);
        Assert.assertEquals(actual,expected, "Message was not sent");
    }
    public void messagePageMethods(){
        setExpectedMessageId();
        clickLogOutButton();
    }
}