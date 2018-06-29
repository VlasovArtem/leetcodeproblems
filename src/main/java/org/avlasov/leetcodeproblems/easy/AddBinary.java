package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 29/06/2018
 *
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 **/
public class AddBinary {

    public String addBinary(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) return "";
        String longest = a;
        String shortest = b;
        if (a.length() < b.length()) {
            longest = b;
            shortest = a;
        }
        int diff = longest.length() - shortest.length();
        StringBuilder result = new StringBuilder();
        boolean hasFloatingNumber = false;
        for (int i = longest.length() - 1; i >= 0; i--) {
            char longestChar = longest.charAt(i);
            char shortestChar = '0';
            char resultChar = longestChar;
            if (i - diff >= 0) {
                shortestChar = shortest.charAt(i - diff);
            }
            if (shortestChar == '1' && longestChar == '1') {
                if (!hasFloatingNumber) {
                    resultChar = '0';
                }
                hasFloatingNumber = true;
            } else if (shortestChar == '0' && longestChar == '0') {
                if (hasFloatingNumber) {
                    resultChar = '1';
                    hasFloatingNumber = false;
                }
            } else {
                if (hasFloatingNumber) {
                    resultChar = '0';
                } else {
                    resultChar = '1';
                }
            }
            result.append(resultChar);
        }
        if (hasFloatingNumber)
            result.append('1');
        return result.reverse().toString();
    }

}
