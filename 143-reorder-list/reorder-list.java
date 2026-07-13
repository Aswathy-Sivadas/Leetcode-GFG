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
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;int c=0;
        while(temp!=null)
        {
            st.push(temp);
            temp=temp.next;
            c++;
        }
        ListNode main=head;
        for(int i=0;i<c/2;i++)
        {
            temp=head.next;
            if(temp==st.peek())
            {
            head.next=st.pop();
            head=head.next;
            break;}
            else{
            head.next=st.pop();
            head.next.next=temp;
            head=head.next.next;
            }
        }
        head.next=null;
        head=main;
    }
}