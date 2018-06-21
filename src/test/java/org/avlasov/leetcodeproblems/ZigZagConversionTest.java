package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created By artemvlasov on 20/06/2018
 **/
public class ZigZagConversionTest {

    private ZigZagConversion zigZagConversion;

    public ZigZagConversionTest() {
        zigZagConversion = new ZigZagConversion();
    }

    @Test
    public void convert_WithValidData1_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRING", 3);
        assertNotNull(text);
        assertEquals("PAHNAPLSIIGYIR", text);
    }

    @Test
    public void convert_WithValidData2_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRING", 4);
        assertNotNull(text);
        assertEquals("PINALSIGYAHRPI", text);
    }

    @Test
    public void convert_WithValidData3_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRING", 5);
        assertNotNull(text);
        assertEquals("PHASIYIRPLIGAN", text);
    }

    @Test
    public void convert_WithValidData4_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRINGWITHMETOO", 3);
        assertNotNull(text);
        assertEquals("PAHNTTAPLSIIGIHEOYIRWMO", text);
    }

    @Test
    public void convert_WithValidData5_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRINGWITHMETOO", 4);
        assertNotNull(text);
        assertEquals("PINMALSIGHEYAHRWTTOPIIO", text);
    }

    @Test
    public void convert_WithValidData6_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRINGWITHMETOO", 5);
        assertNotNull(text);
        assertEquals("PHTASIIHYIRWMOPLIGEOANT", text);
    }

    @Test
    public void convert_WithValidData7_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRINGWITHMETOO", 6);
        assertNotNull(text);
        assertEquals("PRTAIIEOYHNMOPSGHAIWTLI", text);
    }

    @Test
    public void convert_WithValidData8_ReturnString() {
        String text = zigZagConversion.convert("PAYPALISHIRINGWITHMETOO", 7);
        assertNotNull(text);
        assertEquals("PNAIGYRWOPIIOAHTTLSHEIM", text);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_WithNullString_ThrowsIllegalArgumentException() {
        zigZagConversion.convert(null, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_WithNegativeRows_ThrowsIllegalArgumentException() {
        zigZagConversion.convert("TEST", -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convert_WithZeroRows_ThrowsIllegalArgumentException() {
        zigZagConversion.convert("TEST", 0);
    }
}
