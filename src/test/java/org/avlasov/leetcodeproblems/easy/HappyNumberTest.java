package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 16/07/2018
 **/
public class HappyNumberTest {

    private HappyNumber happyNumber;

    public HappyNumberTest() {
        happyNumber = new HappyNumber();
    }

    @Test
    public void isHappy_WithHappyNumber1_ReturnTrue() {
        assertTrue(happyNumber.isHappy(1));
    }

    @Test
    public void isHappy_WithHappyNumber19_ReturnTrue() {
        assertTrue(happyNumber.isHappy(19));
    }

    @Test
    public void isHappy_WithNotHappyNumber18_ReturnTrue() {
        assertFalse(happyNumber.isHappy(18));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isHappy_WithNegativeInteger_ThrowsIllegalArgumentsException() {
        happyNumber.isHappy(-1);
    }
}