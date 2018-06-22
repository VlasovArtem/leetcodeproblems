package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 22/06/2018
 **/
public class RegularExpressionMatchingTest {

    private RegularExpressionMatching regularExpressionMatching;

    public RegularExpressionMatchingTest() {
        regularExpressionMatching = new RegularExpressionMatching();
    }

    @Test
    public void isMatch_WithMatchingString_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
    }

    @Test
    public void isMatch_WithMatchingString1_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
    }

    @Test
    public void isMatch_WithMatchingString2_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
    }

    @Test
    public void isMatch_WithMatchingString3_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("mississippipe", "mis.*ipe"));
    }

    @Test
    public void isMatch_WithMatchingString4_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("hello", "t*hello"));
    }

    @Test
    public void isMatch_WithMatchingString5_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("hello", ".ello"));
    }

    @Test
    public void isMatch_WithMatchingString6_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("aaa", "a*a"));
    }

    @Test
    public void isMatch_WithMatchingString7_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("a", "ab*"));
    }

    @Test
    public void isMatch_WithMatchingString8_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("bbbba",".*a*a"));
    }

    @Test
    public void isMatch_WithMatchingString9_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("aaa", "ab*a*c*a"));
    }

    @Test
    public void isMatch_WithNotMatchingString1_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void isMatch_WithNotMatchingString2_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("aa", "a"));
    }

    @Test
    public void isMatch_WithNotMatchingString3_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("abcd", "d*"));
    }

    @Test
    public void isMatch_WithNotMatchingString4_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("hello", "h.*plo"));
    }

    @Test
    public void isMatch_WithNotMatchingString5_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("aaa", "aaaa"));
    }

    @Test
    public void isMatch_WithNotMatchingString6_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("a", "ab*a"));
    }

    @Test
    public void isMatch_WithNotMatchingStringCornerCaseFirstLetter_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("abcdfg", "bcdfga"));
    }

    @Test
    public void isMatch_WithNullString_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch(null, "test"));
    }

    @Test
    public void isMatch_WithNullPattern_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("test", null));
    }

    @Test
    public void isMatch_WithEmptyStringAndNotEmptyPattern_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("", "test"));
    }

    @Test
    public void isMatch_WithNotEmptyStringAndEmptyPattern_ReturnFalse() {
        assertFalse(regularExpressionMatching.isMatch("Test", ""));
    }

    @Test
    public void isMatch_WithEmptyStringAndEmptyPattern_ReturnTrue() {
        assertTrue(regularExpressionMatching.isMatch("", ""));
    }

}