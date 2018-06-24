package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 24/06/2018
 **/
public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    public LongestCommonPrefixTest() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void longestCommonPrefix_WithMatchingArray1_ReturnString() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void longestCommonPrefix_WithNotMatchingArray1_ReturnString() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void longestCommonPrefixSecondSolution_WithMatchingArray1_ReturnString() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefixSecondSolution(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void longestCommonPrefixSecondSolution_WithNotMatchingArray1_ReturnString() {
        assertEquals("", longestCommonPrefix.longestCommonPrefixSecondSolution(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void longestCommonPrefixThirdSolution_WithMatchingArray1_ReturnString() {
        assertEquals("fl", longestCommonPrefix.longestCommonPrefixThirdSolution(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void longestCommonPrefixThirdSolution_WithNotMatchingArray1_ReturnString() {
        assertEquals("", longestCommonPrefix.longestCommonPrefixThirdSolution(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void longestCommonPrefix_WithMatchingArray2_ReturnString() {
        assertEquals("test", longestCommonPrefix.longestCommonPrefix(new String[]{"test"}));
    }

    @Test
    public void longestCommonPrefix_WithNullArray_ReturnEmptyString() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(null));
    }

    @Test
    public void longestCommonPrefix_WithEmptyArray_ReturnEmptyString() {
        assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{}));
    }

}