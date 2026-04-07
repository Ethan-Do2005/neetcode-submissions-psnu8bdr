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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev; // curr.next in here is the arrow not the fixed value 
                              //it means curr.next: point the curr value to prev value
            prev = curr;
            curr = next;
        }

        return prev;
    }
}


/*
[0 -> 1 -> 2 -> 3 -> null]
by using temp

prev: [ 3 -> 2 -> 1 -> null]

*/