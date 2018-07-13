package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 12/07/2018
 * <p>
 * https://leetcode.com/problems/excel-sheet-column-title/description/
 * <p>
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: "A"
 * <p>
 * Example 2:
 * <p>
 * Input: 28
 * Output: "AB"
 * <p>
 * Example 3:
 * <p>
 * Input: 701
 * Output: "ZY"
 **/
public class ExcelSheetColumnTitle {

    public String convertToTitle(int n) {
        if (n <= 0) return null;
        StringBuilder stringBuilder = new StringBuilder();
        resolveNumber(n, stringBuilder);
        return stringBuilder.toString();
    }

    private void resolveNumber(int number, StringBuilder stringBuilder) {
        int resultNum = (number - 1) / 26;
        if (resultNum > 26) {
            resolveNumber(resultNum, stringBuilder);
            stringBuilder.append(getChar(number - resultNum * 26));
            return;
        } else if (resultNum > 0) {
            stringBuilder.append(getChar(resultNum));
        }
        stringBuilder.append(getChar(number - resultNum * 26));
    }

    private char getChar(int charValue) {
        return (char) (charValue + 64);
    }

}
