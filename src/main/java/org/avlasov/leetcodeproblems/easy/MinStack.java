package org.avlasov.leetcodeproblems.easy;

import java.util.Stack;

/**
 * Created By artemvlasov on 10/07/2018
 * <p>
 * https://leetcode.com/problems/min-stack/description/
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * Example:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 **/
public class MinStack {

    private Stack<MinNode> minNodes;

    public MinStack() {
        minNodes = new Stack<>();
    }

    public void push(int x) {
        if (minNodes.isEmpty()) {
            minNodes.push(new MinNode(x, x));
        } else {
            MinNode minNode;
            if (x < getMin()) {
                minNode = new MinNode(x, x);
            } else {
                minNode = new MinNode(x, getMin());
            }
            minNodes.push(minNode);
        }
    }

    public void pop() {
        minNodes.pop();
    }

    public int top() {
        return minNodes.peek().value;
    }

    public int getMin() {
        return minNodes.peek().minNodesValue;
    }


    private class MinNode {

        private int value;
        private int minNodesValue;

        public MinNode(int value, int minNodesValue) {
            this.value = value;
            this.minNodesValue = minNodesValue;
        }
    }

}
