package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;
import org.avlasov.leetcodeproblems.utils.ListNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 10/07/2018
 **/
public class LinkedListCycleTest {

    private LinkedListCycle linkedListCycle;

    public LinkedListCycleTest() {
        linkedListCycle = new LinkedListCycle();
    }

    @Test
    public void hasCycle_WithCycle1_ReturnTrue() {
        ListNode listNode = ListNodeUtils.createListNode(1, 2, 3, 4, 5);
        ListNode last = listNode;
        do {
            last = last.next;
        } while (last.next != null);
        last.next = listNode;
        assertTrue(linkedListCycle.hasCycle(listNode));
    }

    @Test
    public void hasCycle_WithoutCycle1_ReturnTrue() {
        assertFalse(linkedListCycle.hasCycle(ListNodeUtils.createListNode(1, 2, 3, 4)));
    }

    @Test
    public void hasCycle_WithNullHead_ReturnFalse() {
        assertFalse(linkedListCycle.hasCycle(null));
    }

}