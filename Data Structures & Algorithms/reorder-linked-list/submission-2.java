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
        //Base Case:
        if(head == null || head.next == null){
            return;
        }
        //Step 1: Divide LL into sublists
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode list1 = head;
        ListNode list2 = slow.next;
        slow.next = null;

        //Step 2: Reverse
        ListNode prev = null;
        ListNode curr = list2;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode rev_list2 = prev;

        //Step 3: Merge
        ListNode p1 = list1;
        ListNode p2 = rev_list2;

        while(p1 != null && p2!= null){
            ListNode n1 = p1.next;
            ListNode n2 = p2.next;

            p1.next = p2;
            p2.next = n1;

            p1 = n1;
            p2 = n2;
        }
    }
}
/*
Test case 1 [0,1,2,3,4,5]
Output: [0,5,1,4,2,3]

My idea:
Step 1: Divide LL into sublists
list1: [0,1,2,3]
list2: [4,5]

Step 2: Reverse list2
list2: [5,4]

Step 3: Merge two sublists


*/