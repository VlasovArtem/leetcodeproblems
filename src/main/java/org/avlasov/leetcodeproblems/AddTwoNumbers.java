package org.avlasov.leetcodeproblems;

import org.avlasov.leetcodeproblems.data.ListNode;

/**
 * Created By artemvlasov on 20/06/2018
 **/
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) throw new IllegalArgumentException("Argument list node should not be null");
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        int movedNumber = 0;
        while (l1 != null || l2 != null) {
            int l1Element = 0;
            int l2Element = 0;
            if (l1 != null) {
                l1Element = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                l2Element = l2.val;
                l2 = l2.next;
            }
            int sum = (l1Element + l2Element + movedNumber) % 10;
            movedNumber = (l1Element + l2Element + movedNumber) / 10;
            temp.next = new ListNode(sum);
            temp = temp.next;
        }
        if (movedNumber != 0)
            temp.next = new ListNode(1);
        return result.next;
    }

    public ListNode addTwoNumbersFasterSolution(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) throw new IllegalArgumentException("Argument list node should not be null");
        boolean hasDataInMemory = false;
        ListNode l1Last = l1;
        ListNode l2Last = l2;
        ListNode lastResultNode = null;
        ListNode resultNode = null;
        while (l1Last != null || l2Last != null || hasDataInMemory) {
            int l1Element = 0;
            int l2Element = 0;
            if (l1Last != null) {
                l1Element = l1Last.val;
                l1Last = l1Last.next;
            }
            if (l2Last != null) {
                l2Element = l2Last.val;
                l2Last = l2Last.next;
            }
            int sum = l1Element + l2Element;
            if (hasDataInMemory) {
                sum++;
                hasDataInMemory = false;
            }
            if (sum >= 10) {
                sum = sum % 10;
                hasDataInMemory = true;
            }
            ListNode result = new ListNode(sum);
            if (resultNode == null) {
                resultNode = lastResultNode = result;
            } else {
                lastResultNode.next = result;
                lastResultNode = result;
            }
        }
        return resultNode;
    }

}
