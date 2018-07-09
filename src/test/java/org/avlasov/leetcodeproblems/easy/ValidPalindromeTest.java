package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 09/07/2018
 **/
public class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    public ValidPalindromeTest() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void isPalindrome_WithPalindromeString1_ReturnTrue() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void isPalindrome_WithPalindromeString2_ReturnTrue() {
        assertTrue(validPalindrome.isPalindrome("a."));
    }

    @Test
    public void isPalindrome_WithPalindromeString3_ReturnFalse() {
        assertTrue(validPalindrome.isPalindrome(".,"));
    }

    @Test
    public void isPalindrome_WithNotPalindromeString1_ReturnFalse() {
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void isPalindrome_WithNotPalindromeString3_ReturnTrue() {
        assertFalse(validPalindrome.isPalindrome("0P"));
    }

    @Test
    public void isPalindrome_WithNullString_ReturnFalse() {
        assertFalse(validPalindrome.isPalindrome(null));
    }

    @Test
    public void isPalindrome_WithEmptyString_ReturnFalse() {
        assertTrue(validPalindrome.isPalindrome(""));
    }

}