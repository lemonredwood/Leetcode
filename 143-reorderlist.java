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
        if(head==null || head.next==null || head.next.next==null)return;
        ListNode slow = head;
        ListNode fast = head;
        List<Integer> list = new ArrayList();
        Stack<Integer> st = new Stack();
        while(fast!=null && fast.next!=null){
            list.add(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        while(slow!=null){
            st.push(slow.val);
            slow=slow.next;
        }
        ListNode current = head;
        while(current!=null){
            if(list.size()>0){
                current.val=list.get(0);
                list.remove(0);
                current=current.next;
            }
            if(!st.isEmpty() && current!=null)current.val=st.pop();
            else break;
            current=current.next;
        }
    }
}
