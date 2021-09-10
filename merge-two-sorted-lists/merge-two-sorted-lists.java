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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<>();
        while(l1!=null){
            list.add(l1.val);
            l1=l1.next; 
        }
         while(l2!=null){
            list.add(l2.val);
            l2=l2.next; 
        }
        Collections.sort(list);
        ListNode res = null;
        for(int i=list.size()-1;i>=0;i--){ 
            ListNode temp=new ListNode();
            temp.val=list.get(i);
            temp.next=res;
            res=temp;      
        }
        return res;
        
    }
}