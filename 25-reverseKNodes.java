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
    public ListNode getKth(ListNode current,int k){
        while(current!=null && k>0){
            current=current.next;
            k--;
        }
        return current;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next==null)return head;
        ListNode dummy = new ListNode(0,head);
        ListNode groupPrev = dummy;
        while(true){
            
            //Finding the next kth element
            ListNode kth = getKth(groupPrev,k);
            if(kth==null)break;
            
            //Storing the first element of the next group
            ListNode groupNext = kth.next;

            //Reversing the group
            ListNode current = groupPrev.next;
            ListNode prev = groupNext;
            while(current!=groupNext){
                ListNode temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        
        return dummy.next;
    }
}
