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
        
        //Step 1: Finding linked list size
        ListNode curr = head;
        int count = 0;

        while(curr != null){
            count++;
            curr = curr.next;
        }

        //Step 2: Finding list2 (last half node)
        ListNode list1 = head;
        for(int i = 0; i < (count-1)/2; i++){
            list1 = list1.next;
        }

        //Step 3: reverse list2
        ListNode list2 = reverse(list1.next);
        list1.next = null;
        
        ListNode p1 = head;
        ListNode p2 = list2;

        while(p2 != null){
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }

    }

    private ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
/*
 0    1    2    3    4    5    6
 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6

 0 6 1 5 2 3 4
 0    1    2
 0 -> 1 -> 2
 
 0    1    2    3
 6 -> 5 -> 4 -> 3

 First: split the List into 2 
 Second: comparing and merge again
*/
