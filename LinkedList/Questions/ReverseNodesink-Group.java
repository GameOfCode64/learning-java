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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null){
            return head;
        }


        int size = 0;
        ListNode current = head;

        while(current != null){
            size++;
            current = current.next;
        }

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode before = dummy;

        while(size >= k){
            current = before.next; 
            ListNode nextNode = null; 
            for(int i = 0; i < k - 1; i++){
                nextNode = current.next; 
                current.next = nextNode.next;
                nextNode.next = before.next; 
                before.next = nextNode; 
            }

            before = current;
            size = size - k;
        }

       return dummy.next;
        
    }
}