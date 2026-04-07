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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;

        //Step 1: counting down n to 0: to find the deleted n-th index
        while(n > 0){
            right = right.next;
            n--;
        }

        //Step 2: Indirect step since we using while loop to determine the 
        // node that we will delete (or skip)
        while(right != null){
            left = left.next;
            right = right.next;
        }

        //Step 3: skip deleted node by determining previous node based on step 2
        left.next = left.next.next;

        return dummy.next;


    }
}
