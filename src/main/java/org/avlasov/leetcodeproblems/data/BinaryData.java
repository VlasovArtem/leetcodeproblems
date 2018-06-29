package org.avlasov.leetcodeproblems.data;

/**
 * Created By artemvlasov on 29/06/2018
 **/
public class BinaryData {

    private int first;
    private String firstString;
    private int second;
    private String secondString;
    private int result;
    private String resultString;

    public BinaryData() {
    }

    public BinaryData(int first, int second) {
        this.first = first;
        this.second = second;
        this.result = first + second;
        this.firstString = Integer.toBinaryString(first);
        this.secondString = Integer.toBinaryString(second);
        this.resultString = Integer.toBinaryString(result);
    }

    public int getFirst() {
        return first;
    }

    public String getFirstString() {
        return firstString;
    }

    public int getSecond() {
        return second;
    }

    public String getSecondString() {
        return secondString;
    }

    public int getResult() {
        return result;
    }

    public String getResultString() {
        return resultString;
    }

}
