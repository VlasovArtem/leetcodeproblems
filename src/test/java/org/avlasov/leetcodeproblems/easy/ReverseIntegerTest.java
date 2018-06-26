package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.easy.ReverseInteger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 21/06/2018
 **/
public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    public ReverseIntegerTest() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void reverse_WithValidData1_ReturnInt() {
        assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    public void reverse_WithValidData2_ReturnInt() {
        assertEquals(-123, reverseInteger.reverse(-321));
    }

    @Test
    public void reverse_WithValidData3_ReturnInt() {
        assertEquals(21, reverseInteger.reverse(120));
    }

    @Test
    public void reverse_WithMaxValue_ReturnZero() {
        assertEquals(0, reverseInteger.reverse(1534236469));
    }

    @Test
    public void reverse_WithMinValue_ReturnZero() {
        assertEquals(0, reverseInteger.reverse(-2147483648));
    }

}
