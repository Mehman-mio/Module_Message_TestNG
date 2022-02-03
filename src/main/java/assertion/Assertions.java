package assertion;

import org.testng.Assert;

/**
 * This class uses methods for assertions from different test cases
 */

public class Assertions {

    //-------------------- SendMessageToTaxAuthorities ------------------------//
    public static String expectedResult;
    public static String actualResult;

    public static void assert_SendMessageToTaxAuthorities(){
        Assert.assertEquals(expectedResult, actualResult, "Message cannot be sent");
    }
    //---------------------------------------------------------------------------------//

    //-------------------- SendMessageFromTaxpayerToTaxpayerTestCase ------------------------//
    public static String expected_SendMessageFromTaxpayerToTaxpayerTestCase;
    public static String actual_SendMessageFromTaxpayerToTaxpayerTestCase;

    public static void assert_SendMessageFromTaxpayerToTaxpayerTestCase(){
        Assert.assertEquals(expected_SendMessageFromTaxpayerToTaxpayerTestCase, actual_SendMessageFromTaxpayerToTaxpayerTestCase, "Message cannot be sent");
    }
    //---------------------------------------------------------------------------------//

}
