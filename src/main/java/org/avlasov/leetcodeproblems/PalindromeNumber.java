package org.avlasov.leetcodeproblems;

/**
 * Created By artemvlasov on 21/06/2018
 **/
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        int div = 1;
//        int div = (int) Math.pow(10, (int) Math.log10(x));
        while (x / div >= 10) div *= 10;
        while (x != 0) {
            int first = x / div;
            int last = x % 10;
            if (last != first) return false;
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }

}
