package messageTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.*;
import prePostConditions.BaseTest;
import java.io.IOException;

/**
 * All the test-method names explain the location(page) of executed test
 */

public class SendAndRecieveMessageTests extends BaseTest {

    @Test
    public void loginPageTest1() throws IOException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageMethodsSender();
    }
    @Test //select sender TIN
    public void profileSelectionPageTest1(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test //click and move to messages module for sender
    public void mainPageTest1(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickMessageButton();
    }
    @Test //test where we select new message
    public void allMessagesPageTest1(){
        AllMessagesPage allMessagesPage = PageFactory.initElements(driver, AllMessagesPage.class);
        allMessagesPage.allMessagesPageMethods();
    }
    @Test //write new letter for receiver
    public void messageWritingPageTest() throws IOException{
        MessageWritingPage messageWritingPage = PageFactory.initElements(driver, MessageWritingPage.class);
        messageWritingPage.messageWritingPageMethods();
    }
    @Test //test where we move to outbox messages for sender
    public void allMessagesPageTest2(){
        AllMessagesPage allMessagesPage = PageFactory.initElements(driver, AllMessagesPage.class);
        allMessagesPage.clickToOutBoxMethods();
    }
    @Test //set expected result
    public void messagePageTest1(){
        MessagePage messagePage = PageFactory.initElements(driver, MessagePage.class);
        messagePage.messagePageMethods();
    }
    @Test //log in with receiver credentials
    public void loginPageTest2() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageMethodsReciever();
    }
    @Test //select receiver TIN
    public void profileSelectionPageTest2(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test //click and move to messages module for receiver
    public void mainPageTest2(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickMessageButton();
    }
    @Test //test where we move to outbox messages for receiver
    public void allMessagesPageTest3() {
        AllMessagesPage allMessagesPage = PageFactory.initElements(driver, AllMessagesPage.class);
        allMessagesPage.allMessagesForReceiver();
    }
    @Test //set actual result
    public void messagePageTest2(){
        MessagePage messagePage = PageFactory.initElements(driver, MessagePage.class);
        messagePage.setActualMessageId();
    }
    @Test //assert actual with expected
    public void AssertExpectedWithActual(){
        MessagePage messagePage = PageFactory.initElements(driver, MessagePage.class);
        String expected = messagePage.setExpectedMessageId();
        String actual = messagePage.setActualMessageId();
        messagePage.assertValues(expected,actual);
    }
}