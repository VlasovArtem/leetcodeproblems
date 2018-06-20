package org.avlasov.leetcodeproblems;

/**
 * Created By artemvlasov on 20/06/2018
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Input: "cbbd"
 * Output: "bb"
 **/
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null) throw new IllegalArgumentException("Argument should not be null");
        if (s.length() <= 1) return s;
        char[] chars = s.toCharArray();
        int length = chars.length;
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < length; i++) {
            int k = i - 1, l = i;
            while (l < length - 1 && chars[l] == chars[l + 1]) l++;
            i = l++;
            while (k >= 0 && l < length && chars[k] == chars[l]) {
                k--;
                l++;
            }
            if (l - k - 1 > maxLength) {
                maxLength = l - k - 1;
                start = k + 1;
            }
        }
        return s.substring(start, start + maxLength);
    }

}
