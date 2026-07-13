/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        HashMap<Node,Integer>hm=new HashMap<>();int t=1;
        while(head!=null && head.next!=null)
        {
            if(!hm.containsKey(head))
            {
            hm.put(head,t);t++;
            head=head.next;
            }
            else{
           
            int n=hm.get(head);
            return (t-n);}
            
        }
        return 0;
    }
}