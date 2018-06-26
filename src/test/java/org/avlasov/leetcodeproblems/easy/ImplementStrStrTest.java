package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class ImplementStrStrTest {

    private ImplementStrStr implementStrStr;

    public ImplementStrStrTest() {
        implementStrStr = new ImplementStrStr();
    }

    @Test
    public void strStr_WithExistingString1_ReturnInteger() {
        assertEquals(2, implementStrStr.strStr("hello", "ll"));
    }

    @Test
    public void strStr_WithExistingString2_ReturnInteger() {
        assertEquals(4, implementStrStr.strStr("mississippi","issip"));
    }

    @Test
    public void strStr_WithExistingString3_ReturnInteger() {
        assertEquals(6, implementStrStr.strStr("helloiiipp","iipp"));
    }

    @Test
    public void strStr_WithExistingString4_ReturnInteger() {
        assertEquals(4, implementStrStr.strStr("aabaaabaaac", "aabaaac"));
    }

    @Test
    public void strStr_WithNotExistingString1_ReturnInteger() {
        assertEquals(-1, implementStrStr.strStr("aaaaa", "bba"));
    }

    @Test
    public void strStr_WithNotExistingString2_ReturnInteger() {
        assertEquals(-1, implementStrStr.strStr("aaa", "aaaa"));
    }

    @Test
    public void strStr_WithNotExistingString3_ReturnInteger() {
        assertEquals(-1, implementStrStr.strStr("mississippi", "issipi"));
    }

    @Test
    public void strStr_WithNullHaystack_ReturnNegativeOne() {
        assertEquals(-1, implementStrStr.strStr(null, "test"));
    }

    @Test
    public void strStr_WithEmptyHaystack_ReturnNegativeOne() {
        assertEquals(-1, implementStrStr.strStr("", "test"));
    }

    @Test
    public void strStr_WithNullNeedle_ReturnNegativeOne() {
        assertEquals(-1, implementStrStr.strStr("test", null));
    }

    @Test
    public void strStr_WithEmptyNeedle_ReturnZero() {
        assertEquals(0, implementStrStr.strStr("test", ""));
    }
}