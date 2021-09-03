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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        else if(lists.length==1 && lists[0]==null){
            return null;   
        }
            
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(list);  
        ListNode res = null;
        for(int i=list.size()-1;i>=0;i--){
             res=insertNode(res, list.get(i));
        }
        return res;
    }
    public ListNode insertNode(ListNode node, int val){
        ListNode temp = new ListNode();
        temp.val=val;
        temp.next=node;
        node=temp;
        return node;
    }
}