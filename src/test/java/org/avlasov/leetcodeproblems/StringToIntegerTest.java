package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 21/06/2018
 **/
public class StringToIntegerTest {

    private StringToInteger stringToInteger;

    public StringToIntegerTest() {
        stringToInteger = new StringToInteger();
    }

    @Test
    public void myAtoi_WithNumberString_ReturnInt() {
        assertEquals(123, stringToInteger.myAtoi("123"));
    }

    @Test
    public void myAtoi_WithNumberString1_ReturnInt() {
        assertEquals(0, stringToInteger.myAtoi("+-2"));
    }

    @Test
    public void myAtoi_WithNumberString2_ReturnInt() {
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("9223372036854775808"));
    }

    @Test
    public void myAtoi_WithNumberString3_ReturnInt() {
        assertEquals(0, stringToInteger.myAtoi("-+1"));
    }

    @Test
    public void myAtoi_WithNumberString4_ReturnInt() {
        assertEquals(0, stringToInteger.myAtoi(" "));
    }

    @Test
    public void myAtoi_WithNumberString5_ReturnInt() {
        assertEquals(1, stringToInteger.myAtoi("+1"));
    }

    @Test
    public void myAtoi_WithNumberString6_ReturnInt() {
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("18446744073709551617"));
    }

    @Test
    public void myAtoi_WithTrillingSpaceString_ReturnInt() {
        assertEquals(-123, stringToInteger.myAtoi("      -123"));
    }

    @Test
    public void myAtoi_WithNumberAndTextString_ReturnInt() {
        assertEquals(426, stringToInteger.myAtoi("426 Hell test"));
    }

    @Test
    public void myAtoi_WitNumberLessThenMinValueInt_ReturnInt() {
        assertEquals(Integer.MIN_VALUE, stringToInteger.myAtoi("-91283472332"));
    }

    @Test
    public void myAtoi_WitNumberGreaterThenMaxValueInt_ReturnInt() {
        assertEquals(Integer.MAX_VALUE, stringToInteger.myAtoi("91283472332"));
    }

    @Test
    public void myAtoi_WithNullString_ReturnZero() {
        assertEquals(0, stringToInteger.myAtoi(null));
    }

    @Test
    public void myAtoi_WithEmptyString_ReturnZero() {
        assertEquals(0, stringToInteger.myAtoi(""));
    }

    @Test
    public void myAtoi_WithNotDigitStartString_ReturnZero() {
        assertEquals(0, stringToInteger.myAtoi("test 123"));
    }



}