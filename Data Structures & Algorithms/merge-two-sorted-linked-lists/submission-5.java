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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                curr.next = list2;
                list2 = list2.next;
            }else{
                curr.next = list1;
                list1 = list1.next;
            }

            curr = curr.next;
        }

        if(list1 != null){
            curr.next = list1;
        }else if(list2 != null){
            curr.next = list2;
        }

        return dummy.next;
    }
}
/*
  l1
  1 --> 2 --> 4 -> 7 -> 8 -> 10 ...
  l2    
  1 --> 3 --> 5

  0 --> 1 --> 1
  l1 vs l2 
  Time complexity is O(m+n) where m and n is len of list 1 and 2 in order
  Space complexity is O(1) where we just re-link two list
*/