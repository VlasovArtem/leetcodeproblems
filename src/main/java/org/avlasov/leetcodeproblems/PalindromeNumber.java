package org.avlasov.leetcodeproblems;

/**
 * Created By artemvlasov on 21/06/2018
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 *
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Follow up:
 *
 * Could you solve it without converting the integer to a string?
 **/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int div = 1;
//        int div = (int) Math.pow(10, (int) Math.log10(x));
        while (x / div >= 10) div *= 10;
        while (x != 0) {
            int first = x / div;
            int last = x % 10;
            if (last != first) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

}
