package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 21/06/2018
 **/
public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    public PalindromeNumberTest() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void isPalindrome_WithNegativeNumber_ReturnFalse() {
        assertFalse(palindromeNumber.isPalindrome(-325));
    }

    @Test
    public void isPalindrome_WithNumber_ReturnTrue() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void isPalindrome_WithNotPalindrome_ReturnFalse() {
        assertFalse(palindromeNumber.isPalindrome(5625));
    }

    @Test
    public void isPalindrome_WithNotPalindrome1_ReturnFalse() {
        assertFalse(palindromeNumber.isPalindrome(531));
    }

    @Test
    public void isPalindrome_WithNotPalindrome2_ReturnFalse() {
        assertFalse(palindromeNumber.isPalindrome(Integer.MAX_VALUE));
    }

    @Test
    public void isPalindrome_WithPalindrome2_ReturnFalse() {
        assertTrue(palindromeNumber.isPalindrome(1098778901));
    }

}