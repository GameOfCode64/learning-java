public class RemoveDup {
// Leetcode 83. Remove Duplicates from Sorted List
    public ListNode deleteDuplicates(ListNode node) {
        if(node == null){
            return node;
        }
        ListNode head = node;

        while(node.next != null){
            if(node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}