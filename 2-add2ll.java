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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode a1 = ans;
        int carry = 0;
        if(p1!=null && p2!=null){
            a1.val = p1.val + p2.val + carry;
            if(a1.val >=10){
                a1.val-=10;
                carry = 1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        if(a1!=null){
            while(p1!=null && p2!=null){
                ListNode newnode = new ListNode();
                a1.next = newnode;
                a1 = a1.next;
                a1.val = p1.val + p2.val + carry;
                if(a1.val >=10){
                    a1.val-=10;
                    carry = 1;
                }
                else carry = 0;
                p1 = p1.next;
                p2 = p2.next;
            }
            while(p1!=null){
                ListNode newnode = new ListNode();
                a1.next = newnode;
                a1 = a1.next;
                a1.val = p1.val+carry;
                if(a1.val >=10){
                    a1.val-=10;
                    carry = 1;
                }
                else carry = 0;
                p1 = p1.next;

            }
            while(p2!=null){
                ListNode newnode = new ListNode();
                a1.next = newnode;
                a1 = a1.next;
                a1.val = p2.val+carry;
                if(a1.val >=10){
                    a1.val-=10;
                    carry = 1;
                }
                else carry = 0;
                p2 = p2.next;
            }
            if(carry==1){
                ListNode newnode = new ListNode();
                a1.next = newnode;
                a1 = a1.next;
                a1.val = carry;
            }
        }
        return ans;
    }
}
