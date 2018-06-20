package org.avlasov.leetcodeproblems;

/**
 * Created By artemvlasov on 20/06/2018
 **/
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1)
                sum++;
        }
        return sum;
    }

}
