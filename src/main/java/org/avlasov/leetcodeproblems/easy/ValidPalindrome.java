package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 09/07/2018
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 *
 **/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty() || s.length() == 1) return true;
        int length = s.length();
        int head = 0;
        int tail = s.length() - 1;
        while (head - 1 != tail && head < length && tail >= 0) {
            char headChar = s.charAt(head);
            char tailChar = s.charAt(tail);
            if (isValidCharacter(headChar) && isValidCharacter(tailChar)) {
                if (isCharacterNotMatches(headChar, tailChar)) return false;
                head++;
                tail--;
            } else {
                if (!isValidCharacter(headChar))
                    head++;
                if (!isValidCharacter(tailChar))
                    tail--;
            }
        }
        return true;
    }

    private boolean isCharacterNotMatches(char aChar1, char aChar2) {
        return aChar1 != aChar2
                && (isNumber(aChar1)
                    || isNumber(aChar2)
                    || Math.abs(aChar1 - aChar2) != 32);
    }

    private boolean isValidCharacter(char aChar) {
        return isCharacter(aChar) || isNumber(aChar);
    }

    private boolean isNumber(char aChar) {
        return aChar >= '0' && aChar <= '9';
    }

    private boolean isCharacter(char aChar) {
        return (aChar >= 'a' && aChar <= 'z') || (aChar >= 'A' && aChar <= 'Z');
    }

}
