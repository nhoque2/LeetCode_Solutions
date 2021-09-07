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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        while(head!=null){
             list.add(new ListNode(head.val));
             head=head.next;
        }
        list.remove(list.size()-n);
        ListNode res = null;
        for(int i=list.size()-1;i>=0;i--){ 
            ListNode temp=new ListNode();
            temp.val=list.get(i).val;
            temp.next=res;
            res=temp;   
             
        }
        return res;
    }
}