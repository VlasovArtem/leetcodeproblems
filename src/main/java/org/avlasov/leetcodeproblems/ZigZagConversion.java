package org.avlasov.leetcodeproblems;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created By artemvlasov on 20/06/2018
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 *
 * And then read line by line: "P AHN A PLSIIG Y IR"
 *
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string s, int numRows);
 *
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 *
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 **/
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (s == null || numRows <= 0)
            throw new IllegalArgumentException("String argument should not be null or num rows less then or equals to zero.");
        if (s.isEmpty() || numRows == 1) return s;
        char[] chars = s.toCharArray();
        int length = chars.length;
        int rowNum = 0;
        boolean forward = true;
        Map<Integer, Character> data = new TreeMap<>();
        for (int i = 0; i < length; i++) {
            int index = rowNum * length + i;
            data.put(index, chars[i]);
            if (forward) rowNum++;
            else rowNum--;
            if (rowNum == 0) forward = true;
            if (rowNum == numRows - 1) forward = false;
        }
        StringBuilder stringBuilder = new StringBuilder(length);
        for (Character character : data.values()) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

}
