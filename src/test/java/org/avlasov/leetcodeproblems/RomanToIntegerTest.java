package org.avlasov.leetcodeproblems;

import org.avlasov.leetcodeproblems.utils.IntegerToRomanUtils;
import org.junit.Test;

import java.io.File;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 24/06/2018
 **/
public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;
    private Map<String, Integer> fullRomanData;

    public RomanToIntegerTest() {
        romanToInteger = new RomanToInteger();
        IntegerToRomanUtils integerToRomanUtils = new IntegerToRomanUtils();
        File dataFile = new File(RomanToIntegerTest.class.getResource("./romanToInt.txt").getFile());
        fullRomanData = integerToRomanUtils.readAllRomanNumbersData(dataFile);
    }

    @Test
    public void romanToInt_WithString1_ReturnInteger() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    public void romanToInt_WithString2_ReturnInteger() {
        assertEquals(4, romanToInteger.romanToInt("IV"));
    }

    @Test
    public void romanToInt_WithString3_ReturnInteger() {
        assertEquals(9, romanToInteger.romanToInt("IX"));
    }

    @Test
    public void romanToInt_WithString4_ReturnInteger() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    public void romanToInt_WithString5_ReturnInteger() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    public void romanToInt_WithString6_ReturnInteger() {
        assertEquals(10, romanToInteger.romanToInt("X"));
    }

    @Test
    public void romanToInt_WithString7_ReturnInteger() {
        assertEquals(13, romanToInteger.romanToInt("XIII"));
    }

    @Test
    public void romanToInt_WithString8_ReturnInteger() {
        assertEquals(20, romanToInteger.romanToInt("XX"));
    }

    @Test
    public void romanToInt_WithString9_ReturnInteger() {
        assertEquals(30, romanToInteger.romanToInt("XXX"));
    }

    @Test
    public void romanToInt_WithString10_ReturnInteger() {
        assertEquals(300, romanToInteger.romanToInt("CCC"));
    }

    @Test
    public void romanToInt_WithString11_ReturnInteger() {
        assertEquals(110, romanToInteger.romanToInt("CX"));
    }

    @Test
    public void romanToInt_WithEmptyString_ReturnZero() {
        assertEquals(0, romanToInteger.romanToInt(""));
    }

    @Test
    public void romanToInt_WithNullString_ReturnZero() {
        assertEquals(0, romanToInteger.romanToInt(null));
    }

    @Test
    public void romanToInt_FullTest() {
        for (Map.Entry<String, Integer> dataEntrySet : fullRomanData.entrySet()) {
            assertEquals(dataEntrySet.getValue().intValue(), romanToInteger.romanToInt(dataEntrySet.getKey()));
        }
    }

    @Test
    public void romanToIntSecondSolution_FullTest() {
        for (Map.Entry<String, Integer> dataEntrySet : fullRomanData.entrySet()) {
            assertEquals(dataEntrySet.getValue().intValue(), romanToInteger.romanToIntSecondSolution(dataEntrySet.getKey()));
        }
    }

    @Test
    public void romanToIntThirdSolution_FullTest() {
        for (Map.Entry<String, Integer> dataEntrySet : fullRomanData.entrySet()) {
            assertEquals(dataEntrySet.getValue().intValue(), romanToInteger.romanToIntThirdSolution(dataEntrySet.getKey()));
        }
    }

    @Test
    public void romanToIntFourthSolution_FullTest() {
        for (Map.Entry<String, Integer> dataEntrySet : fullRomanData.entrySet()) {
            assertEquals(dataEntrySet.getValue().intValue(), romanToInteger.romanToIntFourthSolution(dataEntrySet.getKey()));
        }
    }
}