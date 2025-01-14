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
    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode> address = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            address.add(temp);
            temp = temp.next;
        }
        int size = address.size();
        for (int i = 0; i < size / 2; i++) {
            if (address.get(i).val != address.get(size - i - 1).val) {
                return false;
            }
        }
        return true;
    }
}
