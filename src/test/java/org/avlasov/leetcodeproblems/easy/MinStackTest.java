package org.avlasov.leetcodeproblems.easy;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 10/07/2018
 **/
public class MinStackTest {

    private MinStack minStack;

    @Before
    public void setUp() throws Exception {
        minStack = new MinStack();
    }

    @Test
    public void push() {
        minStack.push(1);
        minStack.push(2);
        minStack.push(-3);
        minStack.push(5);
        assertEquals(-3, minStack.getMin());
        assertEquals(5, minStack.top());
        minStack.pop();
        minStack.pop();
        assertEquals(1, minStack.getMin());
        assertEquals(2, minStack.top());
    }

    @Test
    public void pop() {
        minStack.push(1);
        minStack.push(2);
        minStack.push(-3);
        minStack.push(5);
        assertEquals(5, minStack.top());
        minStack.pop();
        assertEquals(-3, minStack.top());
        minStack.pop();
        assertEquals(2, minStack.top());
        minStack.pop();
        assertEquals(1, minStack.top());
        minStack.pop();
    }

    @Test
    public void top() {
        minStack.push(10);
        assertEquals(10, minStack.top());
        minStack.push(12);
        minStack.push(15);
        assertEquals(15, minStack.top());
    }

    @Test(expected = EmptyStackException.class)
    public void top_WithEmptyStack_ThrowsEmptyStackException() {
        minStack.top();
    }

    @Test
    public void getMin() {
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.push(-1);
        assertEquals(-3, minStack.getMin());
        minStack.push(-5);
        assertEquals(-5, minStack.getMin());
    }

    @Test(expected = EmptyStackException.class)
    public void getMin_WithEmptyStack_ThrowsEmptyStackException() {
        minStack.getMin();
    }
}