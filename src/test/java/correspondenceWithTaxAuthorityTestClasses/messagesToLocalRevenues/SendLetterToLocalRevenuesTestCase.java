package correspondenceWithTaxAuthorityTestClasses.messagesToLocalRevenues;

import assertion.Assertions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.basePageObjects.LoginPage;
import pageObjects.basePageObjects.MainPage;
import pageObjects.basePageObjects.ProfileSelectionPage;
import pageObjects.correspondenceWithTaxAuthorityPageClasses.AllMessagesPage_TaxAuthority;
import pageObjects.correspondenceWithTaxAuthorityPageClasses.MessagePage_TaxAuthority;
import pageObjects.correspondenceWithTaxAuthorityPageClasses.MessageWritingPage_TaxAuthorityLocalRevenues;
import prePostConditions.BaseTest;

import java.io.IOException;

/**
 * All the test-method names explain the location(page) of executed test
 */

public class SendLetterToLocalRevenuesTestCase extends BaseTest {

    @Test(priority = 1)
    public void loginPageTest() throws IOException {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.loginPageMethodsSmartBytes();
    }
    @Test(priority = 2)//select sender TIN
    public void profileSelectionPageTest(){
        ProfileSelectionPage profileSelectionPage = PageFactory.initElements(driver, ProfileSelectionPage.class);
        profileSelectionPage.clickTinButton();
    }
    @Test(priority = 3) //click and move to messages module for sender
    public void mainPageTest(){
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickMessageButton();
    }
    @Test(priority = 4) //test where we select new message
    public void allMessagesPageTest1(){
        AllMessagesPage_TaxAuthority allMessagesPage_taxAuthority = PageFactory.initElements(driver, AllMessagesPage_TaxAuthority.class);
        allMessagesPage_taxAuthority.clickNewMessageButton_TaxAuthority();
    }
    @Test(priority = 5) //write new letter for receiver
    public void messageWritingPageTest(){
        MessageWritingPage_TaxAuthorityLocalRevenues messageWritingPage_taxAuthorityLocalRevenues = PageFactory.initElements(driver, MessageWritingPage_TaxAuthorityLocalRevenues.class);
        messageWritingPage_taxAuthorityLocalRevenues.letterWritingPageMethods_TaxAuthority();
    }
    @Test(priority = 6) //click cancel button in modal window
    public void allMessagesPageTest2(){
        AllMessagesPage_TaxAuthority allMessagesPage_taxAuthority = PageFactory.initElements(driver, AllMessagesPage_TaxAuthority.class);
        allMessagesPage_taxAuthority.allMessagesPageMethods_TaxAuthority();
    }
    @Test(priority = 7)
    public void messagePageTest_TaxAuthority(){
        MessagePage_TaxAuthority messagePage_taxAuthority = PageFactory.initElements(driver, MessagePage_TaxAuthority.class);
        messagePage_taxAuthority.setActualMessageId();
    }
    @Test(priority = 8)
    public void AssertExpectedWithActual(){
        Assertions.assert_SendMessageToTaxAuthorities();
    }
}