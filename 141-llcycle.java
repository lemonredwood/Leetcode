/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        Set address = new HashSet();
        if(head==null)return false;
        while(current.next!=null){
            if(address.contains(current.next))return true;
            address.add(current.next);
            current = current.next;
        }
        return false;
    }
}
