package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;
import org.avlasov.leetcodeproblems.utils.MergeTwoSortedListsTestUtils;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;

import static org.avlasov.leetcodeproblems.utils.ListNodeUtils.createListNode;
import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;
    private MergeTwoSortedListsTestUtils mergeTwoSortedListsTestUtils;

    public MergeTwoSortedListsTest() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedListsTestUtils = new MergeTwoSortedListsTestUtils();
    }

    @Test
    public void mergeTwoLists_WithValidData1_ReturnListNode() {
        ListNode listNode1 = createListNode(1, 2, 4);
        ListNode listNode2 = createListNode(1, 3, 4);
        ListNode result = createListNode(1, 1, 2, 3, 4, 4);
        assertEquals(result, mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }

    @Test
    public void mergeTwoLists_WithValidData2_ReturnListNode() {
        ListNode listNode1 = createListNode(1, 2, 4, 9, 10);
        ListNode listNode2 = createListNode(1, 3, 4);
        ListNode result = createListNode(1, 1, 2, 3, 4, 4, 9, 10);
        assertEquals(result, mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }

    @Test
    public void mergeTwoLists_WithValidData3_ReturnListNode() {
        ListNode listNode1 = createListNode(1, 2, 4);
        ListNode listNode2 = createListNode(1, 3, 4, 5, 11);
        ListNode result = createListNode(1, 1, 2, 3, 4, 4, 5, 11);
        assertEquals(result, mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }

    @Test
    public void mergeTwoLists_WithValidData4_ReturnListNode() {
        ListNode listNode1 = createListNode(9);
        ListNode listNode2 = createListNode(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode result = createListNode(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(result, mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2));
    }

    @Test
    public void mergeTwoLists_WithValidData5_ReturnListNode() throws IOException {
        ListNode listNode1 = readData("MergeTwoSortedLists_100_List_1.txt");
        ListNode listNode2 = readData("MergeTwoSortedLists_100_List_2.txt");
        ListNode result = readData("MergeTwoSortedLists_100_Result.txt");
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        assertNotNull(listNode);
        assertEquals(result, listNode);
    }

    @Test
    public void mergeTwoLists_WithValidData6_ReturnListNode() throws IOException {
        ListNode listNode1 = readData("MergeTwoSortedLists_1000_List_1.txt");
        ListNode listNode2 = readData("MergeTwoSortedLists_1000_List_2.txt");
        ListNode result = readData("MergeTwoSortedLists_1000_Result.txt");
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(listNode1, listNode2);
        assertNotNull(listNode);
        assertEquals(result, listNode);
    }

    @Test
    public void mergeTwoLists_WithNullList1_ReturnList2() {
        ListNode listNode = createListNode(1, 2);
        assertEquals(listNode, mergeTwoSortedLists.mergeTwoLists(null, listNode));
    }

    @Test
    public void mergeTwoLists_WithNullList2_ReturnList1() {
        ListNode listNode = createListNode(1, 2);
        assertEquals(listNode, mergeTwoSortedLists.mergeTwoLists(listNode, null));
    }

    @Test
    public void mergeTwoLists_WithNullList1AndList2_ReturnNull() {
        assertNull(mergeTwoSortedLists.mergeTwoLists(null, null));
    }
    
    @Test
    public void mergeTwoListsSecondSolution_WithValidData1_ReturnListNode() {
        ListNode listNode1 = createListNode(1, 2, 4);
        ListNode listNode2 = createListNode(1, 3, 4);
        ListNode result = createListNode(1, 1, 2, 3, 4, 4);
        assertEquals(result, mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode1, listNode2));
    }

    @Test
    public void mergeTwoListsSecondSolution_WithValidData2_ReturnListNode() {
        ListNode listNode1 = createListNode(1, 2, 4, 9, 10);
        ListNode listNode2 = createListNode(1, 3, 4);
        ListNode result = createListNode(1, 1, 2, 3, 4, 4, 9, 10);
        assertEquals(result, mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode1, listNode2));
    }

    @Test
    public void mergeTwoListsSecondSolution_WithValidData3_ReturnListNode() {
        ListNode listNode1 = createListNode(1, 2, 4);
        ListNode listNode2 = createListNode(1, 3, 4, 5, 11);
        ListNode result = createListNode(1, 1, 2, 3, 4, 4, 5, 11);
        assertEquals(result, mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode1, listNode2));
    }

    @Test
    public void mergeTwoListsSecondSolution_WithValidData4_ReturnListNode() {
        ListNode listNode1 = createListNode(9);
        ListNode listNode2 = createListNode(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode result = createListNode(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(result, mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode1, listNode2));
    }

    @Test
    public void mergeTwoListsSecondSolution_WithValidData5_ReturnListNode() throws IOException {
        ListNode listNode1 = readData("MergeTwoSortedLists_100_List_1.txt");
        ListNode listNode2 = readData("MergeTwoSortedLists_100_List_2.txt");
        ListNode result = readData("MergeTwoSortedLists_100_Result.txt");
        ListNode listNode = mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode1, listNode2);
        assertNotNull(listNode);
        assertEquals(result, listNode);
    }

    @Test
    public void mergeTwoListsSecondSolution_WithValidData6_ReturnListNode() throws IOException {
        ListNode listNode1 = readData("MergeTwoSortedLists_1000_List_1.txt");
        ListNode listNode2 = readData("MergeTwoSortedLists_1000_List_2.txt");
        ListNode result = readData("MergeTwoSortedLists_1000_Result.txt");
        ListNode listNode = mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode1, listNode2);
        assertNotNull(listNode);
        assertEquals(result, listNode);
    }

    @Test
    public void mergeTwoListsSecondSolution_WithNullList1_ReturnList2() {
        ListNode listNode = createListNode(1, 2);
        assertEquals(listNode, mergeTwoSortedLists.mergeTwoListsSecondSolution(null, listNode));
    }

    @Test
    public void mergeTwoListsSecondSolution_WithNullList2_ReturnList1() {
        ListNode listNode = createListNode(1, 2);
        assertEquals(listNode, mergeTwoSortedLists.mergeTwoListsSecondSolution(listNode, null));
    }

    @Test
    public void mergeTwoListsSecondSolution_WithNullList1AndList2_ReturnNull() {
        assertNull(mergeTwoSortedLists.mergeTwoListsSecondSolution(null, null));
    }

    private ListNode readData(String filename) throws IOException {
        URL resource = MergeTwoSortedListsTest.class.getResource(filename);
        if (resource != null) {
            return mergeTwoSortedListsTestUtils.readIntsAsListNode(resource.getFile());
        }
        return new ListNode(0);
    }

}