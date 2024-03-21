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
        if(head==null || head.next==null)return head;
        ListNode current = new ListNode();
        ListNode np = head;
        ListNode pp = null;
        while(np!=null){
            if(np!=null)current = np.next;
            else break;
            np.next = pp;
            pp = np;
            np = current;
        }
        return pp;
    }
}
