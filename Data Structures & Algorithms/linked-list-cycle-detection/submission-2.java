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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head; 

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
//     f
// 1 2 3 4

// cur == null
// next == null

// cycle through the nodes
// map - index -> val: if map.val exists in map -> return true;
// if not - add to Ma
// if null return false
// how do we find out if the tail node links back to a previous node? 
// comparing values? if curr.val >= list.next()