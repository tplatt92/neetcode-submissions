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
        HashSet<ListNode> nodeSet = new HashSet<>();
        ListNode cur = head;

        while(cur != null){
            if(nodeSet.contains(cur)){
                return true;
            } 
            nodeSet.add(cur);
            cur = cur.next;
        }
        return false; 
    }
}


// cycle through the nodes
// map - index -> val: if map.val exists in map -> return true;
// if not - add to Ma
// if null return false
// how do we find out if the tail node links back to a previous node? 
// comparing values? if curr.val >= list.next()