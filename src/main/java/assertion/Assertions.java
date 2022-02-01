package assertion;

import org.testng.Assert;

/**
 * This class uses methods for assertions from different test cases
 */

public class Assertions {

    //-------------------- SendLetterToNationalRevenuesTestCase ------------------------//
    public static String expected_SendLetterToNationalRevenuesTestCase;
    public static String actual_SendLetterToNationalRevenuesTestCase;

    public static void assert_SendLetterToNationalRevenuesTestCase(){
        Assert.assertEquals(expected_SendLetterToNationalRevenuesTestCase, actual_SendLetterToNationalRevenuesTestCase, "Message cannot be sent");
    }
    //---------------------------------------------------------------------------------//

}
