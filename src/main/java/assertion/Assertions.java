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

    //-------------------- SendLetterToLocalRevenuesTestCase ------------------------//
    public static String expected_SendLetterToLocalRevenuesTestCase;
    public static String actual_SendLetterToLocalRevenuesTestCase;

    public static void assert_SendLetterToLocalRevenuesTestCase(){
        Assert.assertEquals(expected_SendLetterToLocalRevenuesTestCase, actual_SendLetterToLocalRevenuesTestCase, "Message cannot be sent");
    }
    //---------------------------------------------------------------------------------//

}
