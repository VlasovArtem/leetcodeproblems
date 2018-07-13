package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 13/07/2018
 *
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 *
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 *
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 *
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 *
 **/
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if (s == null || s.isEmpty()) throw new IllegalArgumentException("String is null or empty");
        int dataLength = s.length();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += getValue(s.charAt(i), dataLength - 1 - i);
        }
        return sum;
    }

    private int getValue(char aChar, int factor) {
        return (aChar - 64) * (int) Math.pow(26, factor);
    }

}
