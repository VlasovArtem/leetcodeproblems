package org.avlasov.leetcodeproblems;

/**
 * Created By artemvlasov on 21/06/2018
 **/
public class StringToInteger {

    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
        int i = 0, length = str.length();
        boolean isNegative = false;
        char[] chars = str.toCharArray();
        while (i < length && chars[i] == ' ') i++;
        if (i < length) {
            if (chars[i] == '-') {
                isNegative = true;
                i++;
            } else if (chars[i] == '+')
                i++;
        }
        long sum = 0;
        while (i < length && chars[i] >= '0' && chars[i] <= '9'){
            int number = chars[i] - '0';
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            sum = 10 * sum + number;
            i++;
        }
        return (int) (isNegative ? -sum : sum);
    }

}
