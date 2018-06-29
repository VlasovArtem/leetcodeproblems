package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.BinaryData;
import org.avlasov.leetcodeproblems.utils.AddBinaryTestUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 29/06/2018
 **/
public class AddBinaryTest {

    private AddBinary addBinary;

    public AddBinaryTest() {
        addBinary = new AddBinary();
    }

    @Test
    public void addBinary_WithString1_ReturnString() {
        assertEquals("100", addBinary.addBinary("11", "1"));
    }

    @Test
    public void addBinary_WithString2_ReturnString() {
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }

    @Test
    public void addBinary_WithString3_ReturnString() {
        assertEquals("1000", addBinary.addBinary("1", "111"));
    }

    @Test
    public void addBinary_WithString4_ReturnString() {
        assertEquals("0", addBinary.addBinary("0", "0"));
    }

    @Test
    public void addBinary_WithString5_ReturnString() {
        assertEquals("11110", addBinary.addBinary("1111", "1111"));
    }

    @Test
    public void addBinary_WithFullDataTest_ReturnString() throws Exception {
        AddBinaryTestUtils addBinaryTestUtils = new AddBinaryTestUtils();
        List<BinaryData> binaryData = addBinaryTestUtils.readBinaryData(AddBinaryTest.class.getResource("binary_data.json").getFile());
        for (BinaryData binaryDatum : binaryData) {
            assertEquals(binaryDatum.getResultString(), addBinary.addBinary(binaryDatum.getFirstString(), binaryDatum.getSecondString()));
        }
    }

    @Test
    public void addBinary_WithNullAString_ReturnEmptyString() {
        assertEquals("", addBinary.addBinary(null, "11"));
    }

    @Test
    public void addBinary_WithNullBString_ReturnEmptyString() {
        assertEquals("", addBinary.addBinary("11", null));
    }

    @Test
    public void addBinary_WithEmptyAString_ReturnEmptyString() {
        assertEquals("", addBinary.addBinary("", "11"));
    }

    @Test
    public void addBinary_WithEmptyBString_ReturnEmptyString() {
        assertEquals("", addBinary.addBinary("11", ""));
    }

}