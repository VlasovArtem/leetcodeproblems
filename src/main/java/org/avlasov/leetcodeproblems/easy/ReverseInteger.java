package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 21/06/2018
 **/
public class ReverseInteger {

    public int reverse(int x) {
        int sum = 0;
        while (x != 0) {
            if (Integer.MAX_VALUE < ((long) sum) * 10 || Integer.MIN_VALUE > ((long) sum) * 10) return 0;
            sum *= 10;
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }

}
