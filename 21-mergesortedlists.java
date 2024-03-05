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

class Linkedlist extends ListNode{
    ListNode head;
    public void insert(Linkedlist head,int data){
        Linkedlist newnode = new Linkedlist();
        newnode.val = data;
        if(head == null){
            head = newnode;
            return;
        }
        ListNode last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = newnode;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        Linkedlist ll = new Linkedlist();

        while(list1!=null && list2!=null){
            int min = Math.min(list1.val,list2.val);
            ll.insert(ll,min);
            if(min==list1.val)list1 = list1.next;
            else list2 = list2.next;
        }
        while(list1!=null){
            ll.insert(ll,list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            ll.insert(ll,list2.val);
            list2 = list2.next;
        }
        return ll.next;
    }
}


//My new Solution

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
        ListNode ans = new ListNode();
        ListNode current = ans;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        if(current!=null){
            while(ptr1!=null && ptr2!=null){
                current.next = new ListNode();
                if(current.next!=null)current=current.next;
                if(ptr1.val<ptr2.val){
                    current.val = ptr1.val;
                    ptr1=ptr1.next;
                }
                else{
                    current.val = ptr2.val;
                    ptr2=ptr2.next;
                }
                
            }
            while(ptr1!=null){
                current.next = new ListNode();
                if(current.next!=null)current=current.next;
                current.val = ptr1.val;
                ptr1=ptr1.next;
            }
            while(ptr2!=null){
                current.next = new ListNode();
                if(current.next!=null)current=current.next;
                current.val = ptr2.val;
                ptr2=ptr2.next;
            }
        }
        return ans.next;
    }
}
