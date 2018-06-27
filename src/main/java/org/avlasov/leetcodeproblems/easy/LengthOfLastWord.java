package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 27/06/2018
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 *
 **/
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }

}
