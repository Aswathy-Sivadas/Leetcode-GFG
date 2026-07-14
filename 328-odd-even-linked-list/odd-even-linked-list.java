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
    public ListNode oddEvenList(ListNode head) {
        Queue<ListNode> ls=new LinkedList<>();
        if(head==null)return head;
        int c=1;
        ListNode temp=head;
        while(temp!=null)
        {
            if(c%2==0)
            {
                ls.add(temp);
                
            }
            temp=temp.next;
            c++;
        }
        int i=1;
        temp=head;
        ListNode prev=head;
        
        while(head!=null)
        {
            if(i%2!=0 && i!=1)
            {

                prev.next=head;
                prev=head;
            }
            head=head.next;
            i++;
        }
        while(!ls.isEmpty())
        {
            ListNode node=ls.poll();
            prev.next=node;
            prev=node;
        }
        prev.next=null;
        return temp;
    }
}