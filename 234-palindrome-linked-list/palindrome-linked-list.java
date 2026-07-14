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
    public ListNode reverse(ListNode head)
    {
        ListNode val=head.next;
        ListNode prev=head;
        head.next=null;
        head=val;
        while(head!=null)
        {
            val=head.next;
            head.next=prev;
            prev=head;
            head=val;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null)return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode start=reverse(slow.next);
        while(start!=null)
        {
            if(head.val!=start.val)
            {
                return false;
            }
            head=head.next;
            start=start.next;
        }
        return true;


    }
}