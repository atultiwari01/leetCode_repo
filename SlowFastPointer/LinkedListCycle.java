/**
 * Definition for singly-linked list.
 * class LinkedNode {
 *     int val;
 *     LinkedNode next;
 *     LinkedNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class  {
    public boolean hasCycle(LinkedNode head) {
        if(head==null) return false;
        LinkedList slow = head;
        LinkedList fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
