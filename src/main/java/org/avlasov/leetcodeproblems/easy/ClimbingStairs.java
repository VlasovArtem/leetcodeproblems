package org.avlasov.leetcodeproblems.easy;

/**
 * Created By artemvlasov on 30/06/2018
 **/
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n < 0) throw new IllegalArgumentException("Numbers could not be negative.");
        if (n == 0) return 0;
        int prevNumber = 0;
        int sum = 1;
        for (int i = 0; i < n; i++) {
            int temp = sum;
            sum += prevNumber;
            prevNumber = temp;
        }
        return sum;
    }

}
