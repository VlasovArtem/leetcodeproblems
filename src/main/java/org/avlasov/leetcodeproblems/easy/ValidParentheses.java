package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 25/06/2018
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * <p>
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * <p>
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 **/
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) return false;
        else if (s.isEmpty()) return true;
        boolean[] brackets = new boolean[s.length()];
        int closedBrackets = 0;
        for (int i = 1; i < brackets.length; i++) {
            char aChar = s.charAt(i);
            if (isCloseBracket(aChar)) {
                int k = i;
                do {
                    k--;
                } while (brackets[k]);
                if (isNotOpenBracket(aChar, s.charAt(k))) return false;
                brackets[i] = true;
                brackets[k] = true;
                closedBrackets += 2;
            }
        }
        return closedBrackets == s.length();
    }

    //Fastest
    public boolean isValidSecondSolution(String s) {
        if (s == null || s.length() % 2 != 0) return false;
        else if (s.isEmpty()) return true;
        char[] chars = new char[s.length() / 2];
        int openBrackets = 0;
        for (int i = 0; i < s.length(); i++) {
            char aChar = s.charAt(i);
            switch (aChar) {
                case '(':
                case '{':
                case '[':
                    if (openBrackets + 1 > chars.length) return false;
                    chars[openBrackets++] = aChar;
                    break;
                case ')':
                    if (openBrackets > 0)
                        if (chars[--openBrackets] == '(') break;
                    return false;
                case '}':
                    if (openBrackets > 0)
                        if (chars[--openBrackets] == '{') break;
                    return false;
                case ']':
                    if (openBrackets > 0)
                        if (chars[--openBrackets] == '[') break;
                    return false;
            }
        }
        return openBrackets == 0;
    }

    private boolean isNotOpenBracket(char closeBracket, char openBracket) {
        char openBracketChar = Character.MIN_VALUE;
        switch (closeBracket) {
            case ')':
                openBracketChar = '(';
                break;
            case '}':
                openBracketChar = '{';
                break;
            case ']':
                openBracketChar = '[';
                break;
        }
        return openBracketChar != openBracket;
    }

    private boolean isCloseBracket(char bracket) {
        return bracket == ')' || bracket == '}' || bracket == ']';
    }

}
