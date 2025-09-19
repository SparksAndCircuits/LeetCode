package leetcode.easy;
/*
 * LeetCode question 21: Merge Two Sorted Lists
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing together nodes of the first two lists.
 * 
 * Return the head of the merged linked list.
 */

public class MergeTwoLists {
    public ListNode head;
    public ListNode tail;
    public int size;

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode node = new ListNode();
        ListNode tempNode = head;

        for(int i = 0; i < list1.size; i++){
            for(int j = 0; j < list2.size; j++){
                if(list1.val < list2.val){
                    tempNode = head;
                    head = node;
                }else if(list2.val < list1.val){
                    tempNode = head;
                    head = node;
                }
            }
        }

        return head;
    }
}
