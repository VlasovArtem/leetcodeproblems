package org.avlasov.leetcodeproblems;

import java.util.Arrays;

/**
 * Created By artemvlasov on 22/06/2018
 * <p>
 * <p>
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * Note:
 * <p>
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s = "aa"
 * p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * <p>
 * Example 2:
 * <p>
 * Input:
 * s = "aa"
 * p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the precedeng element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * <p>
 * Example 3:
 * <p>
 * Input:
 * s = "ab"
 * p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * <p>
 * Example 4:
 * <p>
 * Input:
 * s = "aab"
 * p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore it matches "aab".
 * <p>
 * Example 5:
 * <p>
 * Input:
 * s = "mississippi"
 * p = "mis*is*p*."
 * Output: false
 **/
public class RegularExpressionMatching {

    public boolean isMatch(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--){
            for (int j = pattern.length() - 1; j >= 0; j--){
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        System.out.println(text);
        System.out.println(pattern);
        System.out.println(Arrays.deepToString(dp));
        return dp[0][0];
    }

    public boolean isMatch1(String s, String p) {
        if (isNotValidArguments(s, p) || isNotValidPattern(p)) return false;
        if (s.isEmpty() && p.isEmpty() || ".*".equals(p)) return true;
        if (checkCornerCase(s, p)) {
            return match(s.toCharArray(), p.toCharArray(), 0, 0);
        }
        return false;
    }

    private boolean match(char[] stringArray, char[] patternArray, int stringArrayStart, int patternArrayStart) {
        int currentStringArrayIndex = stringArrayStart;
        int currentPatternArrayIndex = patternArrayStart;
        char wildcardSymbol = Character.MIN_VALUE;
        while (currentPatternArrayIndex < patternArray.length) {
            if (wildcardSymbol == Character.MIN_VALUE
                    && currentPatternArrayIndex + 1 < patternArray.length
                    && patternArray[currentPatternArrayIndex + 1] == '*') {
                wildcardSymbol = patternArray[currentPatternArrayIndex];
                currentPatternArrayIndex += 2;
                if (wildcardSymbol == '.' && currentPatternArrayIndex >= patternArray.length - 1) return true;
            }
            if (wildcardSymbol == Character.MIN_VALUE) {
                if (currentStringArrayIndex >= stringArray.length) return false;
                if (patternArray[currentPatternArrayIndex] == '.') {
                    currentStringArrayIndex++;
                    currentPatternArrayIndex++;
                } else if (stringArray[currentStringArrayIndex] != patternArray[currentPatternArrayIndex]) {
                    if (currentPatternArrayIndex + 1 < patternArray.length && patternArray[currentPatternArrayIndex + 1] == '*') {
                        currentPatternArrayIndex += 2;
                    } else
                        return false;
                } else {
                    if (stringArray[currentStringArrayIndex] == patternArray[currentPatternArrayIndex])
                        currentStringArrayIndex++;
                    currentPatternArrayIndex++;
                }
            } else {
                if (wildcardSymbol == '.') {
                    if (currentStringArrayIndex >= stringArray.length) {
                        wildcardSymbol = Character.MIN_VALUE;
                        currentPatternArrayIndex++;
                    } else {
                        if (patternArray[currentPatternArrayIndex] == stringArray[currentStringArrayIndex]) {
                            boolean match = match(stringArray, patternArray, currentStringArrayIndex, currentPatternArrayIndex);
                            if (match) return true;
                        }
                        currentStringArrayIndex++;
                    }
                } else if (currentStringArrayIndex >= stringArray.length) {
                    wildcardSymbol = Character.MIN_VALUE;
                } else if (wildcardSymbol == stringArray[currentStringArrayIndex]) {
                    if (currentPatternArrayIndex < patternArray.length
                            && (patternArray[currentPatternArrayIndex] == stringArray[currentStringArrayIndex]
                                || (currentPatternArrayIndex + 1 < patternArray.length && patternArray[currentPatternArrayIndex + 1] == '*'))) {
                        boolean match = match(stringArray, patternArray, currentStringArrayIndex, currentPatternArrayIndex);
                        if (match) return true;
                    }
                    currentStringArrayIndex++;
                } else {
                    wildcardSymbol = Character.MIN_VALUE;
                }
            }
        }
        return currentPatternArrayIndex == patternArray.length && currentStringArrayIndex == stringArray.length;
    }

    private boolean isNotValidArguments(String string, String pattern) {
        return string == null || pattern == null || (string.isEmpty() && !pattern.isEmpty()) || (!string.isEmpty() && pattern.isEmpty());
    }

    private boolean isNotValidPattern(String pattern) {
        return pattern.startsWith("*");
    }

    private boolean checkCornerCase(String string, String pattern) {
        return isFirstLettersMatching(string, pattern)
                && isLastLettersMatching(string, pattern)
                && !(pattern.indexOf('*') == -1 && pattern.indexOf('.') == -1 && string.length() != pattern.length());
    }

    private boolean isFirstLettersMatching(String string, String pattern) {
        boolean lettersMatching = isLettersMatching(string, pattern, 0, 0);
        if (!lettersMatching) {
            return pattern.length() > 1 && pattern.charAt(1) == '*';
        }
        return true;
    }

    private boolean isLastLettersMatching(String string, String pattern) {
        return isLettersMatching(string, pattern, string.length() - 1, pattern.length() - 1);
    }

    private boolean isLettersMatching(String string, String pattern, int stringIndex, int patternIndex) {
        char stringChar = string.charAt(stringIndex);
        char patternChar = pattern.charAt(patternIndex);
        if (isLetter(stringChar) && isLetter(patternChar)) {
            return stringChar == patternChar;
        }
        return true;
    }

    private boolean isLetter(char aChar) {
        return aChar >= 'a' && aChar <= 'z';
    }

}
