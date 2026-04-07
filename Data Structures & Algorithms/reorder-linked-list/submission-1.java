/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        //Step 1: find the middle and cut into half
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null; // break head1 and head2 into 2 linkedlist

        //Step 2: reverse the second half linkedlist
        ListNode prev = null;
        ListNode curr2 = head2;
        while(curr2 != null){
            ListNode next = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = next;
        }

        // calling reversing value 
        ListNode headR = prev;

        //Step 3: Merge two halves:
        ListNode p1 = head, p2 = headR;
        while(p2 != null){
            ListNode n1 = p1.next, n2 = p2.next;
            p1.next = p2;
            if(n1 != null) p2.next = n1;
            p1 = n1;
            p2 = n2;
        }

    }
}

/*
for loop
    int count = -1;
    if index-th is even
        count++;
        curr.next = reorderList(curr.next);
        return count;
    else index-th is odd
        curr.next = reorderList(curr.next);
        return curr;


*/