package correspondenceWithTaxpayerTestClasses;

import assertion.Assertions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.basePageObjects.LoginPage;
import pageObjects.basePageObjects.MainPage;
import pageObjects.basePageObjects.ProfileSelectionPage;
import pageObjects.correspondenceWithTaxpayerPageClasses.AllMessagesPage_Taxpayer;
import pageObjects.correspondenceWithTaxpayerPageClasses.MessagePage_Taxpayer;
import pageObjects.correspondenceWithTaxpayerPageClasses.MessageWritingPage_Taxpayer;
import prePostConditions.BaseTest;
import java.io.IOException;

/**
 * All the test-method names explain the location(page) of executed test
 */

public class SendMessageFromTaxpayerToTaxpayerTestCase extends BaseTest {

    @Test(priority = 1)
    public void loginPageTest1() throws IOException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageMethodsCybernet();
    }
    @Test(priority = 2) //select sender TIN
    public void profileSelectionPageTest1(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test(priority = 3) //click and move to messages module for sender
    public void mainPageTest1(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickMessageButton();
    }
    @Test(priority = 4) //test where we select new message
    public void allMessagesPageTest1(){
        AllMessagesPage_Taxpayer allMessagesPageTaxpayer = PageFactory.initElements(driver, AllMessagesPage_Taxpayer.class);
        allMessagesPageTaxpayer.allMessagesPageMethods();
    }
    @Test(priority = 5) //write new letter for receiver
    public void messageWritingPageTest() throws IOException{
        MessageWritingPage_Taxpayer messageWritingPage_taxpayer = PageFactory.initElements(driver, MessageWritingPage_Taxpayer.class);
        messageWritingPage_taxpayer.messageWritingPageMethods();
    }
    @Test(priority = 6) //test where we move to outbox messages for sender
    public void allMessagesPageTest2(){
        AllMessagesPage_Taxpayer allMessagesPageTaxpayer = PageFactory.initElements(driver, AllMessagesPage_Taxpayer.class);
        allMessagesPageTaxpayer.clickToOutBoxMethods();
    }
    @Test(priority = 7) //set expected result
    public void messagePageTest1(){
        MessagePage_Taxpayer messagePageTaxpayer = PageFactory.initElements(driver, MessagePage_Taxpayer.class);
        messagePageTaxpayer.messagePageMethods();
    }
    @Test(priority = 8) //log in with receiver credentials
    public void loginPageTest2() throws IOException{
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageMethodsSmartBytes();
    }
    @Test(priority = 9) //select receiver TIN
    public void profileSelectionPageTest2(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test(priority = 10) //click and move to messages module for receiver
    public void mainPageTest2(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickMessageButton();
    }
    @Test(priority = 11) //test where we move to outbox messages for receiver
    public void allMessagesPageTest3() {
        AllMessagesPage_Taxpayer allMessagesPageTaxpayer = PageFactory.initElements(driver, AllMessagesPage_Taxpayer.class);
        allMessagesPageTaxpayer.allMessagesForReceiver();
    }
    @Test(priority = 12) //set actual result
    public void messagePageTest2(){
        MessagePage_Taxpayer messagePageTaxpayer = PageFactory.initElements(driver, MessagePage_Taxpayer.class);
        messagePageTaxpayer.setActualMessageId();
    }
    @Test(priority = 13) //assert actual with expected
    public void AssertExpectedWithActual(){
        Assertions.assert_SendMessageFromTaxpayerToTaxpayerTestCase();
    }
}