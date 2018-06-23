package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 22/06/2018
 **/
public class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    public IntegerToRomanTest() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void intToRoman_WithNumber1_ReturnString() {
        assertEquals("III", integerToRoman.intToRoman(3));
    }

    @Test
    public void intToRoman_WithNumber2_ReturnString() {
        assertEquals("IV", integerToRoman.intToRoman(4));
    }

    @Test
    public void intToRoman_WithNumber3_ReturnString() {
        assertEquals("IX", integerToRoman.intToRoman(9));
    }

    @Test
    public void intToRoman_WithNumber4_ReturnString() {
        assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    public void intToRoman_WithNumber5_ReturnString() {
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

    @Test
    public void intToRoman_WithNumber6_ReturnString() {
        assertEquals("X", integerToRoman.intToRoman(10));
    }

    @Test
    public void intToRoman_WithNumber7_ReturnString() {
        assertEquals("XIII", integerToRoman.intToRoman(13));
    }

    @Test
    public void intToRoman_WithNumber8_ReturnString() {
        assertEquals("XX", integerToRoman.intToRoman(20));
    }

    @Test
    public void intToRoman_WithNumber9_ReturnString() {
        assertEquals("XXX", integerToRoman.intToRoman(30));
    }

    @Test
    public void intToRoman_WithNumber10_ReturnString() {
        assertEquals("CCC", integerToRoman.intToRoman(300));
    }

    @Test
    public void intToRoman_WithNumber11_ReturnString() {
        assertEquals("CX", integerToRoman.intToRoman(110));
    }

    @Test
    public void intToRoman_WithZero_ReturnEmptyString() {
        assertEquals("", integerToRoman.intToRoman(0));
    }

    @Test
    public void intToRoman_WithNegative_ReturnEmptyString() {
        assertEquals("", integerToRoman.intToRoman(-10));
    }
}